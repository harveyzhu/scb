package com.scb.instrument.util;

import com.scb.instrument.bean.IInstrument;
import com.scb.instrument.bean.LmeInstrument;
import com.scb.instrument.bean.PrimeInstrument;

public class InstrumentUtils {

	public static String getMarket(String market) {
		return "PB";
	}
	
	public static void convertInstrument(IInstrument source, IInstrument target) {
		target.setLastTradingDate(source.getLastTradingDate());
		target.setDeliveryDate(source.getDeliveryDate());
		target.setLabel(source.getLabel());
		target.setMarket(source.getMarket());
		target.setTradable(source.isTradable());
	}

	public static LmeInstrument getInstrument(String data) {
		if(data == null) {
			return null;
		}
		
		String[] params = data.split("|");
		
		LmeInstrument instrument = new LmeInstrument();
		instrument.setLastTradingDate(params[0]);
		instrument.setDeliveryDate(params[1]);
		instrument.setMarket(params[2]);
		instrument.setLabel(params[3]);
		
		return instrument;
	}

	public static PrimeInstrument getPrimeInstrument(String data) {
		if(data == null || data.trim().length()==0) {
			return null;
		}
		
		String[] params = data.split("|");
		
		PrimeInstrument instrument = new PrimeInstrument();
		instrument.setLastTradingDate(params[0]);
		instrument.setDeliveryDate(params[1]);
		instrument.setMarket(params[2]);
		instrument.setLabel(params[3]);
		instrument.setExchangeCode(params[4]);
		instrument.setTradable(Boolean.valueOf(params[5]));
		
		return instrument;
	}
}
