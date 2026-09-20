package DesignPatterns.StatePattern.VendingMachine;

public class Inventory {
    ItemShelf[] itemShelf;

    public Inventory(int noOfItems) {
        itemShelf = new ItemShelf[noOfItems];
    }

    public void setItemShelf(ItemShelf[] itemShelf) {
        System.out.println("Inventory.setItemShelf()");
        this.itemShelf = itemShelf;
    }

    public void addItem(Item item, int codeNumber) {}

    public Item getItem(int codeNumber) {
        for(int i = 0; i < itemShelf.length; ++i) {
            if(itemShelf[i].code == codeNumber) return itemShelf[i].item;
        }
        return null;
    }

    public void updateSoldOutItem(int codeNumber) {}

    public ItemShelf[] getInventory() {
        return itemShelf;
    }
}
