package DesignPatterns.FactoryPattern.FactoryMethod;

public class Square implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Square.computeArea()");
    }
}
