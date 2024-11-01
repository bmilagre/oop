package ch.hslu.exercise.sw07;

import java.util.Objects;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    /**
     * Konstruktor für Objekte der Klasse Point
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.moveRelative(point);
    }

    public int getQuadrant() {
        if (this.x > 0 && this.y > 0) {
            return 1;
        } else if (this.x < 0 && this.y > 0) {
            return 2;
        } else if (this.x < 0 && this.y < 0) {
            return 3;
        } else if (this.x > 0 && this.y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public void setXValue(int x) {
        this.x = x;
    }

    public void setYValue(int y) {
        this.y = y;
    }

    public int getXValue() {
        return this.x;
    }

    public int getYValue() {
        return this.y;
    }

    /*
     * Set relative values via x and y values.
     */
    public void moveRelative(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*
     * Set relative values via point object.
     */
    public void moveRelative(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    /*
     * Set relative values via polar coordinate system.
     */
    public void moveRelative(double angle, int amount) {
        this.x = (int) (amount * Math.cos(angle));
        this.y = (int) (amount * Math.sin(angle));
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Point point)) {
            return false;
        }

        return Objects.equals(point.x, this.x) && Objects.equals(point.y, this.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

    @Override
    public int compareTo(Point other) {
        return Long.compare(this.x, other.x);
    }
}
