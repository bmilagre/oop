package ch.hslu.exercise.sw05;

/**
 * CountingSwitchable interface
 *
 * @author Bruno Milagre
 * @version 1.0
 */

public interface CountingSwitchable extends Switchable {
    long countSwitchable = 0;

    /**
     * Switches the state of the Switchable to on
     */
    public void switchOn();

    public long getSwitchCount();
}
