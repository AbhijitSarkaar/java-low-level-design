package CaseStudies.Splitwise.Controller;

import CaseStudies.Splitwise.Entity.BalanceSheet;
import CaseStudies.Splitwise.Split.Split;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BalanceSheetController {

    Map<UUID, BalanceSheet> balanceSheets;

    public BalanceSheetController() {
        this.balanceSheets = new HashMap<>();
    }

    public void createBalanceSheet(UUID userId) {
        balanceSheets.put(userId, new BalanceSheet());
    }

    public void addOweAmount(UUID providerId, UUID recipientId, int amount) {
        BalanceSheet balanceSheet = balanceSheets.computeIfAbsent(providerId, k -> new BalanceSheet());
        balanceSheet.addOweAmount(recipientId, amount);

    }

    public void addToReceiveAmount(UUID providerId, UUID recipientId, int amount) {
        BalanceSheet balanceSheet = balanceSheets.computeIfAbsent(recipientId, k -> new BalanceSheet());
        balanceSheet.addToReceiveAmount(providerId, amount);
    }

    public void updateBalanceSheet(UUID userId, List<Split> splits) {
        for(Split split: splits) {
            if(split.getUser().getUserId().equals(userId)) continue;

            // balance sheet of user making payment
            addToReceiveAmount(split.getUser().getUserId(), userId, split.getAmountOwe());

            // balance sheet of users participating in the expense
            addOweAmount(split.getUser().getUserId(), userId, split.getAmountOwe());
        }
    }

    public void display(UUID userId) {
        System.out.println("balance sheet of user " + userId);
        balanceSheets.get(userId).display();
    }
}