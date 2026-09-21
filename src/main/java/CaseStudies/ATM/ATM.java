package CaseStudies.ATM;

import CaseStudies.ATM.ATMStates.ATMState;
import CaseStudies.ATM.ATMStates.IdleState;

public class ATM {

    public static ATM AtmObject = new ATM();

    ATMState state;
    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    private ATM() {}

    public void setState(ATMState state) {
        this.state = state;
    }

    public ATMState getState() {
        return state;
    }

    public static ATM getAtmObject() {
        AtmObject.setState(new IdleState());
        return AtmObject;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void printCurrentAtmState() {
        System.out.println("bank balance " + atmBalance);
        System.out.println("no of two thousand notes " + noOfTwoThousandNotes);
        System.out.println("no of five hundred notes " + noOfFiveHundredNotes);
        System.out.println("no of one hundred notes " + noOfOneHundredNotes);
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void setNoOfTwoThousandNotes(int noOfTwoThousandNotes) {
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
    }

    public void setNoOfFiveHundredNotes(int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
    }

    public void setNoOfOneHundredNotes(int noOfOneHundredNotes) {
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void deductATMBalance(int amount) {
        atmBalance -= amount;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void deductTwoThousandNotes(int noOfNotes) {
        this.noOfTwoThousandNotes = this.noOfTwoThousandNotes - noOfNotes;
    }

    public void deductFiveHundredNotes(int noOfNotes) {
        this.noOfFiveHundredNotes = this.noOfFiveHundredNotes - noOfNotes;
    }

    public void deductOneHundredNotes(int noOfNotes) {
        this.noOfOneHundredNotes = this.noOfOneHundredNotes - noOfNotes;
    }
}
