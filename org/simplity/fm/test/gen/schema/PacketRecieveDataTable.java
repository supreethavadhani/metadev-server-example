package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of packetRecieve
 */ 
public class PacketRecieveDataTable extends SchemaDataTable {

	protected PacketRecieveDataTable(final PacketRecieveSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public PacketRecieveData getSchemaData(final int idx) {
		return(PacketRecieveData) super.getSchemaData(idx);
	}
}
