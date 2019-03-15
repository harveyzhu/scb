package com.scb.instrument.bean;

import com.scb.instrument.util.InstrumentTypeEnum;

public class BaseInstrument implements IInstrument{

	protected String code;
	protected String lastTradingDate;
	protected String deliveryDate;
	protected String market;
	protected String label;
	protected boolean tradable;
	protected InstrumentTypeEnum instrumentType;

	public BaseInstrument() {
		super();
	}

	public String getLastTradingDate() {
		return lastTradingDate;
	}

	public void setLastTradingDate(String lastTradingDate) {
		this.lastTradingDate = lastTradingDate;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isTradable() {
		return tradable;
	}

	public void setTradable(boolean tradable) {
		this.tradable = tradable;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public InstrumentTypeEnum getInstrumentType() {
		return instrumentType;
	}

	public void setInstrumentType(InstrumentTypeEnum instrumentType) {
		this.instrumentType = instrumentType;
	}

}