package CaseStudies.ATM.ATMStates;

import CaseStudies.ATM.ATM;
import CaseStudies.ATM.Card;
import CaseStudies.ATM.TransactionType;

public abstract class ATMState {
    public void insertCard(ATM atm, Card card) {}

    public void authenticatePin(ATM atm, Card card, int pin) {}

    public void selectOperation(ATM atm, Card card, TransactionType txnType) {}

    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmountRequest) {}

    public void displayBalance() {}

    public void returnCard() {}

    public void exit(ATM atm) {}
}
