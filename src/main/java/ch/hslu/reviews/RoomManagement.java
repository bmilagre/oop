package ch.hslu.reviews;

import java.util.TreeMap;

/**
 * Manages a collection of Room objects using a TreeMap for efficient access and automatic sorting.
 * Rooms are indexed by their room number for quick retrieval.
 */
public class RoomManagement {
    private final TreeMap<Integer, Room> rooms;

    /**
     * Constructor of room management.
     */
    public RoomManagement() {
        this.rooms = new TreeMap<>();
    }

    /**
     * Adds a room to the management system.
     * If a room with the same number already exists, it will be replaced.
     *
     * @param room The room to add
     * @return The previously stored room with the same number, if any
     */
    public Room addRoom(final Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room cannot be null");
        }

        return rooms.put(room.getRoomNumber(), room);
    }

    /**
     * Removes a room by its room number.
     *
     * @param roomNumber The number of the room to remove
     * @return The removed room, if it existed
     */
    public Room removeRoom(final int roomNumber) {
        return rooms.remove(roomNumber);
    }

    /**
     * Retrieves a room by its room number.
     *
     * @param roomNumber The number of the room to find
     * @return Room containing the room if found, IllegalArgumentException otherwise
     */
    public Room getRoom(final int roomNumber) {
        if (!this.rooms.containsKey(roomNumber)) {
            throw new IllegalArgumentException("Room with number " + roomNumber + " does not exist");
        }

        return this.rooms.get(roomNumber);
    }

    /**
     * Finds the best available room for the specified number of persons.
     *
     * @param amountPersons The number of persons the room should accommodate.
     * @return The best available room, or null if no suitable room is found.
     */
    public Room getBestAvailableRoomForAmountPersons(int amountPersons) {
        if (amountPersons <= 0) {
            throw new IllegalArgumentException("Amount of persons must be greater than zero");
        }

        Room bestRoom = null;

        for (Room room : rooms.values()) {
            int capacity = room.getCapacity();
            if (room.getState() == RoomState.AVAILABLE && capacity >= amountPersons && (bestRoom == null || capacity < bestRoom.getCapacity())) {
                bestRoom = room;
            }
        }

        return bestRoom; // Returns null if no available room matches the criteria
    }

    public boolean unlockRoomState(Room room){
        room.setState(RoomState.AVAILABLE);
        return room.getState() == RoomState.AVAILABLE;
    }
}
