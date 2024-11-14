package ch.hslu.exercise.sw08;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturVerlaufTest {

    @Test
    void testIfTemperaturVerlaufIsEmpty() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        assertEquals(0, temperaturVerlauf.getCount());
    }

    @Test
    void testIfTemperaturVerlaufHasOneElementInList() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        Temperatur temperatur = new Temperatur(10);

        temperaturVerlauf.add(temperatur);
        assertEquals(1, temperaturVerlauf.getCount());
    }

    @Test
    void testIfTemperaturVerlaufHasThreeElementsInList() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        Temperatur temperatur = new Temperatur(10);

        temperaturVerlauf.add(temperatur);
        temperaturVerlauf.add(temperatur);
        temperaturVerlauf.add(temperatur);

        assertEquals(3, temperaturVerlauf.getCount());
    }

    @Test
    void testIfTemperaturVerlaufIsCleanAfterEmptying() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        Temperatur temperatur = new Temperatur(10);

        temperaturVerlauf.add(temperatur);
        temperaturVerlauf.add(temperatur);
        temperaturVerlauf.add(temperatur);

        temperaturVerlauf.clear();

        assertEquals(0, temperaturVerlauf.getCount());
    }

    @Test
    void testIfTemperaturVerlaufReturnsCorrectMaxTemperatur() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        Temperatur temperaturOne = new Temperatur(12);
        Temperatur temperaturTwo = new Temperatur(24);
        Temperatur temperaturThree = new Temperatur(18);

        temperaturVerlauf.add(temperaturOne);
        temperaturVerlauf.add(temperaturTwo);
        temperaturVerlauf.add(temperaturThree);

        assertEquals(temperaturTwo, temperaturVerlauf.max());
    }

    @Test
    void testIfTemperaturVerlaufReturnsCorrectMinTemperatur() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        Temperatur temperaturOne = new Temperatur(12);
        Temperatur temperaturTwo = new Temperatur(24);
        Temperatur temperaturThree = new Temperatur(18);

        temperaturVerlauf.add(temperaturOne);
        temperaturVerlauf.add(temperaturTwo);
        temperaturVerlauf.add(temperaturThree);

        assertEquals(temperaturOne, temperaturVerlauf.min());
    }

    @Test
    void testIfTemperaturVerlaufReturnsZeroWhenEmpty() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        assertEquals(null, temperaturVerlauf.max());
    }
}