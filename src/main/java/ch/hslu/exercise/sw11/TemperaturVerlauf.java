package ch.hslu.exercise.sw11;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemperaturVerlauf implements ITemperaturVerlauf {
    public enum TemperaturEventType {
        MIN,
        MAX
    }

    public final List<Temperatur> temperaturen;

    // Listeners of class TemperaturVerlauf
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();

    public TemperaturVerlauf() {
        this.temperaturen = new ArrayList<>();
    }

    @Override
    public void add(Temperatur temperatur) {
        if(this.max() != null && temperatur.compareTo(this.max()) >= 0) {
            final PropertyChangeEvent event = new PropertyChangeEvent(this, TemperaturEventType.MAX.name(), this.max(), temperatur);
            this.firePropertyChangeEvent(event);
        }

        if(this.min() != null && temperatur.compareTo(this.max()) <= 0) {
           final PropertyChangeEvent event = new PropertyChangeEvent(this, TemperaturEventType.MIN.name(), this.min(), temperatur);
            this.firePropertyChangeEvent(event);
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

    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.add(listener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.remove(listener);
    }

    private void firePropertyChangeEvent(PropertyChangeEvent event) {
        for(final PropertyChangeListener listener : this.changeListeners){
            listener.propertyChange(event);
        }
    }
}
