package DesignPatterns.DecoratorPattern;

public class PepperoniDecorator extends PizzaDecorator {

    PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void getDescription() {
        this.decoratedPizza.getDescription();
        System.out.println("Added :: PepperoniDecorator.getDescription()");
    }
}
