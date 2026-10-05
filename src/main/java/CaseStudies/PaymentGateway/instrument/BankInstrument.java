package CaseStudies.PaymentGateway.instrument;

public class BankInstrument extends Instrument {
    String bankAccountNumber;
    String ifscCode;

    public BankInstrument(int instrumentId, int userId, InstrumentType instrumentType) {
        super(instrumentId, userId, instrumentType);
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
}
