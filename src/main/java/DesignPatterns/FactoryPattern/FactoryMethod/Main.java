package DesignPatterns.FactoryPattern.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Circle circle = (Circle) ShapeFactoryMethod.getShapeInstance(ShapeType.CIRCLE);
        Square square = (Square) ShapeFactoryMethod.getShapeInstance(ShapeType.SQUARE);

        circle.computeArea();;
        square.computeArea();
    }
}
