package ch.hslu.reviews;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

final class RoomTest {
    @Test
    void testIfRoomHasNumberSetCorrectly(){
        assertEquals(111, new Room(111, 20).getRoomNumber());
    }

    @Test
    void testIfRoomHasCapacitySetCorrectly(){
        assertEquals(20, new Room(111, 20).getCapacity());
    }

    @Test
    void testIfRoomOnlyAllowsNumberBetween100and999(){
        assertThatThrownBy(() -> {
            new Room(7, 20);
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("Room number must be between 100 and 999!");
    }

    @Test
    void testIfRoomOnlyAllowsCapacityOverTwo(){
        assertThatThrownBy(() -> {
            new Room(111, 2);
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("Room capacity must be over 2!");
    }

    @Test
    void testIfRoomIsTheSame(){
        Room roomOne = new Room(111, 10);
        Room roomTwo = new Room(111, 30);
        assertEquals(roomOne, roomTwo);
    }

    @Test
    void testIfRoomIsNotTheSame(){
        Room roomOne = new Room(111, 66);
        Room roomTwo = new Room(134, 66);
        assertNotEquals(roomOne, roomTwo);
    }
}