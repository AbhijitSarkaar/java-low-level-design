package DesignPatterns.BridgePattern;

public class TreeBreathImplementation implements BreatheImplementor {
    @Override
    public void breath() {
        System.out.println("TreeBreathImplementation.breath()");
    }
}
