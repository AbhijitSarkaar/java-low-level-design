package DesignPatterns.DecoratorPattern;

public class PlainPizza implements Pizza {
    @Override
    public void getDescription() {
        System.out.println("PlainPizza.getDescription()");
    }
}
