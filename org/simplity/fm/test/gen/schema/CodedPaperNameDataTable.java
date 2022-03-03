package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of codedPaperName
 */ 
public class CodedPaperNameDataTable extends SchemaDataTable {

	protected CodedPaperNameDataTable(final CodedPaperNameSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public CodedPaperNameData getSchemaData(final int idx) {
		return(CodedPaperNameData) super.getSchemaData(idx);
	}
}
