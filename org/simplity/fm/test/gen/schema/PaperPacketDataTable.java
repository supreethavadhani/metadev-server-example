package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of paperPacket
 */ 
public class PaperPacketDataTable extends SchemaDataTable {

	protected PaperPacketDataTable(final PaperPacketSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public PaperPacketData getSchemaData(final int idx) {
		return(PaperPacketData) super.getSchemaData(idx);
	}
}
