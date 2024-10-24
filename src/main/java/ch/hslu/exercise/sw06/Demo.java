package ch.hslu.exercise.sw06;

/**
 * Beschreiben Sie hier die Klasse Demo.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Demo {

    public int max(int a, int b){
        if(a > b){
            return a;
        } else if(b > a) {
            return b;
        }

        return a;
    }

    public int min(int a, int b){
        if(a < b){
            return a;
        }

        return b;
    }


    /**
     *
     * 1.3c: Erste und Zweite Parameter werden grundsätzlich schneller als der Dritte ausgegeben (ist allerdings in ms Bereich wahrscheinlich)
     *
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
     *
     * 1.3c: Erste und Zweite Parameter werden grundsätzlich schneller als der Dritte ausgegeben (ist allerdings in ms Bereich wahrscheinlich)
     *
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

    public void callIterationFor(){
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }

    public void callIterationWhile(){
        int i = 0;
        int max = 10;

        while(i <= 10){
            System.out.println(i);
            i++;
        }
    }

    public void callIterationDoWhile(){
        int i = 1;
        int max = 10;

        do {
            System.out.println(i);
            i++;
        } while(i < max);
    }

    public void callIterationFloatWithWhile(){
        float initialValue = 0.9f;
        int numberOfRounds = 0;

        while(initialValue < 1.0f){
            initialValue += 0.000025f;
            numberOfRounds++;
        }

        System.out.println("Number of rounds: " + numberOfRounds);
    }

    public void callIterationFloatWhileFor(){
        float initialValue = 0.9f;

        for(int i = 0; i < 4000; i++){
            initialValue += 0.000025f;
        }

        System.out.println("Result: " + initialValue);
    }

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
