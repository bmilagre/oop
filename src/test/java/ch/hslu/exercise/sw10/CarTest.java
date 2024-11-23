package ch.hslu.exercise.sw10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testSwitchOn() {
        Car car = new Car();
        car.switchOn();
        assertTrue(car.isSwitchedOn());
        assertFalse(car.isSwitchedOff());
    }

    @Test
    void testSwitchOff() {
        Car car = new Car();
        car.switchOn();
        car.switchOff();
        assertFalse(car.isSwitchedOn());
        assertTrue(car.isSwitchedOff());
    }
}