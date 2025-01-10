package ch.hslu.mep21fs;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MotorTest {

    @Test
    void testIfConstructorIsIntializedCorrectly(){
        Motor motor = new Motor();
        assertEquals("BMW", motor.getMotorManufacturer());
    }

    @Test
    void testIfConstructorIsIntializedCorrectlyWithAttribute(){
        Motor motor = new Motor("Renaut");
        assertEquals("Renaut", motor.getMotorManufacturer());
    }

    @Test
    void testIfTwoSameMotorsAreEqual(){
        Motor motor1 = new Motor("Renaut");
        Motor motor2 = new Motor("Renaut");
        assertEquals(motor1, motor2);
    }

    @Test
    void testIfTwoDifferentMotorsAreNotEqual(){
        Motor motor1 = new Motor("Renaut");
        Motor motor2 = new Motor("Ferrari");
        assertNotEquals(motor1, motor2);
    }

    @Test
    void testEqualsContract() {
        EqualsVerifier.simple().forClass(Motor.class).verify();
    }
}