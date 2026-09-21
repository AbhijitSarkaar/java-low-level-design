package DesignPatterns.AdapterPattern.Client;

import DesignPatterns.AdapterPattern.Adaptee.WeightMachineForBabies;
import DesignPatterns.AdapterPattern.Adapter.WeightMachineAdapter;
import DesignPatterns.AdapterPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getPoundInKg());
    }
}
