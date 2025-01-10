package ch.hslu.mep21fs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProduktLagerTest {

    @Test
    public void testGetTotalWeight() {
        ProduktLager storage = new ProduktLager();
        Double totalWeight = storage.getTotalWeight();

        assertEquals(31.0, totalWeight, 0.01, "The total weight should be 31.0");
    }

    @Test
    public void testMax() {
        ProduktLager storage = new ProduktLager();
        String heaviestProduct = storage.max();

        assertEquals("Dyson 4", heaviestProduct, "The heaviest product should be 'Dyson 4'");
    }
}