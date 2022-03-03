package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of subjectResult
 */ 
public class SubjectResultDataTable extends SchemaDataTable {

	protected SubjectResultDataTable(final SubjectResultSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public SubjectResultData getSchemaData(final int idx) {
		return(SubjectResultData) super.getSchemaData(idx);
	}
}
