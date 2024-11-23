package ch.hslu.exercise.sw10;

/**
 * Switchable interface
 *
 * @author Bruno Milagre
 * @version 1.0
 */

interface Switchable {

    /**
     * Switches the state of the Switchable to on
     */
    public void switchOn();

    /**
     * Switches the state of the Switchable to off
     */
    public void switchOff();

    /**
     * Checks if the switch state is on
     *
     @return  {@code true} if switch is on; {@code false} otherwise.
     */
    public boolean isSwitchedOn();

    /**
     * Checks if the switch state is off
     *
     @return  {@code true} if switch is off; {@code true} otherwise.
     */
    public boolean isSwitchedOff();
}

