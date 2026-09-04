package DesignPatterns.DecoratorPattern;

public abstract class PizzaDecorator implements Pizza {
    public Pizza decoratedPizza;

    PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }
}
