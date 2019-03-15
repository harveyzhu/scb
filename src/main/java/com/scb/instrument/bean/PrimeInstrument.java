package com.scb.instrument.bean;

import com.scb.instrument.util.InstrumentTypeEnum;

public class PrimeInstrument extends BaseInstrument {

	private String exchangeCode;
	
	public String getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public PrimeInstrument() {
	  instrumentType = InstrumentTypeEnum.PRIME;
	}

}
