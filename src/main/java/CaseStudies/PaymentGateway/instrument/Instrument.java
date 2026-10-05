package CaseStudies.PaymentGateway.instrument;

public abstract class Instrument {
    int instrumentId;
    int userId;
    InstrumentType instrumentType;

    public Instrument(int instrumentId, int userId, InstrumentType instrumentType) {
        this.instrumentId = instrumentId;
        this.userId = userId;
        this.instrumentType = instrumentType;
    }
}
