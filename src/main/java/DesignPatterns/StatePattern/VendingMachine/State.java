package DesignPatterns.StatePattern.VendingMachine;

import java.util.List;

public abstract class State {
    public void clickOnInsertCoinButton(VendingMachine Machine) throws Exception {
    }

    public void clickOnProductSelectionButton(VendingMachine Machine) throws Exception {
    }

    public void insertCoin(VendingMachine Machine, Coin coin) throws Exception {
    }

    public Item chooseProduct(VendingMachine Machine, int codeNumber) throws Exception {
        return null;
    }

    public int getChange(int returnChangeMoney) throws Exception {
        return returnChangeMoney;
    }

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        return null;
    }

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        return null;
    }

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
    }
}
