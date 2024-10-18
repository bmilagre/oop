package ch.hslu.exercise.sw03;

/**
 * Beschreiben Sie hier die Klasse Point.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Point{

    private int x;
    private int y;

    /**
     * Konstruktor für Objekte der Klasse Point
     */
    public Point(int x, int y){
        // Instanzvariable initialisieren
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
}

