package ch.hslu.exercise.sw07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void testIfObjectEqualsPointObject() {
        Point examplePoint = new Point(4, 4);
        assertTrue(examplePoint.equals(examplePoint));
    }

    @Test
    void testIfObjectNotEqualsPointObject() {
        Point examplePoint = new Point(4, 4);
        Object exampleObject = new Object();
        assertFalse(examplePoint.equals(exampleObject));
    }

    /**
     * Checks if the generated hashcode is the same on the same object
     */
    @Test
    void testIfPersonIsTheSameViaHashCode() {
        Point examplePoint = new Point(4, 4);
        assertEquals(examplePoint.hashCode(), examplePoint.hashCode());
    }

    /**
     * Checks if the generated hashcode is not the same when age differs.
     */
    @Test
    void testIfTheHashCodeIsNotEqualsWhenAgeDiffers(){
        Point examplePoint1 = new Point(4, 4);
        Point examplePoint2 = new Point(6, 9);
        assertNotEquals(examplePoint1.hashCode(), examplePoint2.hashCode());
    }

    /**
     * Checks if the point is the same by checking via compareTo.
     */
    @Test
    void testIfPointIsTheSame(){
        Point examplePoint1 = new Point(6, 9);
        Point examplePoint2 = new Point(6, 9);
        assertEquals( 0, examplePoint1.compareTo(examplePoint2));
    }

    /**
     * Checks if the point is not the same by checking via compareTo.
     */
    @Test
    void testIfPointIsNotTheSame(){
        Point examplePoint1 = new Point(6, 9);
        Point examplePoint2 = new Point(9, 9);
        assertEquals( -1, examplePoint1.compareTo(examplePoint2));
    }
}