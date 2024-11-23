package ch.hslu.exercise.sw10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarLightTest {
    @Test
    void testSwitchOn() {
        CarLight carLight = new CarLight();
        carLight.switchOn();
        assertTrue(carLight.isSwitchedOn());
        assertFalse(carLight.isSwitchedOff());
    }

    @Test
    void testSwitchOff() {
        CarLight carLight = new CarLight();
        carLight.switchOn();
        carLight.switchOff();
        assertFalse(carLight.isSwitchedOn());
        assertTrue(carLight.isSwitchedOff());
    }
}