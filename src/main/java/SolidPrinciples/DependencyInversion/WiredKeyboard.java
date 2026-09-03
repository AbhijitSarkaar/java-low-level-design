package SolidPrinciples.DependencyInversion;

public class WiredKeyboard implements Keyboard {
    @Override
    public void getSpecifications() {
        System.out.println("WiredKeyboard.getSpecifications()");
    }
}
