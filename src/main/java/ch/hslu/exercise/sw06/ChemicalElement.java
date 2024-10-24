package ch.hslu.exercise.sw06;

/**
 * Basic Class for a chemical element
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public abstract class ChemicalElement {
    private String fullName;
    private int elementNumber;
    private float temperatur;
    private float minLiquid;
    private float minGas;

    public ChemicalElement(float temperatur, float minLiquid, float minGas, String fullName, int elementNumber) {
        this.temperatur = temperatur;
        this.minLiquid = minLiquid;
        this.minGas = minGas;
        this.fullName = fullName;
        this.elementNumber = elementNumber;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String name) {
        this.fullName = name;
    }

    public int getElementNumber() {
        return this.elementNumber;
    }

    public float getTemperaturInCelsius() {
        return this.temperatur;
    }

    public void setTemperatur(float temperatur) {
        this.temperatur = temperatur;
    }

    public float getTemperaturInKelvin() {
        return this.temperatur + (float) 273.15;
    }

    public float getTemperaturInFahrenheit() {
        float temperaturInKelvin = this.getTemperaturInKelvin();

        if (temperaturInKelvin > 500 || temperaturInKelvin < 0) {
            return Float.NaN;
        }

        return (this.temperatur * (float) 1.8) + (float) 32;
    }

    public String getAggregateState(String nitrogen) {
        if (this.temperatur >= this.minLiquid && this.temperatur < this.minGas) {
            return "flüssig";
        }

        if (this.temperatur >= this.minGas) {
            return "gasförmig";
        }

        return "fest";
    }

    @Override
    public String toString() {
        return "ChemicalElement[Celsius=" + this.temperatur + "]";
    }
}
