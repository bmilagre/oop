package ch.hslu.exercise.sw11;

import java.time.LocalDateTime;

public class MeasuringPoint implements Comparable<MeasuringPoint> {
    private final LocalDateTime time;
    private final Temperatur temperatur;

    public MeasuringPoint(final LocalDateTime time, final Temperatur temperatur) {
        this.time = time;
        this.temperatur = temperatur;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Temperatur getTemperatur() {
        return temperatur;
    }

    @Override
    public int compareTo(MeasuringPoint otherPoint) {
        return Float.compare(this.temperatur.getKelvin(), otherPoint.temperatur.getKelvin());
    }

    public String toString() {
        return "Messpunkt{Time=" + time + ", " + temperatur + '}';
    }
}
