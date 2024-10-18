package ch.hslu.exercise.sw05;

/**
 * Java class for CarLight component
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class CarLight implements CountingSwitchable {

    private boolean lightRunning;
    private long countSwitchable;

    public void switchOn(){
        this.countSwitchable++;
        this.lightRunning = true;
    }

    public void switchOff(){
        this.countSwitchable++;
        this.lightRunning = false;
    }

    public boolean isSwitchedOn(){
        return this.lightRunning == true;
    }

    public boolean isSwitchedOff(){
        return this.lightRunning == false;
    }

    public long getSwitchCount(){
        return this.countSwitchable;
    }
}
