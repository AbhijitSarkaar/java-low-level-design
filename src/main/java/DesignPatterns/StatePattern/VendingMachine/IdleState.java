package DesignPatterns.StatePattern.VendingMachine;

import java.util.ArrayList;

public class IdleState extends State {

    public IdleState() {
    }

    public IdleState(VendingMachine machine) {
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        System.out.println("idle state");
        machine.setState(new HasMoneyState());
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }

}
