package ch.hslu.exercise.sw05;

/**
 * Java Class for rectangle element
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Rectangle extends Shape {
    private int width;
    private int height;

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

