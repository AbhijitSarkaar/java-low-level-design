package DesignPatterns.StatePattern.VendingMachine;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        try {
            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("clicking on insert coin button");
            System.out.println("|");

            State vendingState = vendingMachine.getState();
            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getState();
            vendingState.insertCoin(vendingMachine, Coin.NICKEL);
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);

            System.out.println("|");
            System.out.println("clicking on product selection button");
            System.out.println("|");

            vendingState.clickOnProductSelectionButton(vendingMachine);
            vendingState = vendingMachine.getState();
            vendingState.chooseProduct(vendingMachine, 102);

        } catch (Exception e) {}
    }

    public static void fillUpInventory(VendingMachine vendingMachine) {
        try {
            ItemShelf[] slots = vendingMachine.getInventory().getInventory();
            for(int i = 0; i < slots.length; ++i) {
                Item newItem = new Item();
                if(i >= 0 && i < 3) {
                    newItem.setType(ItemType.COKE);
                    newItem.setPrice(12);
                }
                else if(i >= 3 && i < 5) {
                    newItem.setType(ItemType.PEPSI);
                    newItem.setPrice(9);
                }
                else if(i >= 5 && i < 7) {
                    newItem.setType(ItemType.JUICE);
                    newItem.setPrice(13);
                }
                else if(i >= 7 && i < 10) {
                    newItem.setType(ItemType.SODA);
                    newItem.setPrice(7);
                }
                slots[i] = new ItemShelf(100 + i + 1);
                slots[i].setItem(newItem);
                slots[i].setSoldOut(false);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for(int i = 0; i < slots.length; ++i) {
            if(slots[i] != null) {
                System.out.println("CodeNumber " + slots[i].code + " Item " + slots[i].item.type + " Price " + slots[i].item.price + " isAvailable " + !slots[i].soldOut);
            }
        }
    }
}
