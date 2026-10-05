package CaseStudies.PaymentGateway.instrument;

public class CardInstrument extends Instrument {
    int cardNumber;
    int cvvNumber;

    public CardInstrument(int instrumentId, int userId, InstrumentType instrumentType) {
        super(instrumentId, userId, instrumentType);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvvNumber() {
        return cvvNumber;
    }

    public void setCvvNumber(int cvvNumber) {
        this.cvvNumber = cvvNumber;
    }
}
