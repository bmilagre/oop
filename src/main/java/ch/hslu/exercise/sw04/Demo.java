package ch.hslu.exercise.sw04;

/**
 * Demo class with simple methos to getting familiar with iterations and functions
 *
 * @author Bruno Milagre
 * @version 1
 */
public class Demo {

    /**
     * Returns the highest number given as parameter by checking if {@code a} is higher than{@code b}
     *
     * @param   a First number to check
     * @param   b Seconds number to check
     *
     * @return  A integer which represents the highest number passed as parameter
     */
    public int max(int a, int b){
        if(a > b){
            return a;
        }

        return b;
    }

    /**
     * Returns the lowest number given as parameter by checking if {@code a} is lower than{@code b}
     *
     * @param   a First number to check
     * @param   b Seconds number to check
     *
     * @return  A integer which represents the lowest number passed as parameter
     */
    public int min(int a, int b){
        if(a < b){
            return a;
        }

        return b;
    }


    /**
     * Returns the highest number given via the parameters by checking if one parameter is higher than the others by checking via if else statements
     *
     * @param   a First number to check
     * @param   b Seconds number to check
     * @param   c Third number to check
     *
     * @return  A integer which represents the highest number passed as parameter
     */
    public int max(int a, int b, int c) {
        if(a > b && a > c){
            return a;
        } else if(b > a && b > c){
            return b;
        } else if(c > a && c > b) {
            return c;
        }

        return 0;
    }

    /**
     * Returns the highest number given via the parameters by checking if one parameter is higher than the others by checking via if statement
     *
     * @param   a First number to check
     * @param   b Seconds number to check
     * @param   c Third number to check
     *
     * @return  A integer which represents the highest number passed as parameter
     */
    public int max2(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }

        if(b > a && b > c){
            return b;
        }

        return c;
    }

    /**
     * Iterates from 0 to 10 as a for loop
     *
     */
    public void callIterationFor(){
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }

    /**
     * Iterates from 0 to 10 as a while loop
     *
     */
    public void callIterationWhile(){
        int i = 0;
        int max = 10;

        while(i <= 10){
            System.out.println(i);
            i++;
        }
    }

    /**
     * Iterates from 0 to 10 as a do while loop
     *
     */
    public void callIterationDoWhile(){
        int i = 1;
        int max = 10;

        do {
            System.out.println(i);
            i++;
        } while(i < max);
    }

    /**
     * Iterates from 0.9f until the float value 1.0 reaches with a while loop.
     *
     */
    public void callIterationFloatWithWhile(){
        float initialValue = 0.9f;
        int numberOfRounds = 0;

        while(initialValue < 1.0f){
            initialValue += 0.000025f;
            numberOfRounds++;
        }

        System.out.println("Number of rounds: " + numberOfRounds);
    }

    /**
     * Iterates from 0.9f until the float value 1.0 reaches with a for loop..
     *
     */
    public void callIterationFloatWithFor(){
        float initialValue = 0.9f;

        for(int i = 0; i < 4000; i++){
            initialValue += 0.000025f;
        }

        System.out.println("Result: " + initialValue);
    }

    /**
     * Prints out a box with the definend {@code width} and {@code height} values
     *
     * @param   width the desired width of the box
     * @param   height the desired height of the box
     */
    public void printBox(final int width, final int height){
        String widthWall = "";
        String heightWall = "";

        for(int i = 0; i < width; i++){
            widthWall += "#";
        }

        for(int i = 0; i < width; i++){
            if (i != 0 && i != (width - 1)) {
                heightWall += " ";
            } else {
                heightWall += "#";
            }
        }

        for(int i = 0; i < height; i++){
            if (i != 0 && i != (height - 1)) {
                System.out.println(heightWall);
            } else {
                System.out.println(widthWall);
            }
        }
    }
}
