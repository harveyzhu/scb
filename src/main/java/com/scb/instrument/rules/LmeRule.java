package com.scb.instrument.rules;

import com.scb.instrument.InstrumentHandler;
import com.scb.instrument.bean.PublishInstrument;
import com.scb.instrument.util.InstrumentUtils;

public class LmeRule implements IInstrumentMergeRule {

	public PublishInstrument execute(InstrumentHandler handler) {
		PublishInstrument publishInstrument = new PublishInstrument(handler.getInstrument());
		
		publishInstrument.setTradable(true);
		publishInstrument.setMarket(InstrumentUtils.getMarket(handler.getInstrument().getMarket()));

		return publishInstrument;
	}

}
