package ch.hslu.exercise.sw08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemperaturVerlauf implements ITemperaturVerlauf {
    private final List<Temperatur> temperaturen;

    public TemperaturVerlauf() {
        this.temperaturen = new ArrayList<>();
    }

    @Override
    public void add(Temperatur temperatur) {
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
        return Collections.max(temperaturen);
    }

    @Override
    public Temperatur min(){
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
}
