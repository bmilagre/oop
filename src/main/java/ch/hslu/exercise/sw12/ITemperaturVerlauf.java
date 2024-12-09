package ch.hslu.exercise.sw12;

public interface ITemperaturVerlauf {
    void add(Temperatur temperatur);
    void clear();
    int getCount();
    Temperatur max();
    Temperatur min();
    float getAverage();
}
