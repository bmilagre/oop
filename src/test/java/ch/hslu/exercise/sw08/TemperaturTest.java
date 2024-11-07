package ch.hslu.exercise.sw08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturTest {

    @Test
    void testIfTemperaturObjectEqualsTemperaturObject(){
        Temperatur exampleTemperatur = new Temperatur(15);
        assertTrue(exampleTemperatur.equals(exampleTemperatur));
    }

    @Test
    void testIfObjectEqualsTemperaturObject() {
        Temperatur temperaturToSelect = new Temperatur(15);
        Temperatur exampleTemperatur = new Temperatur(temperaturToSelect);
        assertTrue(exampleTemperatur.equals(exampleTemperatur));
    }

    @Test
    void testIfObjectNotEqualsTemperaturObject(){
        Temperatur exampleTemperatur = new Temperatur(15);
        Object exampleObject = new Object();
        assertFalse(exampleTemperatur.equals(exampleObject));
    }

    @Test
    void testIfTemperaturObjectNotEqualsTemperaturObject(){
        Temperatur temperaturToSelect = new Temperatur(15);
        Temperatur exampleTemperatur = new Temperatur(temperaturToSelect);
        Object exampleObject = new Object();
        assertFalse(exampleTemperatur.equals(exampleObject));
    }

    @Test
    void testIfCorrectKelvinValueIsReturned(){
        Temperatur exampleTemperatur = new Temperatur(15);
        assertEquals(288.15F,exampleTemperatur.getKelvin());
    }

    @Test
    void testIfCorrectCelsiusValueIsReturned(){
        Temperatur exampleTemperatur = new Temperatur(15);
        assertEquals(15,exampleTemperatur.getCelsius());
    }

    @Test
    void testIfKelvinValueIsSetCorrectly(){
        Temperatur exampleTemperatur = new Temperatur(15);
        exampleTemperatur.setKelvin(330);
        assertEquals(56.850006F,exampleTemperatur.getCelsius());
    }

    @Test
    void testIfCelsiusValueIsSetCorrectly(){
        Temperatur exampleTemperatur = new Temperatur(15);
        exampleTemperatur.setCelsius(33);
        assertEquals(33,exampleTemperatur.getCelsius());
    }

    @Test
    void testIfTemperaturIsTheSameViaHashCode(){
        Temperatur exampleTemperatur = new Temperatur(15);
        Temperatur exampleTemperatur2 = new Temperatur(15);
        assertEquals(exampleTemperatur.hashCode(),exampleTemperatur2.hashCode());
    }

    @Test
    void testIfTheHashCodeIsNotEqualsWhenTemperaturDiffers(){
        Temperatur exampleTemperatur = new Temperatur(15);
        Temperatur exampleTemperatur2 = new Temperatur(30);
        assertNotEquals(exampleTemperatur.hashCode(),exampleTemperatur2.hashCode());
    }

    @Test
    void testIfTemperaturIsTheSame(){
        Temperatur exampleTemperatur = new Temperatur(15);
        Temperatur exampleTemperatur2 = new Temperatur(15);
        assertEquals(0, exampleTemperatur.compareTo(exampleTemperatur2));
    }

    @Test
    void testIfTemperaturIsNotTheSame(){
        Temperatur exampleTemperatur = new Temperatur(15);
        Temperatur exampleTemperatur2 = new Temperatur(36);
        assertEquals(-1, exampleTemperatur.compareTo(exampleTemperatur2));
    }

    @Test
    void testIfConvertKelvinToCelsiusConvertsCorrectly(){
        assertEquals(16.0F,  Temperatur.convertKelvinToCelsius(289.15F));
    }

    @Test
    void testIfConvertCelsiusToKelvinConvertsCorrectly(){
        assertEquals(351.15F,  Temperatur.convertCelsiusToKelvin(78F));
    }
}