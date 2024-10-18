package ch.hslu.exercise.sw04;

public class Line {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Line(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Point getStartPoint(){
        Point startPoint = new Point(this.x1, this.y1);
        return startPoint;
    }

    public Point getEndPoint(){
        Point endPoint = new Point(this.x2, this.y2);
        return endPoint;
    }

    public void moveStartPoint(int x, int y){
        this.x1 = x;
        this.y1 = y;
    }

    public void moveEndPoint(int x, int y){
        this.x2 = x;
        this.y2 = y;
    }
}

