package DesignPatterns.FactoryPattern.SimpleFactory;

public class ShapeFactory {
    public static Shape createShape(ShapeType shapeType) {
        if(shapeType == ShapeType.CIRCLE) {
            return new Circle();
        }
        else if(shapeType == ShapeType.SQUARE) {
            return new Square();
        }
        else {
            return null;
        }
    }
}
