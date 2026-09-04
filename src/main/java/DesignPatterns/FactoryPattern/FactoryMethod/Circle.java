package DesignPatterns.FactoryPattern.FactoryMethod;

public class Circle implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Circle.computeArea()");
    }
}
