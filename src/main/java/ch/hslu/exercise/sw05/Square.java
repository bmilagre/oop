package ch.hslu.exercise.sw05;

/**
 * Java Class for square element
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Square extends Shape {
    private int length;

    /**
     * Main method as entry point of the program
     * Demonstrates usage of the Square class
     *
     * @param args Command line arguments (not used)
     */
    public static void main(final String[] args){
        Square square = new Square(2,2, 12);

        System.out.println("X Value: " + square.getX());
        System.out.println("Y Value: " + square.getY());
        System.out.println("Area: " + square.getArea());
    }

    public Square(final int x, final int y, final int length){
        super(x,y);
        this.length = length;
    }

    public void changeDimension(int newLength){
        this.length = newLength;
    }

    public int getLenght(){
        return this.length;
    }

    @Override
    public int getPerimeter(){
        return (4 * this.length);
    }

    @Override
    public int getArea(){
        return (int) Math.pow(this.length, 2);
    }
}
