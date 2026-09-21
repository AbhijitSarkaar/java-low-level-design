package CaseStudies.ATM.ATMStates;

import CaseStudies.ATM.ATM;
import CaseStudies.ATM.AmountWithdrawal.CashWithdrawProcessor;
import CaseStudies.ATM.AmountWithdrawal.FiveHundredCashWithdrawProcessor;
import CaseStudies.ATM.AmountWithdrawal.OneHundredCashWithdrawProcessor;
import CaseStudies.ATM.AmountWithdrawal.TwoThousandCashWithdrawProcessor;
import CaseStudies.ATM.Card;

public class CashWithdrawalState extends ATMState {

    public CashWithdrawalState() {
        System.out.println("please enter the withdrawal amount");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmountRequest) {
        System.out.println("cash withdrawal");
        if(atm.getAtmBalance() < withdrawalAmountRequest) {
            System.out.println("insufficient funds");
            exit(atm);
        } else if(card.getBankBalance() < withdrawalAmountRequest) {
            System.out.println("insufficient card balance");
            exit(atm);
        } else {
            card.deductBankBalance(withdrawalAmountRequest);
            atm.deductATMBalance(withdrawalAmountRequest);

            CashWithdrawProcessor cashWithdrawProcessor = new TwoThousandCashWithdrawProcessor(new FiveHundredCashWithdrawProcessor(new OneHundredCashWithdrawProcessor(null)));
            cashWithdrawProcessor.withDraw(atm, withdrawalAmountRequest);
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

}
