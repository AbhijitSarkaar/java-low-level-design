package DesignPatterns.FactoryPattern.FactoryMethod;

public class CircleFactory implements ShapeFactory {
    @Override
    public Circle createShape() {
        return new Circle();
    }
}
