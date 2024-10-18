package ch.hslu.exercise.sw04;

/**
 * Java class for CarLight component
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class CarLight implements Switchable {

    private boolean lightRunning;

    public void switchOn(){
        this.lightRunning = true;
    }

    public void switchOff(){
        this.lightRunning = false;
    }

    public boolean isSwitchedOn(){
        return this.lightRunning == true;
    }

    public boolean isSwitchedOff(){
        return this.lightRunning == false;
    }
}
