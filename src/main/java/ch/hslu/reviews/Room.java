package ch.hslu.reviews;

import java.util.Objects;

/**
 * Represents a Room with a unique room number and a specified capacity.
 * Provides validation to ensure room numbers and capacities are within specific bounds.
 */
public class Room {
    private final int roomNumber;  // Unique identifier for the room, must be within 100-999.
    private final int capacity;    // Number of people the room can hold, must be at least 3.
    private RoomState state;

    /**
     * Constructor for Room.
     * Validates and sets the room number and capacity.
     *
     * @param roomNumber Unique identifier for the room, must be between 100 and 999.
     * @param capacity The capacity of the room, must be 3 or more.
     * @throws IllegalArgumentException if roomNumber or capacity are outside the specified bounds.
     */
    protected Room(final int roomNumber, final int capacity) {
        if(roomNumber < 100 || roomNumber > 999) {
            throw new IllegalArgumentException("Room number must be between 100 and 999!");
        }

        if(capacity < 3) {
            throw new IllegalArgumentException("Room capacity must be over 2!");
        }

        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.state = RoomState.AVAILABLE;
    }

    /**
     * Gets the room number.
     *
     * @return The room number.
     */
    protected int getRoomNumber() {
        return this.roomNumber;
    }

    /**
     * Gets the capacity of the room.
     *
     * @return The room capacity.
     */
    protected int getCapacity() {
        return this.capacity;
    }

    /**
     * Sets the state of the room
     *
     */
    protected void setState(RoomState state) {
        this.state = state;
    }

    /**
     * Gets the room state
     *
     * @return The room state.
     */
    public RoomState getState() {
        return this.state;
    }

    public static boolean isAvailable(Room room) {
        return room.getState() == RoomState.AVAILABLE;
    }

    /**
     * Checks if two Room objects are equal based on their room numbers.
     *
     * @param object Object to compare with.
     * @return true if room numbers are equal, false otherwise.
     */
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Room room)) {
            return false;
        }

        return Objects.equals(room.roomNumber, this.roomNumber) && Objects.equals(room.capacity, this.capacity) && Objects.equals(state, room.state);
    }

    /**
     * Returns a hash code value for the Room.
     * This includes both room number and capacity for unique identification.
     *
     * @return Hash code of the room.
     */
    public int hashCode(){
        return Objects.hash(this.roomNumber, this.capacity, this.state);
    }
}
