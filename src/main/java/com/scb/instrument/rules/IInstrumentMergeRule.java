package com.scb.instrument.rules;

import com.scb.instrument.InstrumentHandler;
import com.scb.instrument.bean.PublishInstrument;

public interface IInstrumentMergeRule {

	PublishInstrument execute(InstrumentHandler handler);

}