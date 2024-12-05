package ch.hslu.exercise.sw11;

/**
 * Interface for handling temperature events.
 */
public interface TemperaturEventListener {

    /**
     * Handles a temperature event.
     *
     * @param temperaturEvent the event containing temperature-related data.
     */
    void temperaturChangeEvent(TemperaturEvent temperaturEvent);
}