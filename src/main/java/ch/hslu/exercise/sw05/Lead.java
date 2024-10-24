package ch.hslu.exercise.sw05;

/**
 * Java Class for element Lead
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Lead extends ChemicalElement {

    /**
     * Main method as entry point of the program
     * Demonstrates usage of the Lead class
     *
     * @param args Command line arguments (not used)
     */
    public static void main(final String[] args){
        Lead lead = new Lead(20F, 327.462F,  1749F, "Lead", 14);

        System.out.println("Name: " + lead.getFullName());
        System.out.println("Current temperature: " + lead.getTemperaturInCelsius());
    }

    public Lead(float temperatur,float minLiquid, float minGas, String fullName, int elementNumber){
        super(temperatur, minLiquid, minGas, fullName, elementNumber);
    }
}

