package ch.hslu.exercise.sw05;

/**
 * Java Class for element Mercury
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Mercury extends ChemicalElement {

    /**
     * Main method as entry point of the program
     * Demonstrates usage of the Mercury class
     *
     * @param args Command line arguments (not used)
     */
    public static void main(final String[] args){
        Mercury mercury = new Mercury(20F, -38.829F,  356.619F, "Mercury", 12);

        System.out.println("Name: " + mercury.getFullName());
        System.out.println("Current temperature: " + mercury.getTemperaturInCelsius());
    }

    public Mercury(float temperatur,float minLiquid, float minGas, String fullName, int elementNumber){
        super(temperatur, minLiquid, minGas, fullName, elementNumber);
    }
}
