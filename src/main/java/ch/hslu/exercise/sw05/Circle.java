package ch.hslu.exercise.sw05;

/**
 * Java Class for element circle
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Circle extends Shape {
    private int diameter;

    /**
     * Main method as entry point of the program
     * Demonstrates usage of the Circle class
     *
     * @param args Command line arguments (not used)
     */
    public static void main(final String[] args){
        Circle circle = new Circle(2,2, 12);

        System.out.println("X Value: " + circle.getX());
        System.out.println("Y Value: " + circle.getY());
        System.out.println("Diameter: " + circle.getDiameter());
    }

    public Circle(int x, int y, int diameter){
        super(x, y);
        this.diameter = diameter;
    }

    public void setDiameter(int diameter){
        this.diameter = diameter;
    }

    public int getDiameter(){
        return this.diameter;
    }

    @Override
    public int getPerimeter(){
        return (int)(this.diameter * Math.PI);
    }

    @Override
    public int getArea(){
        return (int)(Math.pow((double) this.diameter / 2, 2) * Math.PI);
    }
}
