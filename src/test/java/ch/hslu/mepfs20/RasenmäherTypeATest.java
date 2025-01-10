package ch.hslu.mepfs20;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class RasenmäherTypeATest {

    @Test
    void checkIfClassIsCorrectInitialized() {
        Antrieb antrieb = new Antrieb();
        RasenmäherTypeA rasenmäherTypeA = new RasenmäherTypeA(antrieb);

        assertInstanceOf(Antrieb.class, rasenmäherTypeA.getAntrieb(), "Antrieb should be an instance of Antrieb");
        assertInstanceOf(Messer.class, rasenmäherTypeA.getMesser(), "Messer should be an instance of Messer");
    }

    @Test
    void checkIfClassHasSerialNumber() {
        RasenmäherTypeA rasenmäherTypeA = new RasenmäherTypeA(new Antrieb());
        assertFalse(rasenmäherTypeA.getSerienNummer().isEmpty(), "Serialnumber should not be empty");
        assertNotEquals("", rasenmäherTypeA.getSerienNummer(), "Serialnumber should not be empty");
    }

    @Test
    void checkIfSerialNumberHasCorrectLenght() {
        RasenmäherTypeA rasenmäherTypeA = new RasenmäherTypeA(new Antrieb());
        assertEquals(7, rasenmäherTypeA.getSerienNummer().length());
    }

    @Test
    void checkIfTwoObjectsHaveDifferentSerialNumbers() {
        RasenmäherTypeA rasenmäherTypeA1 = new RasenmäherTypeA(new Antrieb());
        RasenmäherTypeA rasenmäherTypeA2 = new RasenmäherTypeA(new Antrieb());

        assertFalse(Objects.equals(rasenmäherTypeA1.getSerienNummer(), rasenmäherTypeA2.getSerienNummer()));
    }

    @Test
    void testEqualsAndHashCode() {
        EqualsVerifier.simple().forClass(RasenmäherTypeA.class).verify();
    }

    @Test
    void checkIfObjectHasHigherOrderThanOther() {
        RasenmäherTypeA rasenmäherTypeA1 = new RasenmäherTypeA(new Antrieb());
        RasenmäherTypeA rasenmäherTypeA2 = new RasenmäherTypeA(new Antrieb());

        assertEquals(1, rasenmäherTypeA2.compareTo(rasenmäherTypeA1));
    }

    @Test
    void checkIfObjectHasLessOrderThanOther() {
        RasenmäherTypeA rasenmäherTypeA1 = new RasenmäherTypeA(new Antrieb());
        RasenmäherTypeA rasenmäherTypeA2 = new RasenmäherTypeA(new Antrieb());

        assertEquals(-1, rasenmäherTypeA1.compareTo(rasenmäherTypeA2));
    }

    @Test
    void checkIfObjectHasEqualOrderThanOther() {
        RasenmäherTypeA RasenmäherTypeA1 = new RasenmäherTypeA(new Antrieb());

        assertEquals(0, RasenmäherTypeA1.compareTo(RasenmäherTypeA1));
    }

    @Test
    void checkIfObjectReturnsCorrectGeneration(){
        RasenmäherTypeA rasenmäherTypeA1 = new RasenmäherTypeA(new Antrieb());

        assertEquals(Generation.G1, rasenmäherTypeA1.getGeneration());
    }
}