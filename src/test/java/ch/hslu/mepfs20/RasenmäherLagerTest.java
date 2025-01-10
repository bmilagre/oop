package ch.hslu.mepfs20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RasenmäherLagerTest {

    @Test
    void testGetAnzahlGeneration() {
        // Vorbereitung des Lagers
        RasenmäherLager lager = new RasenmäherLager();

        assertEquals(2, lager.getAnzahlGeneration(Generation.G1));
        assertEquals(1, lager.getAnzahlGeneration(Generation.G2));
        assertEquals(0, lager.getAnzahlGeneration(Generation.G3));
    }
}