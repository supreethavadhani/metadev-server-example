package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of packetAssignment
 */ 
public class PacketAssignmentDataTable extends SchemaDataTable {

	protected PacketAssignmentDataTable(final PacketAssignmentSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public PacketAssignmentData getSchemaData(final int idx) {
		return(PacketAssignmentData) super.getSchemaData(idx);
	}
}
