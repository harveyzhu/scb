package com.scb.instrument.util;

public enum InstrumentTypeEnum {
	LME(1, "LME", "com.scb.instrument.bean.LmeInstrument"),
	PRIME(2, "PRIME", "com.scb.instrument.bean.PrimeInstrument");
	
	private int code;
	private String name;
	private String clazzName;
	
	
	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private InstrumentTypeEnum(int code, String name, String clazzName) {
		this.code = code;
		this.name = name;
		this.clazzName = clazzName;
	}
	
	public static String getInstrumentTypeByCode(int code) {
		for(InstrumentTypeEnum userType: InstrumentTypeEnum.values()) {
			if(userType.getCode() == code) {
				return userType.getName();
			}
		}
		return null;
	}
	
	public static InstrumentTypeEnum getInstrumentTypeByName(String name) {
		for(InstrumentTypeEnum userType: InstrumentTypeEnum.values()) {
			if(name.equals(userType.getName())) {
				return userType;
			}
		}
		return null;
	}
}
