package ch.hslu.exercise.sw06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class DemoTest {

    /**
     * Checks if the higher number, in this case the 4 is returned back
     */
    @Test
    void testIfMaxReturnsHigherNumberFirst(){
       assertEquals(new Demo().max(4, 2), 4);
    }

    /**
     * Checks if the same number is returned when equals
     */
    @Test
    void testIfMaxReturnsLowerNumberFirst(){
        assertEquals(new Demo().max(2, 2), 2);
    }

    /**
     * Checks if correct negative number is returned
     */
    @Test
    void testIfMaxReturnsHighestNegativeNumberFirst(){
        assertEquals(new Demo().max(-5, -3), -3);
    }
}