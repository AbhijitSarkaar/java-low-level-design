package DesignPatterns.FactoryPattern.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        Circle circle = (Circle) ShapeFactory.createShape(ShapeType.CIRCLE);
        Square square = (Square) ShapeFactory.createShape(ShapeType.SQUARE);

        circle.computeArea();
        square.computeArea();
    }
}
