package CaseStudies.PaymentGateway.instrument;

public class InstrumentServiceFactory {
    public static InstrumentService getInstrumentService(InstrumentType instrumentType) {
        if(instrumentType == InstrumentType.BANK) {
            return new BankService();
        } else if(instrumentType == InstrumentType.CARD) {
            return new CardService();
        }
        return null;
    }
}
