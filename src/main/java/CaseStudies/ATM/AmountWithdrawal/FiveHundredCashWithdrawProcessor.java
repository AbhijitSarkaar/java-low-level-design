package CaseStudies.ATM.AmountWithdrawal;

import CaseStudies.ATM.ATM;

public class FiveHundredCashWithdrawProcessor extends CashWithdrawProcessor {
    public FiveHundredCashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    @Override
    public void withDraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/500;
        int balance = remainingAmount%500;

        if(required <= atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(required);
        } else if(required > atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNotes());
            balance = balance + (required - atm.getNoOfFiveHundredNotes()) * 500;
        }
        if(balance != 0) {
            super.withDraw(atm, balance);
        }
    }
}
