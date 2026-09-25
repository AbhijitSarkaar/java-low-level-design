package DesignPatterns.BridgePattern;

public class Main {
    public static void main(String[] args) {

        LandBreathImplementation landBreathImplementation = new LandBreathImplementation();
        WaterBreathImplementation waterBreathImplementation = new WaterBreathImplementation();
        TreeBreathImplementation treeBreathImplementation = new TreeBreathImplementation();

        Dog dog = new Dog(new LandBreathImplementation());
        Fish fish = new Fish(new WaterBreathImplementation());
        Tree tree = new Tree(new TreeBreathImplementation());

        dog.breathProcess();
        fish.breathProcess();
        tree.breathProcess();

    }
}
