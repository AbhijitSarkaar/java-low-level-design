package DesignPatterns.BridgePattern;

public class Dog extends LivingThings {

    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breathProcess() {
        breatheImplementor.breath();
    }
}
