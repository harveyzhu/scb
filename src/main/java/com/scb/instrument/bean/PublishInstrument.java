package com.scb.instrument.bean;


public class PublishInstrument extends  BaseInstrument {
	
	public PublishInstrument(IInstrument instrument) {
		//We trust/use the last trading date and delivery date from the LME exchange over that of PRIME
		this.lastTradingDate = instrument.getLastTradingDate();
		this.deliveryDate = instrument.getDeliveryDate();
		
		this.label = instrument.getLabel();
		this.code = instrument.getCode();
	}

	@Override
	public String toString() {
		//#LAST_TRADING_DATE| DELIVERY_DATE|  MARKET | LABEL | EXCHANGE_CODE | TRADABLE
		StringBuilder sb = new StringBuilder();
		sb.append("Last Trading Date: " + this.getLastTradingDate()).append("\n")
		  .append("Delivery Date:" + this.getDeliveryDate()).append("\n")
		  .append("Market: " + this.getMarket()).append("\n")
		  .append("Label: " + this.getLabel()).append("\n")
		  .append("Tradable: " + this.isTradable());
		
		return sb.toString();
	}
	
}
