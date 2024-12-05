package ch.hslu.exercise.sw10;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for Motor component
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Motor implements Switchable {

    // Current state of the motor
    private MotorState state;

    // Listeners of class Motor
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();

    /**
     * Constructor initializes motor to OFF state by default
     */
    public Motor() {
        this.state = MotorState.OFF;
    }

    /**
     * Switches the motor on by setting state to ON
     */
    public void switchOn(){
        if(isSwitchedOff()){
            this.state = MotorState.ON;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "state", MotorState.OFF, MotorState.ON);
            this.firePropertyChangeEvent(event);
        }
    }

    /**
     * Switches the motor off by setting state to OFF
     */
    public void switchOff(){
        if(isSwitchedOn()){
            this.state = MotorState.OFF;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "state", MotorState.ON, MotorState.OFF);
            this.firePropertyChangeEvent(event);
        }
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

    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        if(listener != null) {
            this.changeListeners.add(listener);
        }
    }

    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        if(listener != null) {
            this.changeListeners.remove(listener);
        }
    }

    private void firePropertyChangeEvent(PropertyChangeEvent event) {
        for(final PropertyChangeListener listener : this.changeListeners){
            listener.propertyChange(event);
        }
    }
}