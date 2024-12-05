package ch.hslu.exercise.sw11;

import jdk.jfr.EventType;

import java.io.Serial;
import java.util.EventObject;

/**
 * Event for Changes of temperatur (Maximum and Minimum)
 */
public class TemperaturEvent extends EventObject {
    @Serial
    private static final long serialVersionUID = 1L;
    private final Temperatur newValue;
    private final Temperatur oldValue;
    private final TemperaturEventType eventType;

    public TemperaturEvent(Object source, Temperatur newValue, Temperatur oldValue,TemperaturEventType eventType) {
        super(source);
        this.newValue = newValue;
        this.oldValue = oldValue;
        this.eventType = eventType;
    }

    public Temperatur getOldValue() {
        return oldValue;
    }

    public Temperatur getNewValue() {
        return newValue;
    }

    public TemperaturEventType getEventType() {
        return eventType;
    }

    @Override
    public String toString() {
        return "[TemperaturEvent] Type " + eventType + " -> " + newValue + " to " + oldValue;
    }
}
