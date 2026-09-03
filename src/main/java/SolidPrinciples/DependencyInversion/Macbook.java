package SolidPrinciples.DependencyInversion;

public class Macbook {
    private final Keyboard keyboard;

    Macbook(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void display() {
        this.keyboard.getSpecifications();
    }

}
