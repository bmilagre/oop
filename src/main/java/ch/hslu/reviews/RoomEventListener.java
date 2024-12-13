package ch.hslu.reviews;

/**
 * Listener interface for room events
 */
public interface RoomEventListener {
    /**
     * Handles the room event
     * @param roomEvent
     */
    void handleRoomEvent(RoomEvent roomEvent);
}
