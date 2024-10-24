package ch.hslu.exercise.sw06;

public class Calculator implements ArithmeticInterface {

    @Override
    public float addition(Float firstParameter, Float secondParameter) {
        return firstParameter + secondParameter;
    }
}
