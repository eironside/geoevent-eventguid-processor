package com.esri.geoevent.processor.eventguid;

import com.esri.ges.core.component.ComponentException;
import com.esri.ges.processor.GeoEventProcessor;
import com.esri.ges.processor.GeoEventProcessorServiceBase;

public class EventGuidProcessorService extends GeoEventProcessorServiceBase {

	public EventGuidProcessorService() {
		this.definition = new EventGuidProcessorDefinition();
	}

	@Override
	public GeoEventProcessor create() throws ComponentException {
		return new EventGuidProcessor(definition);
	}
}