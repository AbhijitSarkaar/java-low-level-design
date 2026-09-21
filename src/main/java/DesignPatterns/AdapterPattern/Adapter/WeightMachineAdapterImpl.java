package DesignPatterns.AdapterPattern.Adapter;

import DesignPatterns.AdapterPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getPoundInKg() {
        double weightInPound = weightMachine.getWeightInPound();
        double weightInKg = weightInPound * 0.45;
        return weightInKg;
    }
}
