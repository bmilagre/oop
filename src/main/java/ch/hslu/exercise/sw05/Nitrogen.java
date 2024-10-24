package ch.hslu.exercise.sw05;

/**
 * Java Class for element Nitrogen
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Nitrogen extends ChemicalElement {

    /**
     * Main method as entry point of the program
     * Demonstrates usage of the Nitrogen class
     *
     * @param args Command line arguments (not used)
     */
    public static void main(final String[] args){
        Nitrogen nitrogen = new Nitrogen(235.23F, 23.23F, 33, "Nitrogen", 2);

        System.out.println("Name: " + nitrogen.getFullName());
        System.out.println("Current temperature: " + nitrogen.getTemperaturInCelsius());
    }

    public Nitrogen(float temperatur,float minLiquid, float minGas, String fullName, int elementNumber){
        super(temperatur, minLiquid, minGas, fullName, elementNumber);
    }
}
