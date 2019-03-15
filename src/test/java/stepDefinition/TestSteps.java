package stepDefinition;

import java.util.List;

import org.junit.Assert;

import com.scb.instrument.InstrumentHandler;
import com.scb.instrument.bean.BaseInstrument;
import com.scb.instrument.bean.IInstrument;
import com.scb.instrument.bean.LmeInstrument;
import com.scb.instrument.bean.PrimeInstrument;
import com.scb.instrument.util.InstrumentFactory;
import com.scb.instrument.util.InstrumentTypeEnum;
import com.scb.instrument.util.InstrumentUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	InstrumentHandler handler;	

	@Given("^The \"([^\"]*)\" Instrument \"([^\"]*)\" with these details$")
	public void the_Instrument_with_these_details(String type, String code, List<BaseInstrument> dataList) throws Throwable {
		handler = new InstrumentHandler();
		IInstrument instrument = InstrumentFactory.getInstrumentByType(type);
		
		IInstrument instrumentSource = dataList.get(0);
		InstrumentUtils.convertInstrument(instrumentSource, instrument);
		instrument.setCode(code);
		
		if(instrument.getInstrumentType() == InstrumentTypeEnum.LME) {
			handler.setInstrument((LmeInstrument)instrument);
		}else if(instrument.getInstrumentType() == InstrumentTypeEnum.PRIME){
			handler.setPrimeInstrument((PrimeInstrument)instrument);
		}
	}

	@When("^\"([^\"]*)\" publishes instrument \"([^\"]*)\"$")
	public void publishes_instrument(String publisher, String code) throws Throwable {
		handler.setPublisher(publisher);
	}

	@Then("^The application publishes the following instrument internally$")
	public void the_application_publishes_the_following_instrument_internally(List<BaseInstrument> data) throws Throwable {
		handler.process();
		IInstrument instrument = handler.getPublishInstrument();
		IInstrument expectedInstrument = data.get(0);
		
		Assert.assertEquals(expectedInstrument.isTradable(), instrument.isTradable());
		Assert.assertEquals(expectedInstrument.getMarket(), "PB");

	}
}