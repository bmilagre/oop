package ch.hslu.exercise.sw07;


import java.util.Objects;

/**
 * The {@code Temperatur} class is a basic implementation to get the earthTemperatur in multiple tempeatur units.
 *
 */
public class Temperatur {

    private float earthTemperaturInCelsius;

    /**
     * Default constructor for Process.
     */
    public Temperatur(float earthTemperaturInCelsius){
        this.earthTemperaturInCelsius = earthTemperaturInCelsius;
    }

    /**
     * Get the current earth temperatur in celsius
     *
     * @return returns the earthTemperatur in the unit type celsius
     */
    public float getEarthTemperaturInCelsius(){
        return this.earthTemperaturInCelsius;
    }


    /**
     * Sets a new earth temperatur of type celsius
     *
     * @param temperatur the desired temperatur in float
     */
    public void setEarthTemperaturInCelsius(float temperatur){
        this.earthTemperaturInCelsius = temperatur;
    }

    /**
     * Get the current earth temperatur in kelvin
     *
     * @return returns the earthTemperatur in the unit type kelvin
     */
    public float getEarthTemperaturInKelvin(){
        return this.earthTemperaturInCelsius + (float)273.15;
    }

    /**
     * Get the current earth temperatur in Fahrenheit
     *
     * @return returns the earthTemperatur in the unit type Fahrenheit
     */
    public float getEarthTemperaturInFahrenheit(){
        float earthTemperaturInKelvin = this.getEarthTemperaturInKelvin();

        if(earthTemperaturInKelvin > 500 || earthTemperaturInKelvin < 0){
            return Float.NaN;
        }

        return (this.earthTemperaturInCelsius * (float)1.8) + (float)32;
    }

    /**
     * Changes the earthTemperatur to the desired tempearatur in celsius
     *
     * @param temperatur the desired temperatur in celsius
     */
    public void changeEarthTemperaturInCelsius(float temperatur){
        this.earthTemperaturInCelsius += temperatur;
    }


    /**
     * Gets the aggregate state of the earth by checking the current defined tempearatur
     *
     * @return returns the current aggregate state as strings
     */
    public String getAggregateState(String nitrogen){
        float minLiquid = 0;
        float minGas = 0;

        switch(nitrogen){
            case "N":
                minLiquid = -210;
                minGas = -195.8F;
                break;
            case "Hg":
                minLiquid = -38.9F;
                minGas = 357;
                break;
            case "Pb":
                minLiquid = 327;
                minGas = 1740;
                break;
        }

        if(this.earthTemperaturInCelsius >= minLiquid && this.earthTemperaturInCelsius < minGas){
            return "flüssig";
        }

        if(this.earthTemperaturInCelsius >= minGas){
            return "gasförmig";
        }

        return "fest";
    }

    @Override
    public String toString() {
        return "Temperatur: " + super.toString();
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if(!(object instanceof Temperatur temperatur)) {
            return false;
        }

        return Objects.equals(temperatur.earthTemperaturInCelsius, this.earthTemperaturInCelsius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.earthTemperaturInCelsius);
    }
}
