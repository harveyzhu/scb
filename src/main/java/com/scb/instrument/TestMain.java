package com.scb.instrument;

import java.io.FileInputStream;
import java.util.Properties;

import com.scb.instrument.bean.PrimeInstrument;
import com.scb.instrument.bean.PublishInstrument;
import com.scb.instrument.util.InstrumentUtils;

public class TestMain {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.err.println("please specific the input file");
			return;
		}
		String filename = args[0];
		
		Properties p = new Properties();
		try {
		   p.load(new FileInputStream(filename));
		}catch (Exception e) {
			System.err.println("File not exits: " + filename);
		}
		
		String publisher = p.getProperty("publisher");
		String code = p.getProperty("code_lme");
		String exchangeCode = p.getProperty("code_prime");
		String lmeData = p.getProperty("instrument_lme");
		String primeData = p.getProperty("instrument_prime");

		//validate input
		
		InstrumentHandler handler = new InstrumentHandler();
		handler.setPublisher(publisher);
		handler.setInstrument(InstrumentUtils.getInstrument(lmeData));
		handler.getInstrument().setCode(code);
		PrimeInstrument prime = InstrumentUtils.getPrimeInstrument(primeData);
		if(prime != null) {
			prime.setCode(exchangeCode);
			handler.setPrimeInstrument(prime);
		}
		
		handler.process();
		PublishInstrument pi = handler.getPublishInstrument();
		
		System.err.println(pi.toString());
	}

}
