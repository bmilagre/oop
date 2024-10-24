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

    /**
     * Main method as entry point of the program
     * Demonstrates usage of the Car class
     *
     * @param args Command line arguments (not used)
     */
    public static void main(final String[] args) {
        Car car = new Car();

        System.out.println("Light status before switch on car: " + car.isSwitchedOn());
        System.out.println("Calling car.switchOn()...");
        car.switchOn();
        System.out.println("Light status after switch on car: " + car.isSwitchedOn());

        System.out.println();
        System.out.println("Current name of the car: " + car.name);
        System.out.println("Setting the name of the car to Lightning McQueen...");
        car.setName("Lightning McQueen");
        System.out.println("New name of the car: " + car.name);
    }

    public Car() {
        this.motor = new Motor();
        this.carLight = new CarLight();
    }

    public void switchOn() {
        this.motor.switchOn();
        this.carLight.switchOn();
    }

    public void switchOff() {
        this.motor.switchOff();
        this.carLight.switchOff();
    }

    public boolean isSwitchedOn() {
        return this.motor.isSwitchedOn() || this.carLight.isSwitchedOn();
    }

    public boolean isSwitchedOff() {
        return this.motor.isSwitchedOff() && this.carLight.isSwitchedOff();
    }

    public void setName(final String name) {
        this.name = name;
    }
}

