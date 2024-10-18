package ch.hslu.exercise.sw04;

public class LineObject {
    private Point startPoint;
    private Point endPoint;

    public LineObject(int x1, int y1, int x2, int y2){
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2,y2);
    }

    public LineObject(Point startPoint, Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }


    public Point getStartPoint(){
        return new Point(this.startPoint.getXValue(), this.startPoint.getYValue());
    }

    public Point getEndPoint(){
        return new Point(this.endPoint.getXValue(), this.endPoint.getYValue());
    }

    public void moveStartPoint(int x, int y){
        this.startPoint.setXValue(x);
        this.startPoint.setYValue(y);
    }

    public void moveEndPoint(int x, int y){
        this.endPoint.setXValue(x);
        this.endPoint.setYValue(y);
    }
}

