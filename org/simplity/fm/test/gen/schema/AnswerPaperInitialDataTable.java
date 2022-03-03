package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of answerPaperInitial
 */ 
public class AnswerPaperInitialDataTable extends SchemaDataTable {

	protected AnswerPaperInitialDataTable(final AnswerPaperInitialSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AnswerPaperInitialData getSchemaData(final int idx) {
		return(AnswerPaperInitialData) super.getSchemaData(idx);
	}
}
