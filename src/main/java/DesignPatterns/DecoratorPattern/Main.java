package DesignPatterns.DecoratorPattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------");

        PlainPizza plainPizza = new PlainPizza();
        plainPizza.getDescription();

        System.out.println("------------");

        CheeseDecorator cheesePizza = new CheeseDecorator(plainPizza);
        cheesePizza.getDescription();

        System.out.println("------------");

        PepperoniDecorator pepperoniPizza = new PepperoniDecorator(plainPizza);
        pepperoniPizza.getDescription();

        System.out.println("------------");

        PepperoniDecorator pepperoniWithCheesePizza = new PepperoniDecorator(new CheeseDecorator(plainPizza));
        pepperoniWithCheesePizza.getDescription();

    }
}
