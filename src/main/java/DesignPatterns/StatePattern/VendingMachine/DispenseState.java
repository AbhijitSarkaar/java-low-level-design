package DesignPatterns.StatePattern.VendingMachine;

public class DispenseState extends State {
    public DispenseState(VendingMachine machine, int codeNumber) {
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) {
        System.out.println("dispense state");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setState(new IdleState(machine));
        return item;
    }
}
