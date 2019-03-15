package com.scb.instrument.rules;

import com.scb.instrument.InstrumentHandler;
import com.scb.instrument.bean.PublishInstrument;
import com.scb.instrument.util.InstrumentUtils;

public class LmePrimeRule implements IInstrumentMergeRule {

	public PublishInstrument execute(InstrumentHandler handler) {
		PublishInstrument publishInstrument = new PublishInstrument(handler.getInstrument());
		
		if(handler.getPublisher().equals("LME")) {
			publishInstrument.setTradable(true);
		}else {
			publishInstrument.setTradable(handler.getPrimeInstrument().isTradable());
		}
		
		publishInstrument.setMarket(InstrumentUtils.getMarket(handler.getInstrument().getMarket()));

		return  publishInstrument;
	}
}
