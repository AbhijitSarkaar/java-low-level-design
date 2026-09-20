package DesignPatterns.StatePattern.VendingMachine;

import java.util.List;

public class HasMoneyState extends State {
    @Override
    public void clickOnProductSelectionButton(VendingMachine machine) {
        System.out.println("has money state");
        machine.setState(new ProductSelectionState());
    }

    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("insert coin");
        machine.getCoinList().add(coin);
    }

    public List<Coin> refundFullMoney(VendingMachine machine) {
        machine.setState(new IdleState(machine));
        return machine.getCoinList();
    }
}
