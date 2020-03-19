# GeoEvent Event GUID Processor

This custom processor provides the capability to add a globally unique identifier to each event.

This type of processor can be useful when using a field splitter, so  you can relate back to the original event.

## Features
* GeoEvent Event GUID Processor

## Instructions

Building the source code:

1. Make sure Maven and ArcGIS GeoEvent Server SDK are installed on your machine.
2. Run 'mvn install -Dcontact.address=[YourContactEmailAddress]'

Installing the built jar files:

1. Copy the *.jar files under the 'target' sub-folder(s) into the [ArcGIS-GeoEvent-Server-Install-Directory]/deploy folder.

## Issues

Find a bug or want to request a new feature?  Please let us know by submitting an issue.

## Support

This component is not officially supported as an Esri product. The source code is available under the Apache License. 

## Contributing

Esri welcomes contributions from anyone and everyone. Please see our [guidelines for contributing](https://github.com/esri/contributing).

## Usage

* The following parameters are supported:
  * `Guid Field` Specifies a string field that the guid value should be inserted into.
   The guid string field should already exist in the event definition.

## Debugging
The logger for this processor is listed below. Set it to TRACE to follow the processing details.

com.esri.geoevent.processor.eventguid.EventGuidProcessor

