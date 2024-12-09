package ch.hslu.exercise.sw12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Java class for Car component
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Car implements Switchable, PropertyChangeListener {

    // Private member variables for motor and car light components
    private final Motor motor;
    private final CarLight carLight;

    private static final Logger LOG = LoggerFactory.getLogger(Car.class);

    /**
     * Constructor that initializes motor and car light
     */
    public Car(){
        this.motor = new Motor();
        this.carLight = new CarLight();

        this.motor.addPropertyChangeListener(this);
        this.carLight.addPropertyChangeListener(this);
    }

    /**
     * Switches on both motor and car light
     */
    public void switchOn(){
        this.motor.switchOn();
        this.carLight.switchOn();
    }

    /**
     * Switches off both motor and car light
     */
    public void switchOff(){
        this.motor.switchOff();
        this.carLight.switchOff();
    }

    /**
     * Checks if either motor or car light is on
     * @return true if motor or car light is running, false otherwise
     */
    public boolean isSwitchedOn(){
        return this.motor.isSwitchedOn() || this.carLight.isSwitchedOn();
    }

    /**
     * Checks if both motor and car light are off
     * @return true if both motor and car light are not running, false otherwise
     */
    public boolean isSwitchedOff(){
        return this.motor.isSwitchedOff() && this.carLight.isSwitchedOff();
    }

    @Override
    public void propertyChange(final PropertyChangeEvent event) {
        if(event.getNewValue() != event.getOldValue()){
            LOG.debug("Property changed: {} from {} to {}", event.getPropertyName(), event.getOldValue(), event.getNewValue());
        }
    }
}