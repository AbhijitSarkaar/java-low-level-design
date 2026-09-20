package DesignPatterns.StatePattern.VendingMachine;

import java.util.List;

public class ProductSelectionState extends State {
    @Override
    public Item chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("product selection state");
        Item item = machine.getInventory().getItem(codeNumber);
        try {
            int paidByUser = 0;
            for(Coin coin: machine.getCoinList()) {
                paidByUser = paidByUser + coin.value;
            }

            System.out.println("amount paid by user " + paidByUser);

            if(paidByUser < item.getPrice()) {
                refundFullMoney(machine);
                throw new Exception("Insufficient money");
            }

            if(paidByUser >= item.getPrice()) {
                if(paidByUser > item.getPrice()) {
                    getChange(paidByUser - item.getPrice());
                }
                machine.setState(new DispenseState(machine, codeNumber));
            }
            return item;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {
        System.out.println("extra money " + returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) {
        System.out.println("refund money returned");
        return machine.getCoinList();
    }
}
