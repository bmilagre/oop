package ch.hslu.exercise.sw12;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for CarLight component
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class CarLight implements Switchable {

    // Private boolean to track the car light's state
    private CarLightState state;

    // Listeners of class CarLight
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();


    /**
     * Constructor initializes car light to OFF state by default
     */
    public CarLight() {
        this.state = CarLightState.OFF;
    }

    /**
     * Turns on the car light by setting lightRunning to true
     */
    public void switchOn(){
        if(isSwitchedOff()) {
            this.state = CarLightState.ON;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "state", CarLightState.OFF, CarLightState.ON);
            this.firePropertyChangeEvent(event);
        }
    }

    /**
     * Turns off the car light by setting lightRunning to false
     */
    public void switchOff(){
        if(isSwitchedOn()) {
            this.state = CarLightState.OFF;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "state", CarLightState.OFF, CarLightState.ON);
            this.firePropertyChangeEvent(event);
        }
    }

    /**
     * Checks if the car light is currently on
     * @return true if the light is running, false otherwise
     */
    public boolean isSwitchedOn(){
        return this.state == CarLightState.ON;
    }

    /**
     * Checks if the car light is currently off
     * @return true if the light is not running, false otherwise
     */
    public boolean isSwitchedOff(){
        return this.state == CarLightState.OFF;
    }

    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.add(listener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.remove(listener);
    }

    private void firePropertyChangeEvent(PropertyChangeEvent event) {
        for(final PropertyChangeListener listener : this.changeListeners){
            listener.propertyChange(event);
        }
    }
}