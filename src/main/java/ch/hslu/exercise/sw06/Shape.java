package ch.hslu.exercise.sw06;

/**
 * Basic Class for a shape
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public abstract class Shape {
    private int x;
    private int y;

    protected Shape(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public final void move(final int newX, final int newY){
        this.x = newX;
        this.y = newY;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public abstract int getPerimeter();

    public abstract int getArea();
}

