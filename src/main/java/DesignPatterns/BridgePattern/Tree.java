package DesignPatterns.BridgePattern;

public class Tree extends LivingThings {

    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breathProcess() {
        breatheImplementor.breath();
    }
}
