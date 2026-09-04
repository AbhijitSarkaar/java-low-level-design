package DesignPatterns.FactoryPattern.AbstractFactory;

public class CarFactoryProducer {
    public static Object getCarFactory(String type) {
        if(type == "interior") {
            return new CarInteriorFactory();
        }
        else if(type == "exterior") {
            return new CarExteriorFactory();
        }
        else {
            return null;
        }
    }
}
