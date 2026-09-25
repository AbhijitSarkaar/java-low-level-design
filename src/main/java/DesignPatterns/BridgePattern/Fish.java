package DesignPatterns.BridgePattern;

public class Fish extends LivingThings {

    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breathProcess() {
        breatheImplementor.breath();
    }
}
