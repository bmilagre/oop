package ch.hslu.exercise.sw05;

/**
 * Java class for Car component
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Car implements Switchable, Named {

    private Motor motor;
    private CarLight carLight;
    private String name;

    public void main(final String[] args) {
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

    public void setName(final String name){
        this.name = name;
    }
}

