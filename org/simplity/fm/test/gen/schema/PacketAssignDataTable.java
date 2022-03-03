package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of packetAssign
 */ 
public class PacketAssignDataTable extends SchemaDataTable {

	protected PacketAssignDataTable(final PacketAssignSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public PacketAssignData getSchemaData(final int idx) {
		return(PacketAssignData) super.getSchemaData(idx);
	}
}
