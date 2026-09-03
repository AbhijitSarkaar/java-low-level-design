package SolidPrinciples.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        WiredKeyboard wiredKeyboard = new WiredKeyboard();
        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard();

        Macbook macbook = new Macbook(wiredKeyboard);
        Macbook macbook1 = new Macbook(bluetoothKeyboard);

        macbook.display();
        macbook1.display();
    }
}
