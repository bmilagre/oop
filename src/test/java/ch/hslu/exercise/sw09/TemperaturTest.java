package ch.hslu.exercise.sw09;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class TemperaturTest {

    @Test
    void testIfTemperaturObjectEqualsTemperaturObject(){
        Temperatur exampleTemperatur = Temperatur.createFromCelsius(27f);
        assertTrue(exampleTemperatur.equals(exampleTemperatur));
    }

    @Test
    void testIfObjectEqualsTemperaturObject() {
        Temperatur temperaturToSelect = Temperatur.createFromCelsius(33f);
        Temperatur exampleTemperatur = new Temperatur(temperaturToSelect);
        assertTrue(exampleTemperatur.equals(exampleTemperatur));
    }

    @Test
    void testIfObjectNotEqualsTemperaturObject(){
        Temperatur exampleTemperatur = Temperatur.createFromCelsius(27f);
        Object exampleObject = new Object();
        assertFalse(exampleTemperatur.equals(exampleObject));
    }

    @Test
    void testIfTemperaturObjectNotEqualsTemperaturObject(){
        Temperatur temperaturToSelect = Temperatur.createFromCelsius(27f);
        Temperatur exampleTemperatur = new Temperatur(temperaturToSelect);
        Object exampleObject = new Object();
        assertFalse(exampleTemperatur.equals(exampleObject));
    }

    @Test
    void testIfCorrectKelvinValueIsReturned(){
        Temperatur exampleTemperatur = Temperatur.createFromCelsius(12f);
        assertEquals(285.15f,exampleTemperatur.getKelvin(), 0.1);
    }

    @Test
    void testIfCorrectCelsiusValueIsReturned(){
        Temperatur exampleTemperatur = Temperatur.createFromCelsius(15.3f);
        assertEquals(15.3f,exampleTemperatur.getCelsius(), 0.1);
    }

    @Test
    void testIfKelvinValueIsSetCorrectly(){
        Temperatur exampleTemperatur = Temperatur.createFromCelsius(15.3f);
        assertEquals(15.3f, exampleTemperatur.getCelsius(), 0.1);
    }

    @Test
    void testIfCelsiusValueIsSetCorrectly(){
        Temperatur exampleTemperatur = Temperatur.createFromCelsius(15.3f);
        assertEquals(15.3f, exampleTemperatur.getCelsius(), 0.1);
    }

    @Test
    void testIfTemperaturIsTheSameViaHashCode(){
        Temperatur exampleTemperatur = Temperatur.createFromCelsius(15.3f);
        Temperatur exampleTemperatur2 = Temperatur.createFromCelsius(15.3f);
        assertEquals(exampleTemperatur.hashCode(), exampleTemperatur2.hashCode(), 0.1);
    }

    @Test
    void testIfTheHashCodeIsNotEqualsWhenTemperaturDiffers(){
        Temperatur exampleTemperatur = Temperatur.createFromCelsius(20.2f);
        Temperatur exampleTemperatur2 = Temperatur.createFromCelsius(19.8f);
        assertNotEquals(exampleTemperatur.hashCode(),exampleTemperatur2.hashCode());
    }

    @Test
    void testIfTemperaturIsTheSame(){
        Temperatur exampleTemperatur = Temperatur.createFromCelsius(15.3f);
        Temperatur exampleTemperatur2 =Temperatur.createFromCelsius(15.3f);
        assertEquals(0, exampleTemperatur.compareTo(exampleTemperatur2), 0.1);
    }

    @Test
    void testIfTemperaturIsNotTheSame(){
        Temperatur exampleTemperatur = Temperatur.createFromCelsius(78.3f);
        Temperatur exampleTemperatur2 = Temperatur.createFromCelsius(15.3f);
        assertEquals(1, exampleTemperatur.compareTo(exampleTemperatur2));
    }

    @Test
    void testIfConvertKelvinToCelsiusConvertsCorrectly(){
        assertEquals(26.85f,  Temperatur.convertKelvinToCelsius(300f), 0.1f);
    }

    @Test
    void testIfConvertCelsiusToKelvinConvertsCorrectly(){
        assertEquals(283.15f,  Temperatur.convertCelsiusToKelvin(10f), 0.1f);
    }

    @Test
    void testEqualsAndHashCode(){
        EqualsVerifier.simple().forClass(Temperatur.class).verify();
    }

    @Test
    void testIfExceptionIsThrownWhenWrongCelsiusValue(){
        assertThatThrownBy(() -> {
            Temperatur.createFromCelsius(-669f);
        }).isInstanceOf(InvalidTemperaturException.class);
    }

    @Test
    void testIfExceptionIsThrownWhenWrongKelvinValue(){
        assertThatThrownBy(() -> {
            Temperatur.createFromKelvin(-1f);
        }).isInstanceOf(InvalidTemperaturException.class);
    }
}