package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of answerPacketDetail
 */ 
public class AnswerPacketDetailDataTable extends SchemaDataTable {

	protected AnswerPacketDetailDataTable(final AnswerPacketDetailSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AnswerPacketDetailData getSchemaData(final int idx) {
		return(AnswerPacketDetailData) super.getSchemaData(idx);
	}
}
