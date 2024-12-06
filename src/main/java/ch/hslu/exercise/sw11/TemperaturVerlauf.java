package ch.hslu.exercise.sw11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemperaturVerlauf implements ITemperaturVerlauf {
    public final List<Temperatur> temperaturen;

    // Listeners of class TemperaturVerlauf
    private final List<TemperaturEventListener> changeListeners = new ArrayList<>();

    public TemperaturVerlauf() {
        this.temperaturen = new ArrayList<>();
    }

    @Override
    public void add(Temperatur temperatur) {
        if(this.max() != null && temperatur.compareTo(this.max()) > 0) {
            final TemperaturEvent event = new TemperaturEvent(this, this.max(), temperatur, TemperaturEventType.MAX);
            this.fireTemperaturChangeEvent(event);
        }

        if(this.min() != null && temperatur.compareTo(this.max()) < 0) {
            final TemperaturEvent event = new TemperaturEvent(this, this.min(), temperatur, TemperaturEventType.MIN);
            this.fireTemperaturChangeEvent(event);
        }

        temperaturen.add(temperatur);
    }

    @Override
    public void clear() {
        temperaturen.clear();
    }

    @Override
    public int getCount() {
        return temperaturen.size();
    }

    @Override
    public Temperatur max(){
        if(temperaturen.isEmpty()){
            return null;
        }

        return Collections.max(temperaturen);
    }

    @Override
    public Temperatur min(){
        if(temperaturen.isEmpty()){
            return null;
        }

        return Collections.min(temperaturen);
    }

    @Override
    public float getAverage(){
        float sum = 0;

        for(final Temperatur temp: temperaturen){
            sum += temp.getCelsius();
        }

        return sum / temperaturen.size();
    }

    @Override
    public String toString() {
        return "[TemperaturVerlauf]: Anzahl Temperaturen: " + this.getCount() + "; Durchschnitt: " + this.getAverage() + "; Min " + min() + "; Max " + max();
    }

    public void addTemperaturChangeEventListener(final TemperaturEventListener listener) {
        if(listener != null) {
            this.changeListeners.add(listener);
        }
    }

    public void removeTemperaturChangeEventListener(final TemperaturEventListener listener) {
        if(listener != null) {
            this.changeListeners.remove(listener);
        }
    }

    private void fireTemperaturChangeEvent(TemperaturEvent event) {
        for(final TemperaturEventListener listener : this.changeListeners){
            listener.temperaturChangeEvent(event);
        }
    }
}
