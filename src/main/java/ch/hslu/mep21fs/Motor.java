package ch.hslu.mep21fs;

import java.util.Objects;

public class Motor {
    String motorManufacturer;

    public Motor(String motorManufacturer) {
        this.motorManufacturer = motorManufacturer;
    }

    public Motor(){
        this.motorManufacturer = "BMW";
    }

    public String getMotorManufacturer() {
        return motorManufacturer;
    }

    public void setMotorManufacturer(final String motorManufacturer) {
        this.motorManufacturer = motorManufacturer;
    }

    @Override
    public String toString() {
        return "[Motor]: Manufacturer: " + motorManufacturer;
    }

    @Override
    public final boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Motor motor)) {
            return false;
        }

        return Objects.equals(motor.motorManufacturer, this.motorManufacturer);
    }

    public final int hashCode(){
        return Objects.hash(this.motorManufacturer);
    }
}
