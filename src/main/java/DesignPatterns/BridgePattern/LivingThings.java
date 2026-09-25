package DesignPatterns.BridgePattern;

public abstract class LivingThings {

    BreatheImplementor breatheImplementor;

    LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    abstract void breathProcess();
}
