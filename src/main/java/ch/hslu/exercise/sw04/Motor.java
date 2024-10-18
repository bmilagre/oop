package ch.hslu.exercise.sw04;

/**
 * Java class for Motor component
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Motor implements Switchable {

    private boolean motorRunning;

    public void switchOn(){
        this.motorRunning = true;
    }

    public void switchOff(){
        this.motorRunning = false;
    }

    public boolean isSwitchedOn(){
        return this.motorRunning;
    }

    public boolean isSwitchedOff(){
        return this.motorRunning;
    }

}

