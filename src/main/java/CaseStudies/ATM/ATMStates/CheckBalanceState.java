package CaseStudies.ATM.ATMStates;

import CaseStudies.ATM.ATM;
import CaseStudies.ATM.Card;

public class CheckBalanceState extends ATMState {

    public void displayBalance(ATM atm, Card card) {
        System.out.println("Available balance " + card.getBankBalance());
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setState(new IdleState());
        System.out.println("exit");
    }

    @Override
    public void returnCard() {
        System.out.println("card is returned");
    }
}
