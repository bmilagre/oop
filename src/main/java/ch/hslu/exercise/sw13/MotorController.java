package ch.hslu.exercise.sw13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class MotorController implements Switchable {

    private static final Logger LOG = LoggerFactory.getLogger(MotorController.class);

    private final Motor model;
    private final MotorView view;

    // Listeners of class Motor
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();

    /**
     * Constructor initializes motor to OFF state by default
     */
    public MotorController(Motor model, MotorView view) {
        this.model = model;
        this.view = view;

        this.view.addButtonActionListener(e -> {
            if (e.getSource() == view.getButtonOn()) {
                this.switchOn();
            } else if (e.getSource() == view.getButtonOff()) {
                this.switchOff();
            }
        });

        this.addPropertyChangeListener(evt -> {
            if ("state".equals(evt.getPropertyName())) {
                this.view.updateState((MotorState) evt.getNewValue());
            }
        });
    }


    /**
     * Switches the motor on by setting state to ON
     */
    public void switchOn(){
        if(isSwitchedOff()){
           this.model.setState(MotorState.ON);

           final PropertyChangeEvent event = new PropertyChangeEvent(this, "state", MotorState.OFF, MotorState.ON);
           this.firePropertyChangeEvent(event);
        }
    }

    /**
     * Switches the motor off by setting state to OFF
     */
    public void switchOff(){
        if(isSwitchedOn()){
            this.model.setState(MotorState.OFF);

            final PropertyChangeEvent event = new PropertyChangeEvent(this, "state", MotorState.ON, MotorState.OFF);
            this.firePropertyChangeEvent(event);
        }
    }

    /**
     * Checks if motor is currently switched on
     * @return true if motor state is ON, false otherwise
     */
    public boolean isSwitchedOn(){
        return this.model.isSwitchedOn();
    }

    /**
     * Checks if motor is currently switched off
     * @return true if motor state is OFF, false otherwise
     */
    public boolean isSwitchedOff(){
        return this.model.isSwitchedOff();
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
