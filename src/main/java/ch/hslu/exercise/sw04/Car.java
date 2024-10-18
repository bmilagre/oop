package ch.hslu.exercise.sw04;

/**
 * Java class for Car component
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Car implements Switchable {

    private Motor motor;
    private CarLight carLight;

    public Car(){
        this.motor = new Motor();
        this.carLight = new CarLight();
    }

    public void switchOn(){
        this.motor.switchOn();
        this.carLight.switchOn();
    }

    public void switchOff(){
        this.motor.switchOff();
        this.carLight.switchOff();
    }

    public boolean isSwitchedOn(){
        return this.motor.isSwitchedOn() || this.carLight.isSwitchedOn();
    }

    public boolean isSwitchedOff(){
        return this.motor.isSwitchedOff() && this.carLight.isSwitchedOff();
    }
}

