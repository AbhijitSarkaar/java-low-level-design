package DesignPatterns.FactoryPattern.FactoryMethod;

public class ShapeFactoryMethod {
    public static Shape getShapeInstance(ShapeType shapeType) {
        if(shapeType == ShapeType.CIRCLE) {
            return new CircleFactory().createShape();
        }
        else if(shapeType == ShapeType.SQUARE) {
            return new SquareFactory().createShape();
        }
        else {
            return null;
        }
    }
}
