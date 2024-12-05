package ch.hslu.exercise.sw11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeasuringPointProcess {
    private final List<MeasuringPoint> measuringPoints;

    public MeasuringPointProcess() {
        this.measuringPoints = new ArrayList<>();
    }

    public void add(MeasuringPoint measuringPoint) {
        measuringPoints.add(measuringPoint);
    }

    public void clear() {
        measuringPoints.clear();
    }

    public int getCount() {
        return measuringPoints.size();
    }

    public MeasuringPoint max() {
        return measuringPoints.isEmpty() ? null : Collections.max(measuringPoints);
    }

    public MeasuringPoint min() {
        return measuringPoints.isEmpty() ? null : Collections.min(measuringPoints);
    }

    public float getAverage() {
        return (float) measuringPoints.stream()
                .mapToDouble(mp -> mp.getTemperatur().getCelsius())
                .average()
                .orElse(Double.NaN);
    }

    @Override
    public String toString() {
        return "[TemperaturVerlauf]: Anzahl Messpunkte: " + this.getCount() + "; Durchschnitt: " + this.getAverage() + "; Min: " + min() + "; Max: " + max();
    }
}
