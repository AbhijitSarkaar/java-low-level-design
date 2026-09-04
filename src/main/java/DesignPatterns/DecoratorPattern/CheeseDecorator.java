package DesignPatterns.DecoratorPattern;

public class CheeseDecorator extends PizzaDecorator {
    CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void getDescription() {
        this.decoratedPizza.getDescription();
        System.out.println("Added :: CheeseDecorator.getDescription()");
    }
}
