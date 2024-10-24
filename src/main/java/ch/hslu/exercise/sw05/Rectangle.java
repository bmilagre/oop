package ch.hslu.exercise.sw05;

/**
 * Java Class for Rectangle element
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Rectangle extends Shape {
    private int width;
    private int height;

    /**
     * Main method as entry point of the program
     * Demonstrates usage of the Rectangle class
     *
     * @param args Command line arguments (not used)
     */
    public static void main(final String[] args){
        Rectangle rectangle = new Rectangle(5, 10, 20, 15);

        System.out.println("X Value: " + rectangle.getX());
        System.out.println("Y Value: " + rectangle.getY());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }

    public Rectangle(final int x, final int y, final int width, final int height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public void changeDimension(int newWidth, int newHeight){
        this.width = newWidth;
        this.height = newHeight;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    @Override
    public int getPerimeter(){
        return (2 * this.width) + (2 * this.height);
    }

    @Override
    public int getArea(){
        return (this.width * this.height) / 2;
    }
}

