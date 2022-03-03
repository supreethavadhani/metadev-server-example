package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of packetAssignmentDetail
 */ 
public class PacketAssignmentDetailDataTable extends SchemaDataTable {

	protected PacketAssignmentDetailDataTable(final PacketAssignmentDetailSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public PacketAssignmentDetailData getSchemaData(final int idx) {
		return(PacketAssignmentDetailData) super.getSchemaData(idx);
	}
}
