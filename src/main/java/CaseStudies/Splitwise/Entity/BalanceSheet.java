package CaseStudies.Splitwise.Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BalanceSheet {
    Map<UUID, BalancePerUser> balances;

    public BalanceSheet() {
        this.balances = new HashMap<>();
    }

    public void addOweAmount(UUID userId, int amount) {
        BalancePerUser balance = balances.computeIfAbsent(userId, k -> new BalancePerUser());
        balance.setOweAmount(amount);
    }

    public void addToReceiveAmount(UUID userId, int amount) {
        BalancePerUser balance = balances.computeIfAbsent(userId, k -> new BalancePerUser());
        balance.setToReceiveAmount(amount);
    }

    public void display() {
        balances.forEach((userId,balance) -> {
            System.out.println("user id " + userId);
            System.out.println("owe amount balance " + balance.getOweAmount());
            System.out.println("to receive amount balance " + balance.getToReceiveAmount());
        });
    }
}
