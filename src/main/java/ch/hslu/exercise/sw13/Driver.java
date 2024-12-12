package ch.hslu.exercise.sw13;

public class Driver {
    public static void main(String[] args) {
        Motor motor = new Motor();
        MotorView motorView = new MotorView();

        new MotorController(motor, motorView);
    }
}
