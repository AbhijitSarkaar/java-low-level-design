package CaseStudies.ATM.ATMStates;

import CaseStudies.ATM.ATM;
import CaseStudies.ATM.Card;
import CaseStudies.ATM.TransactionType;

public class SelectOperationState extends ATMState {

    public SelectOperationState() {
        showOperations();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType txnType) {
        System.out.println("select operation");
        switch (txnType) {
            case CASH_WITHDRAWAL:
                atm.setState(new CashWithdrawalState());
                break;
            case BALANCE_CHECK:
                atm.setState(new CheckBalanceState());
                break;
            default:
                exit(atm);
        }
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

    void showOperations() {
    }
}
