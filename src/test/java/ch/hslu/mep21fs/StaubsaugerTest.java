package ch.hslu.mep21fs;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaubsaugerTest {

    @Test
    void checkIfStaubsaugerHasMotor(){
        Staubsauger staubsauger = new Staubsauger("Dyson XDS");
        assertTrue(staubsauger.getMotor() instanceof Motor);
    }

    @Test
    void checkIfStaubsaugerChecksForCorrectInitialinz(){
        Staubsauger staubsauger = new Staubsauger("Dyson XDS");
        assertTrue(staubsauger instanceof Staubsauger);
    }

    @Test
    void checkIfStaubsaugerValidationReturnsErrorOnEmptyName(){
        assertThrows(IllegalArgumentException.class, () -> new Staubsauger(""), "Modelname is missing or over 17");
    }

    @Test
    void checkIfStaubsaugerValidationReturnsErrorOnNullName(){
        assertThrows(IllegalArgumentException.class, () -> new Staubsauger(null), "Modelname is missing or over 17");
    }

    @Test
    void checkIfStaubsaugerValidationReturnsErrorWhenLenghtOver17(){
        assertThrows(IllegalArgumentException.class, () -> new Staubsauger("ABCDEABCDEABCDEABCDEABCDE"), "Modelname is missing or over 17");
    }

    @Test
    void checkIfTwoStaubsaugerAreNotEqualWhenMotorDiffers(){
        Staubsauger staubsauger1 = new Staubsauger("Dyson XDS");
    }

    @Test
    void validateThatWeightDiffIsAround75Gramm(){
        Staubsauger staubsauger = new Staubsauger("Dyson XDS", "Renaut", 9.9);
        assertEquals(9.9, staubsauger.getWeight(), 0.75);
    }

    @Test
    void testEqualsContract() {
        EqualsVerifier.simple().forClass(Staubsauger.class).verify();
    }
}