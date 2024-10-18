package ch.hslu.exercise.sw04;

public class Point{
    private int x;
    private int y;

    /**
     * Konstruktor für Objekte der Klasse Point
     */
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getQuadrant(){
        if(this.x > 0 && this.y > 0){
            return 1;
        } else if(this.x < 0 && this.y > 0){
            return 2;
        } else if(this.x < 0 && this.y < 0){
            return 3;
        } else if (this.x > 0 && this.y < 0){
            return 4;
        } else {
            return 0;
        }
    }

    public void setXValue(int x){
        this.x = x;
    }

    public void setYValue(int y){
        this.y = y;
    }

    public int getXValue(){
        return this.x;
    }

    public int getYValue(){
        return this.y;
    }
}

