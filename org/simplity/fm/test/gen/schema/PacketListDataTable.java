package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of packetList
 */ 
public class PacketListDataTable extends SchemaDataTable {

	protected PacketListDataTable(final PacketListSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public PacketListData getSchemaData(final int idx) {
		return(PacketListData) super.getSchemaData(idx);
	}
}
