package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of answerPaper
 */ 
public class AnswerPaperDataTable extends SchemaDataTable {

	protected AnswerPaperDataTable(final AnswerPaperSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AnswerPaperData getSchemaData(final int idx) {
		return(AnswerPaperData) super.getSchemaData(idx);
	}
}
