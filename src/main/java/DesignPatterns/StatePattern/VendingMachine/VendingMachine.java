package DesignPatterns.StatePattern.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    State state;
    List<Coin> coinList;
    Inventory inventory;

    public VendingMachine() {
        state = new IdleState();
        coinList = new ArrayList<>();
        inventory = new Inventory(10);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
