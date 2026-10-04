package DesignPatterns.MementoPattern;

public class Main {
    public static void main(String[] args) {

        ConfigurationCaretaker configurationCaretaker = new ConfigurationCaretaker();
        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(5, 10);

        ConfigurationMemento snapshot1 = configurationOriginator.createMemento();
        configurationCaretaker.addMemento(snapshot1);

        configurationOriginator.setHeight(7);
        configurationOriginator.setWidth(12);

        ConfigurationMemento snapshot2 = configurationOriginator.createMemento();
        configurationCaretaker.addMemento(snapshot2);

        configurationOriginator.setHeight(9);
        configurationOriginator.setWidth(14);

        ConfigurationMemento restoredMemento = configurationCaretaker.undo();
        configurationOriginator.restoreMemento(restoredMemento);

        System.out.println("height: " + configurationOriginator.height + " width: " + configurationOriginator.width);

    }
}
