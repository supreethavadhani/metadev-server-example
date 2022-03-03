package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of answerPacket
 */ 
public class AnswerPacketDataTable extends SchemaDataTable {

	protected AnswerPacketDataTable(final AnswerPacketSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AnswerPacketData getSchemaData(final int idx) {
		return(AnswerPacketData) super.getSchemaData(idx);
	}
}
