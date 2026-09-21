package DesignPatterns.CompositePattern.Calculator;

public class Number implements Entity {

    int value;

    public Number(int num) {
        value = num;
    }

    @Override
    public int compute() {
        return value;
    }
}
