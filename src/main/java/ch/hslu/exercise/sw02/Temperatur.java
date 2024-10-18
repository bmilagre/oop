package ch.hslu.exercise.sw02;

/**
 * Beschreiben Sie hier die Klasse Temperature.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Temperatur {

    private float earthTemperaturInCelsius;

    public Temperatur(float earthTemperaturInCelsius){
        this.earthTemperaturInCelsius = earthTemperaturInCelsius;
    }

    public float getEarthTemperaturInCelsius(){
        return this.earthTemperaturInCelsius;
    }

    public void setEarthTemperaturInCelsius(float temperatur){
        this.earthTemperaturInCelsius = temperatur;
    }

    public float getEarthTemperaturInKelvin(){
        return this.earthTemperaturInCelsius + (float)273.15;
    }

    public float getEarthTemperaturInFahrenheit(){
        float earthTemperaturInKelvin = this.getEarthTemperaturInKelvin();

        if(earthTemperaturInKelvin > 500 || earthTemperaturInKelvin < 0){
            return Float.NaN;
        }

        return (this.earthTemperaturInCelsius * (float)1.8) + (float)32;
    }

    public void changeEarthTemperaturInCelsius(float temperatur){
        this.earthTemperaturInCelsius += temperatur;
    }
}

