package DesignPatterns.StatePattern.VendingMachine;

public class Item {
    ItemType type;
    int price;

    public void setType(ItemType type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
