package ch.hslu.exercise.sw10;

public interface ITemperaturVerlauf {
    void add(Temperatur temperatur);
    void clear();
    int getCount();
    Temperatur max();
    Temperatur min();
    float getAverage();
}
