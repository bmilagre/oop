package ch.hslu.exercise.sw08;

/**
 * Java Class for element circle
 *
 * @author Bruno Milagre
 * @version 1.0
 */

public class Circle extends Shape{
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

        // Exercise 1.3 h
        Shape circleShape = new Circle(6,6, 4);
        System.out.println("circleShape x: " + circleShape.getX());
        System.out.println("circleShape y: " + circleShape.getX());
        System.out.println("circleShape perimeter: " + circleShape.getPerimeter());

        // Exercise 1.3 i
        System.out.println("Trying to call move(x, y) method...");
        circleShape.move(3, 5);

        System.out.println("Trying to call getDiameter(x, y) method...");
        //circleShape.getDiameter() -> Does not exist in Shape Class
    }

    public Circle(int x, int y, int diameter){
        super(x, y);
        this.diameter = diameter;
    }

    public final void setDiameter(int diameter){
        this.diameter = diameter;
    }

    public final int getDiameter(){
        return this.diameter;
    }

    @Override
    public final int getPerimeter(){
        return (int)(this.diameter * Math.PI);
    }

    @Override
    public final int getArea(){
        return (int)(Math.pow((double) this.diameter / 2, 2) * Math.PI);
    }
}
