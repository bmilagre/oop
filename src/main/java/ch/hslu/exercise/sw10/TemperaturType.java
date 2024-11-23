package ch.hslu.exercise.sw10;

public enum TemperaturType {
    CELSIUS("Celsius", -273.15F), KELVIN("Kelvin", 0.0F);

    private final String name;
    private float nullPoint;

    TemperaturType(final String name, final float nullPoint) {
        this.name = name;
        this.nullPoint = nullPoint;
    }

    public String getName() {
        return this.name;
    }

    public float getNullPoint() {
        return this.nullPoint;
    }
}
