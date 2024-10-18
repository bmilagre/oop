package ch.hslu.exercise.sw03;

/**
 * Copy from SW02
 *
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
}

