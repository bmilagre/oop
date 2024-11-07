package ch.hslu.exercise.sw08;

import java.util.Objects;

/**
 * Basic Class for a Temperatur
 *
 * @author Bruno Milagre
 * @version 1.0
 */

public final class Temperatur implements Comparable<Temperatur> {
    private static final float KELVIN_OFFSET = 273.15F;
    private float kelvin;

    public Temperatur(float celsius) {
        this.setCelsius(celsius);
    }

    public Temperatur(Temperatur temperatur) {
        this.setKelvin(temperatur.getKelvin());
    }

    public float getKelvin(){
        return this.kelvin;
    }

    public float getCelsius(){
        return convertKelvinToCelsius(this.getKelvin());
    }

    public void setKelvin(final float kelvin){
        this.kelvin = kelvin;
    }

    public void setCelsius(final float celsius){
        this.kelvin = convertCelsiusToKelvin(celsius);
    }

    @Override
    public boolean equals(final Object object){
        if (this == object){
            return true;
        }

        if(!(object instanceof Temperatur temperatur)){
            return false;
        }

        return Objects.equals(temperatur.kelvin, this.kelvin);
    }

    public int hashCode(){
        return Objects.hash(this.kelvin);
    }

    @Override
    public String toString(){
        return "Temperatur: " + super.toString();
    }

    @Override
    public int compareTo(Temperatur other) {
       return Float.compare(this.kelvin, other.kelvin);
    }

    public static float convertKelvinToCelsius(float kelvin){
        return kelvin - KELVIN_OFFSET;
    }

    public static float convertCelsiusToKelvin(float celsius){
        return celsius + KELVIN_OFFSET;
    }
}
