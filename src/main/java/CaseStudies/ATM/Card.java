package CaseStudies.ATM;

public class Card {
    private int bankBalance;
    static int PIN_NUMBER=112211;
    private UserBankAccount userBankAccount;

    public boolean isCorrectPinEntered(int enteredPin) {
        return PIN_NUMBER == enteredPin;
    }

    public int getBankBalance() {
        return userBankAccount.getBalance();
    }

    public void deductBankBalance(int amount) {
        bankBalance = bankBalance - amount;
    }

    public void setUserBankAccount(UserBankAccount userBankAccount) {
        this.userBankAccount = userBankAccount;
    }
}
