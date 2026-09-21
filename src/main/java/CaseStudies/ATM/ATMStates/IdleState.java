package CaseStudies.ATM.ATMStates;

import CaseStudies.ATM.ATM;
import CaseStudies.ATM.Card;

public class IdleState extends ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("card is inserted");
        atm.setState(new HasCardState());
    }
}
