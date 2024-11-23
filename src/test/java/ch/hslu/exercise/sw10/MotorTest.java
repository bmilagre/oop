package ch.hslu.exercise.sw10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {
    @Test
    void testSwitchOn() {
        Motor motor = new Motor();
        motor.switchOn();
        assertTrue(motor.isSwitchedOn());
        assertFalse(motor.isSwitchedOff());
    }

    @Test
    void testSwitchOff() {
        Motor motor = new Motor();
        motor.switchOn();
        motor.switchOff();
        assertFalse(motor.isSwitchedOn());
        assertTrue(motor.isSwitchedOff());
    }
}