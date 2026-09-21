package CaseStudies.ATM.ATMStates;

import CaseStudies.ATM.ATM;
import CaseStudies.ATM.Card;

public class HasCardState extends ATMState {
    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("authenticating pin");

        boolean isCorrectPinEntered = card.isCorrectPinEntered(pin);
        if(isCorrectPinEntered) {
            System.out.println("correct pin");
            atm.setState(new SelectOperationState());
        } else {
            System.out.println("invalid pin number");
            exit(atm);
        }
    }

    @Override
    public void returnCard() {
        System.out.println("card is returned");
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setState(new IdleState());
        System.out.println("exit");
    }
}
