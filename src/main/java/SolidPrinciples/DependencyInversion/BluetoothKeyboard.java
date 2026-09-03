package SolidPrinciples.DependencyInversion;

public class BluetoothKeyboard implements Keyboard {
    @Override
    public void getSpecifications() {
        System.out.println("BluetoothKeyboard.getSpecifications()");
    }
}
