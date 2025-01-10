package ch.hslu.mepfs20;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class RasenmäherTypeBTest {

    @Test
    void checkIfClassIsCorrectInitialized() {
        Antrieb antrieb = new Antrieb();
        RasenmäherTypeB RasenmäherTypeB = new RasenmäherTypeB(antrieb);

        assertInstanceOf(Antrieb.class, RasenmäherTypeB.getAntrieb(), "Antrieb should be an instance of Antrieb");
        assertInstanceOf(Messer.class, RasenmäherTypeB.getMesser(), "Messer should be an instance of Messer");
    }

    @Test
    void checkIfClassHasSerialNumber() {
        RasenmäherTypeB RasenmäherTypeB = new RasenmäherTypeB(new Antrieb());
        assertFalse(RasenmäherTypeB.getSerienNummer().isEmpty(), "Serialnumber should not be empty");
        assertNotEquals("", RasenmäherTypeB.getSerienNummer(), "Serialnumber should not be empty");
    }

    @Test
    void checkIfSerialNumberHasCorrectLenght() {
        RasenmäherTypeB RasenmäherTypeB = new RasenmäherTypeB(new Antrieb());
        assertEquals(7, RasenmäherTypeB.getSerienNummer().length());
    }

    @Test
    void checkIfTwoObjectsHaveDifferentSerialNumbers() {
        RasenmäherTypeB RasenmäherTypeB1 = new RasenmäherTypeB(new Antrieb());
        RasenmäherTypeB RasenmäherTypeB2 = new RasenmäherTypeB(new Antrieb());

        assertFalse(Objects.equals(RasenmäherTypeB1.getSerienNummer(), RasenmäherTypeB2.getSerienNummer()));
    }

    @Test
    void testEqualsAndHashCode() {
        EqualsVerifier.simple().forClass(RasenmäherTypeB.class).verify();
    }

    @Test
    void checkIfObjectHasHigherOrderThanOther() {
        RasenmäherTypeB RasenmäherTypeB1 = new RasenmäherTypeB(new Antrieb());
        RasenmäherTypeB RasenmäherTypeB2 = new RasenmäherTypeB(new Antrieb());

        assertEquals(1, RasenmäherTypeB2.compareTo(RasenmäherTypeB1));
    }

    @Test
    void checkIfObjectHasLessOrderThanOther() {
        RasenmäherTypeB RasenmäherTypeB1 = new RasenmäherTypeB(new Antrieb());
        RasenmäherTypeB RasenmäherTypeB2 = new RasenmäherTypeB(new Antrieb());

        assertEquals(-1, RasenmäherTypeB1.compareTo(RasenmäherTypeB2));
    }

    @Test
    void checkIfObjectHasEqualOrderThanOther() {
        RasenmäherTypeB RasenmäherTypeB1 = new RasenmäherTypeB(new Antrieb());

        assertEquals(0, RasenmäherTypeB1.compareTo(RasenmäherTypeB1));
    }

    @Test
    void checkIfObjectReturnsCorrectGeneration(){
        RasenmäherTypeB RasenmäherTypeB1 = new RasenmäherTypeB(new Antrieb());

        assertEquals(Generation.G2, RasenmäherTypeB1.getGeneration());
    }
}