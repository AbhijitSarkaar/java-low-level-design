package DesignPatterns.StatePattern.VendingMachine;

public class ItemShelf {
    int code;
    Item item;
    boolean soldOut;

    public ItemShelf(int code) {
        this.code = code;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
}
