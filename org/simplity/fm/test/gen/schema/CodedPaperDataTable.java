package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of codedPaper
 */ 
public class CodedPaperDataTable extends SchemaDataTable {

	protected CodedPaperDataTable(final CodedPaperSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public CodedPaperData getSchemaData(final int idx) {
		return(CodedPaperData) super.getSchemaData(idx);
	}
}
