package CaseStudies.PaymentGateway.instrument;

import java.util.ArrayList;
import java.util.List;

public class BankService extends InstrumentService {
    @Override
    void addInstrument(InstrumentDo instrumentDo) {
        BankInstrument bankInstrument = new BankInstrument(
                instrumentDo.getInstrumentId(),
                instrumentDo.getUserId(),
                instrumentDo.getInstrumentType()
                );

        bankInstrument.setBankAccountNumber(instrumentDo.getBankAccountNumber());
        bankInstrument.setIfscCode(instrumentDo.getIfscCode());
        bankInstrument.instrumentId = instrumentDo.getInstrumentId();
        bankInstrument.instrumentType = instrumentDo.getInstrumentType();
        bankInstrument.userId = instrumentDo.getUserId();

        List<Instrument> instruments = userVsInstruments.get(bankInstrument.userId);
        if(instruments == null) {
            instruments = new ArrayList<>();
        }
        instruments.add(bankInstrument);
        userVsInstruments.put(instrumentDo.userId, instruments);
    }

    @Override
    InstrumentDo getInstrument(int userId, int instrumentId) {
        List<Instrument> instruments = userVsInstruments.get(userId);
        for(Instrument instrument: instruments) {
            BankInstrument bankInstrument = (BankInstrument) instrument;
            if(bankInstrument.instrumentId == instrumentId && bankInstrument.instrumentType.equals(InstrumentType.BANK)) {
                InstrumentDo instrumentDo = new InstrumentDo();
                instrumentDo.setInstrumentId(bankInstrument.instrumentId);
                instrumentDo.setBankAccountNumber(bankInstrument.getBankAccountNumber());
                instrumentDo.setIfscCode(bankInstrument.getIfscCode());
                instrumentDo.setInstrumentType(InstrumentType.BANK);
                instrumentDo.setUserId(bankInstrument.userId);
                return instrumentDo;
            }
        }
        return null;
    }
}
