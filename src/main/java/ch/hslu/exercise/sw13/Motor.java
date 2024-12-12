package ch.hslu.exercise.sw13;

/**
 * Java class for Motor component
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Motor {

    // Current state of the motor
    private MotorState state;

    /**
     * Constructor initializes motor to OFF state by default
     */
    public Motor() {
        this.state = MotorState.OFF;
    }

    public final MotorState getState() {
        return state;
    }

    public final void setState(final MotorState state) {
        this.state = state;
    }

    /**
     * Checks if motor is currently switched on
     * @return true if motor state is ON, false otherwise
     */
    public boolean isSwitchedOn(){
        return this.state == MotorState.ON;
    }

    /**
     * Checks if motor is currently switched off
     * @return true if motor state is OFF, false otherwise
     */
    public boolean isSwitchedOff(){
        return this.state == MotorState.OFF;
    }
}