package ch.hslu.exercise.sw08;

import java.util.Objects;

/**
 * Basic Class for a chemical element
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public abstract class ChemicalElement {
    private String fullName;
    private final int elementNumber;
    private float temperatur;
    private final float minLiquid;
    private final float minGas;

    private enum ChemicalState {
        SOLID(1, "name"), LIQUID(2, "flüssig"), GAS(3, "gasförmig");

        private final int value;
        private final String name;

        private ChemicalState(final int value, final String name) {
            this.value = value;
            this.name = name;
        }

        public int getValue() {
            return this.value;
        }

        public String getName() {
            return this.name;
        }
    }

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

    public String getAggregateState() {
        String aggregateState;

        if (this.temperatur >= this.minLiquid && this.temperatur < this.minGas) {
            aggregateState = ChemicalState.LIQUID.getName();
        } else if (this.temperatur >= this.minGas) {
            aggregateState = ChemicalState.GAS.getName();
        } else {
            aggregateState = ChemicalState.SOLID.getName();
        }

        return this.fullName + " ist bei " + this.getTemperaturInCelsius() + " " + aggregateState;
    }

    @Override
    public String toString() {
        return "ChemicalElement: " + super.toString();
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof ChemicalElement chemicalElement)) {
            return false;
        }

        return Objects.equals(chemicalElement.elementNumber, this.elementNumber) && Objects.equals(chemicalElement.fullName, this.fullName) && Objects.equals(chemicalElement.temperatur, this.temperatur) && Objects.equals(chemicalElement.minLiquid, this.minLiquid) && Objects.equals(chemicalElement.minGas, this.minGas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.elementNumber, this.temperatur, this.minLiquid, this.minGas, this.fullName);
    }
}
