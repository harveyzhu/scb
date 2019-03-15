package com.scb.instrument.util;

import com.scb.instrument.bean.IInstrument;

public class InstrumentFactory {

	public static IInstrument getInstrumentByType(String type) {
		InstrumentTypeEnum typeE = InstrumentTypeEnum.getInstrumentTypeByName(type);
		if(typeE != null) {
			return getInstrument(typeE);
		}else {
			return null;
		}
	}
	public static IInstrument getInstrument(InstrumentTypeEnum userType) {
		IInstrument instrument = null;
		
		try {
				instrument = (IInstrument)Class.forName(userType.getClazzName()).newInstance(); 
		}catch(Exception e) {
			
		}
		
		return instrument;
	}
}
