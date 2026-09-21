package CaseStudies.ATM;

public class ATMRoom {
    ATM atm;
    User user;

    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();

        atmRoom.atm.printCurrentAtmState();
        atmRoom.atm.getState().insertCard(atmRoom.atm, atmRoom.user.getCard());
        atmRoom.atm.getState().authenticatePin(atmRoom.atm, atmRoom.user.card, 112211);
        atmRoom.atm.getState().selectOperation(atmRoom.atm, atmRoom.user.card, TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getState().cashWithdrawal(atmRoom.atm, atmRoom.user.card, 2700);
        atmRoom.atm.printCurrentAtmState();
    }

    private void initialize() {
        atm = ATM.getAtmObject();
        atm.setAtmBalance(3500, 1, 2, 5);

        this.user = createUser();
    }

    private User createUser() {
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard() {
        Card card = new Card();
        card.setUserBankAccount(createBankAccount());
        return card;
    }

    private UserBankAccount createBankAccount() {
        UserBankAccount userBankAccount = new UserBankAccount();
        userBankAccount.setBalance(3000);
        return userBankAccount;
    }
}
