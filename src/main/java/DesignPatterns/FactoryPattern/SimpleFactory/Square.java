package DesignPatterns.FactoryPattern.SimpleFactory;

public class Square implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Square.computeArea()");
    }
}
