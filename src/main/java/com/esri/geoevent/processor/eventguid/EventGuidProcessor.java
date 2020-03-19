package com.esri.geoevent.processor.eventguid;

import com.esri.ges.core.component.ComponentException;
import com.esri.ges.core.geoevent.GeoEvent;
import com.esri.ges.framework.i18n.BundleLogger;
import com.esri.ges.framework.i18n.BundleLoggerFactory;
import com.esri.ges.processor.GeoEventProcessorBase;
import com.esri.ges.processor.GeoEventProcessorDefinition;

/**
 * Adds a Globally Unique Identifier to each event.
 */
public class EventGuidProcessor extends GeoEventProcessorBase {
	private static final BundleLogger LOGGER = BundleLoggerFactory.getLogger(EventGuidProcessor.class);

	private String guidFieldName = null;

	public EventGuidProcessor(GeoEventProcessorDefinition definition) throws ComponentException {
		super(definition);
	}

	@Override
	public GeoEvent process(GeoEvent geoEvent) throws Exception {

		if (geoEvent != null && guidFieldName != null && !guidFieldName.isEmpty()) {
			try {
				geoEvent.setField(guidFieldName, geoEvent.getGuid());
				LOGGER.trace("added guid to field {0}: {1}", guidFieldName, geoEvent);
			} catch (Exception e) {
				LOGGER.warn("Failed to set guid on event: {0}", e, geoEvent);
			}
		}
		return geoEvent;
	}

	@Override
	public void afterPropertiesSet() {
		try {
			this.guidFieldName = this.properties.get(EventGuidProcessorDefinition.GUID_FIELD_NAME).getValueAsString();
			LOGGER.trace("Adding guid to field {0}", guidFieldName);
		} catch (Exception ex) {
			LOGGER.warn("Failed to get properties for processor", ex);
		}
		super.afterPropertiesSet();
	}
}
