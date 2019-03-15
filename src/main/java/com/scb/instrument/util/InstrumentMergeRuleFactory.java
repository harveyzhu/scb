package com.scb.instrument.util;

import com.scb.instrument.InstrumentHandler;
import com.scb.instrument.rules.IInstrumentMergeRule;
import com.scb.instrument.rules.LmePrimeRule;
import com.scb.instrument.rules.LmeRule;

public class InstrumentMergeRuleFactory {

	public static IInstrumentMergeRule getRule(InstrumentHandler handler) {
		IInstrumentMergeRule rule =  null;
		
		//enhance later for more complex logic
		if(handler.getPrimeInstrument() == null) {
			rule = new LmeRule();
		}else {
			rule = new LmePrimeRule();
		}
		
		return rule;
	}
}
