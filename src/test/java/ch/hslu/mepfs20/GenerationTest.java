package ch.hslu.mepfs20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerationTest {

    @Test
    void checkIfEnumReturnsCorrectEnum(){
        assertEquals(2012, Generation.G1.getYear(), "Generation of G1 should return 2012");
        assertEquals(2013, Generation.G2.getYear(), "Generation of G2 should return 2013");
        assertEquals(2019, Generation.G3.getYear(), "Generation of G3 should return 2019");
    }

}