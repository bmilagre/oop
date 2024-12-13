package ch.hslu.reviews;

import java.util.EventObject;

/**
 * Event for changes of Room
 */
public class RoomEvent extends EventObject {
    private static final long serialVersionUID = 1L;
    private Room room;
    private int capacity;

    public RoomEvent(final Object source, Room room, int capacity) {
        super(source);
        this.room = room;
        this.capacity = capacity;
    }

    public Room getRoom() {
        return room;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "RoomEvent [room=" + room + "]";
    }
}
