package ch.hslu.exercise.sw05;

/**
 * Java class for Motor component
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Motor implements CountingSwitchable {

    private boolean motorRunning;
    private long countSwitchable;

    public void switchOn(){
        this.countSwitchable++;
        this.motorRunning = true;

    }

    public void switchOff(){
        this.countSwitchable++;
        this.motorRunning = false;
    }

    public boolean isSwitchedOn(){
        return this.motorRunning == true;
    }

    public boolean isSwitchedOff(){
        return this.motorRunning == false;
    }

    public long getSwitchCount(){
        return this.countSwitchable;
    }
}
