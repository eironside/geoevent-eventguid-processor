package com.esri.geoevent.processor.eventguid;

import java.util.ArrayList;
import java.util.List;

import com.esri.ges.core.property.LabeledValue;
import com.esri.ges.core.property.PropertyDefinition;
import com.esri.ges.core.property.PropertyException;
import com.esri.ges.core.property.PropertyType;
import com.esri.ges.framework.i18n.BundleLogger;
import com.esri.ges.framework.i18n.BundleLoggerFactory;
import com.esri.ges.processor.GeoEventProcessorDefinitionBase;

public class EventGuidProcessorDefinition extends GeoEventProcessorDefinitionBase {

	private static final BundleLogger LOGGER = BundleLoggerFactory.getLogger(EventGuidProcessor.class);

	public static final String PROCESSOR_LAB = "${com.esri.geoevent.processor.eventguid-processor.PROCESSOR_LABEL}";
	public static final String PROCESSOR_DES = "${com.esri.geoevent.processor.eventguid-processor.PROCESSOR_DESC}";
	public static final String GUID_FIELD_LAB = "${com.esri.geoevent.processor.eventguid-processor.GUID_FIELD_NAME_LABEL}";
	public static final String GUID_FIELD_DES = "${com.esri.geoevent.processor.eventguid-processor.GUID_FIELD_NAME_DESC}";

	public static final String GUID_FIELD_NAME = "guidFieldName";

	public EventGuidProcessorDefinition() {
		try {

			List<LabeledValue> allowedFieldTypes = new ArrayList<LabeledValue>();
			allowedFieldTypes.add(new LabeledValue("String", "String:One"));

			PropertyDefinition guidFieldProperty = new PropertyDefinition(GUID_FIELD_NAME,
					PropertyType.GeoEventDefinitionField, null, GUID_FIELD_LAB, GUID_FIELD_DES, true, false,
					allowedFieldTypes);
			propertyDefinitions.put(GUID_FIELD_NAME, guidFieldProperty);
		} catch (PropertyException e) {
			LOGGER.warn("Failed to create property", e);
		}
	}

	@Override
	public String getLabel() {
		return PROCESSOR_LAB;
	}

	@Override
	public String getDomain() {
		return "com.esri.geoevent.processor";
	}

	@Override
	public String getDescription() {
		return PROCESSOR_DES;
	}
}
