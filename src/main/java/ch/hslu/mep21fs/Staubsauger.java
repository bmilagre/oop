package ch.hslu.mep21fs;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Staubsauger implements WeightInterface, Comparable<Staubsauger> {
    private final Motor motor;
    private String model;
    private double weight;

    public Staubsauger(String model) {
        if(!validateModelName(model)) {
            throw new IllegalArgumentException("Model name is invalid");
        }

        this.motor = new Motor();
        this.model = model;
    }

    public Staubsauger(String model, String motorManufacturer, double weight) {
        if(!validateModelName(model)) {
            throw new IllegalArgumentException("Model name is invalid");
        }

        this.motor = new Motor(motorManufacturer);
        this.model = model;
        this.weight = weight;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getModel() {
        return model;
    }

    private boolean validateModelName(String model) {
        if(model == null || "".equals(model) || model.length() > 17) {
            return false;
        }

        return true;
    }

    @Override
    public final boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Staubsauger staubsauger)) {
            return false;
        }

        return Objects.equals(staubsauger.motor, this.motor) && Objects.equals(model, staubsauger.model) && Objects.equals(weight, staubsauger.weight);
    }

    public final int hashCode(){
        return Objects.hash(this.motor, this.model, this.weight);
    }

    @Override
    public String toString() {
        return "[Staubsauger] model: " + this.model + " motor: " + this.motor + " weight: " + this.weight;
    }

    @Override
    public Double getWeight() {
        return round(this.weight, WeightInterface.relevantPositionOfWeight);
    }

    @Override
    public int compareTo(Staubsauger other) {
        return Double.compare(this.weight, other.weight);
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
