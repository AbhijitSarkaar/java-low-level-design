package CaseStudies.Splitwise.Entity;

public class BalancePerUser {
    int oweAmount;
    int toReceiveAmount;

    public BalancePerUser() {
        this.oweAmount = 0;
        this.toReceiveAmount = 0;
    }

    public int getOweAmount() {
        return oweAmount;
    }

    public void setOweAmount(int oweAmount) {
        this.oweAmount = oweAmount;
    }

    public int getToReceiveAmount() {
        return toReceiveAmount;
    }

    public void setToReceiveAmount(int toReceiveAmount) {
        this.toReceiveAmount = toReceiveAmount;
    }
}
