package com.scb.instrument;

import com.scb.instrument.bean.LmeInstrument;
import com.scb.instrument.bean.PrimeInstrument;
import com.scb.instrument.bean.PublishInstrument;
import com.scb.instrument.rules.IInstrumentMergeRule;
import com.scb.instrument.util.InstrumentMergeRuleFactory;

public class InstrumentHandler {
	private LmeInstrument instrument;  //base instrument
	private PrimeInstrument primeInstrument;
	private PublishInstrument publishInstrument; //final internal instrument will be published
	private String publisher;
	
	public InstrumentHandler() {
	}
	public void process() {
		validateInput();
		
		//get merger rule based on input
		IInstrumentMergeRule mergeRule = InstrumentMergeRuleFactory.getRule(this);
		
		//get final internal instrument
		publishInstrument = mergeRule.execute(this);
	}
	
	/**
	 * Do some basic validation here, like publisher should not null or other values
	 */
	private void validateInput() {
		
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setInstrument(LmeInstrument instrument) {
		this.instrument = instrument;
	}

	public LmeInstrument getInstrument() {
		return instrument;
	}

	public PrimeInstrument getPrimeInstrument() {
		return primeInstrument;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPrimeInstrument(PrimeInstrument primeInstrument) {
		this.primeInstrument = primeInstrument;
	}

	public PublishInstrument getPublishInstrument() {
		return publishInstrument;
	}
	

	
}
