package CaseStudies.PaymentGateway.instrument;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InstrumentService {
    static Map<Integer, List<Instrument>> userVsInstruments = new HashMap<>();

    abstract void addInstrument(InstrumentDo instrumentDo);

    abstract InstrumentDo getInstrument(int userId, int instrumentId);
}
