package CaseStudies.PaymentGateway.instrument;

import java.util.List;

public class InstrumentController {

    public void addInstrument(InstrumentDo instrumentDo) {
        InstrumentService instrumentService = InstrumentServiceFactory.getInstrumentService(instrumentDo.getInstrumentType());
        instrumentService.addInstrument(instrumentDo);
    }

    public InstrumentDo getInstrument(int userId, int instrumentId) {
        List<Instrument> instruments = InstrumentService.userVsInstruments.get(userId);
        for(Instrument instrument: instruments) {
            if(instrument.instrumentId == instrumentId) {
                InstrumentService instrumentService = InstrumentServiceFactory.getInstrumentService(instrument.instrumentType);
                return instrumentService.getInstrument(userId, instrumentId);
            }
        }
        return null;
    }

}
