package CaseStudies.ATM.AmountWithdrawal;

import CaseStudies.ATM.ATM;

public class OneHundredCashWithdrawProcessor extends CashWithdrawProcessor {
    public OneHundredCashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    public void withDraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/100;
        int balance = remainingAmount%100;

        if(required <= atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(required);
        } else if(required > atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
            balance = balance + (required - atm.getNoOfTwoThousandNotes()) * 100;
        }

        if(balance != 0) {
            super.withDraw(atm, balance);
        }
    }
}
