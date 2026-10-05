package CaseStudies.PaymentGateway.instrument;

import CaseStudies.ATM.Card;

import java.util.ArrayList;
import java.util.List;

public class CardService extends InstrumentService {
    @Override
    void addInstrument(InstrumentDo instrumentDo) {
        CardInstrument cardInstrument = new CardInstrument(instrumentDo.getInstrumentId(), instrumentDo.getUserId(), instrumentDo.getInstrumentType());
        cardInstrument.setCardNumber(instrumentDo.getCardNumber());
        cardInstrument.setCvvNumber(instrumentDo.getCvvNumber());
        cardInstrument.instrumentId = instrumentDo.getInstrumentId();
        cardInstrument.instrumentType = instrumentDo.getInstrumentType();
        cardInstrument.userId = instrumentDo.getUserId();

        List<Instrument> instruments = userVsInstruments.get(cardInstrument.userId);
        if(instruments == null) {
            instruments = new ArrayList<>();
            userVsInstruments.put(cardInstrument.userId, instruments);
        }
        instruments.add(cardInstrument);
    }

    @Override
    InstrumentDo getInstrument(int userId, int instrumentId) {
        List<Instrument> instruments = userVsInstruments.get(userId);
        for(Instrument instrument: instruments) {
            CardInstrument cardInstrument = (CardInstrument) instrument;
            if(cardInstrument.instrumentId == instrumentId && cardInstrument.instrumentType.equals(InstrumentType.CARD)) {
                InstrumentDo instrumentDo = new InstrumentDo();
                instrumentDo.setInstrumentId(cardInstrument.instrumentId);
                instrumentDo.setInstrumentType(cardInstrument.instrumentType);
                instrumentDo.setUserId(userId);
                instrumentDo.setCardNumber(cardInstrument.getCardNumber());
                instrumentDo.setCvvNumber(cardInstrument.getCvvNumber());
                return instrumentDo;
            }
        }
        return null;
    }
}
