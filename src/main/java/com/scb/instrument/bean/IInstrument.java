package com.scb.instrument.bean;

import com.scb.instrument.util.InstrumentTypeEnum;

public interface IInstrument {

	String getLastTradingDate();

	void setLastTradingDate(String lastTradingDate);

	String getDeliveryDate();

	void setDeliveryDate(String deliveryDate);

	String getMarket();

	void setMarket(String market);

	String getLabel();

	void setLabel(String label);

	boolean isTradable();

	void setTradable(boolean tradable);

	String getCode();

	void setCode(String code);
	
	InstrumentTypeEnum getInstrumentType();
	
	void setInstrumentType(InstrumentTypeEnum userType);

}