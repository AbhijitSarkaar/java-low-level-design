package CaseStudies.ATM.AmountWithdrawal;

import CaseStudies.ATM.ATM;

public class TwoThousandCashWithdrawProcessor extends CashWithdrawProcessor {
    public TwoThousandCashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    public void withDraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/2000;
        int balance = remainingAmount%2000;

        if(required <= atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(required);
        } else if(required > atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
            balance = balance + (required - atm.getNoOfTwoThousandNotes()) * 2000;
        }

        if(balance != 0) {
            super.withDraw(atm, balance);
        }
    }
}
