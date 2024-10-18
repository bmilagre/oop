package ch.hslu.exercise.sw05;

/**
 * Java Class for element circle
 *
 * @author Bruno Milagre
 * @version 1.0
 */
public class Circle extends Shape {
    private int diameter;

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
        return (int)(Math.pow(this.diameter / 2, 2) * Math.PI);
    }
}
