package ch.hslu.reviews;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomManagementTest {

    @Test
    void testConstructorWithInitialRoom() {
        RoomManagement management = new RoomManagement();
        Room room = new Room(666, 12);
        management.addRoom(room);

        Room retrievedRoom = management.getRoom(666);
        assertNotNull(retrievedRoom, "Room should not be null");
        assertEquals(666, retrievedRoom.getRoomNumber(), "Room number should be 666");
        assertEquals(12, retrievedRoom.getCapacity(), "Room capacity should be 12");
    }

    @Test
    void testAddRoom() {
        RoomManagement management = new RoomManagement();
        Room room = new Room(666, 12);

        Room previousRoom = management.addRoom(room);

        assertNull(previousRoom, "No previous room should exist");
        assertEquals(room, management.getRoom(666), "Added room should be retrievable");
    }

    @Test
    void testAddRoomReplaceExisting() {
        RoomManagement management = new RoomManagement();
        Room firstRoom = new Room(666, 12);
        Room secondRoom = new Room(666, 15);

        management.addRoom(firstRoom);
        Room replacedRoom = management.addRoom(secondRoom);

        assertEquals(firstRoom, replacedRoom, "Should return the replaced room");
        assertEquals(15, management.getRoom(666).getCapacity(), "New room should have updated capacity");
    }

    @Test
    void testAddRoomNull() {
        RoomManagement management = new RoomManagement();

        assertThrows(IllegalArgumentException.class,
                () -> management.addRoom(null),
                "Adding null room should throw IllegalArgumentException");
    }

    @Test
    void testRemoveRoom() {
        RoomManagement management = new RoomManagement();
        Room room = new Room(666, 12);
        management.addRoom(room);

        Room removedRoom = management.removeRoom(666);

        assertEquals(room, removedRoom, "Removed room should match original room");
        assertThrows(IllegalArgumentException.class,
                () -> management.getRoom(666),
                "Getting removed room should throw IllegalArgumentException");
    }

    @Test
    void testRemoveNonexistentRoom() {
        RoomManagement management = new RoomManagement();

        Room removedRoom = management.removeRoom(666);

        assertNull(removedRoom, "Removing nonexistent room should return null");
    }

    @Test
    void testGetNonexistentRoom() {
        RoomManagement management = new RoomManagement();

        assertThrows(IllegalArgumentException.class,
                () -> management.getRoom(666),
                "Getting nonexistent room should throw IllegalArgumentException");
    }
}