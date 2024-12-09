package ch.hslu.exercise.sw12;

import java.util.Objects;

/**
 * Basic Class for a Temperature.
 * Represents a temperature with methods to handle conversions between Celsius and Kelvin.
 *
 * @version 1.0
 */
public class Temperatur implements Comparable<Temperatur> {
    private static final float KELVIN_OFFSET = 273.15F;
    private float kelvin;

    /**
     * Private constructor for Temperatur class.
     * Validates and sets the temperature in the specified unit (Celsius or Kelvin).
     *
     * @param value Temperature value.
     * @param temperaturType Type of temperature scale (Celsius or Kelvin).
     * @throws IllegalArgumentException if temperaturType is null or if value is below absolute zero.
     */
    private Temperatur(float value, TemperaturType temperaturType) {
        if (TemperaturType.CELSIUS == temperaturType) {
            if (this.validateCelsiusTemperature(value)) {
                this.kelvin = convertCelsiusToKelvin(value);
            } else {
                throw new InvalidTemperaturException(TemperaturType.CELSIUS.getName() + " cannot be lower than Nullpoint: " + TemperaturType.CELSIUS.getNullPoint());
            }
        }

        if (TemperaturType.KELVIN == temperaturType) {
            if (this.validateKelvinTemperature(value)) {
                this.kelvin = value;
            } else {
                throw new InvalidTemperaturException(TemperaturType.KELVIN.getName() + " cannot be lower than Nullpoint: " + TemperaturType.KELVIN.getNullPoint());
            }
        }
    }

    /**
     * Copy constructor for Temperatur.
     * Initializes a new instance using the temperature of another Temperatur instance.
     *
     * @param temperatur Temperatur instance to copy from.
     */
    public Temperatur(Temperatur temperatur) {
        if (this.validateKelvinTemperature(temperatur.getKelvin())) {
            this.kelvin = temperatur.getKelvin();
        }
    }

    /**
     * Gets the temperature in Kelvin.
     *
     * @return Temperature in Kelvin.
     */
    public float getKelvin() {
        return this.kelvin;
    }

    /**
     * Gets the temperature in Celsius.
     *
     * @return Temperature in Celsius.
     */
    public float getCelsius() {
        return convertKelvinToCelsius(this.getKelvin());
    }

    /**
     * Checks equality between two Temperatur instances based on Kelvin value.
     *
     * @param object Object to compare with.
     * @return true if temperatures are equal, false otherwise.
     */
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Temperatur temperatur)) {
            return false;
        }

        return Objects.equals(temperatur.kelvin, this.kelvin);
    }

    /**
     * Returns a string representation of the temperature in Kelvin.
     *
     * @return String representation of the temperature.
     */
    @Override
    public String toString() {
        return "Temperatur: " + convertKelvinToCelsius(this.kelvin) + " Celsius";
    }

    /**
     * Returns an integer representation the temperature hashcode.
     * @return
     */
    public int hashCode(){
        return Objects.hash(this.kelvin);
    }

    /**
     * Compares this Temperatur instance to another based on Kelvin value.
     *
     * @param other The other Temperatur instance.
     * @return Comparison result: negative if less, positive if greater, zero if equal.
     */
    @Override
    public int compareTo(Temperatur other) {
        return Float.compare(this.kelvin, other.kelvin);
    }

    /**
     * Converts a temperature from Kelvin to Celsius.
     *
     * @param kelvin Temperature in Kelvin.
     * @return Converted temperature in Celsius.
     */
    public static float convertKelvinToCelsius(float kelvin) {
        return kelvin - KELVIN_OFFSET;
    }

    /**
     * Converts a temperature from Celsius to Kelvin.
     *
     * @param celsius Temperature in Celsius.
     * @return Converted temperature in Kelvin.
     */
    public static float convertCelsiusToKelvin(float celsius) {
        return celsius + KELVIN_OFFSET;
    }

    /**
     * Factory method to create a Temperatur instance from a Celsius value.
     *
     * @param celsius Temperature in Celsius.
     * @return New Temperatur instance.
     */
    public static Temperatur createFromCelsius(final float celsius) {
        return new Temperatur(celsius, TemperaturType.CELSIUS);
    }

    /**
     * Factory method to create a Temperatur instance from a Kelvin value.
     *
     * @param kelvin Temperature in Kelvin.
     * @return New Temperatur instance.
     */
    public static Temperatur createFromKelvin(final float kelvin) {
        return new Temperatur(kelvin, TemperaturType.KELVIN);
    }

    /**
     * Validates if a Celsius temperature is above absolute zero.
     *
     * @param celsius Temperature in Celsius.
     * @return true if valid, false otherwise.
     */
    private boolean validateCelsiusTemperature(final float celsius) {
        return celsius >= TemperaturType.CELSIUS.getNullPoint();
    }

    /**
     * Validates if a Kelvin temperature is above absolute zero.
     *
     * @param kelvin Temperature in Kelvin.
     * @return true if valid, false otherwise.
     */
    private boolean validateKelvinTemperature(final float kelvin) {
        return kelvin >= TemperaturType.KELVIN.getNullPoint();
    }
}