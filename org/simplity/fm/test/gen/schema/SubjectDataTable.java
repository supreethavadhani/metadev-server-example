package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of subject
 */ 
public class SubjectDataTable extends SchemaDataTable {

	protected SubjectDataTable(final SubjectSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public SubjectData getSchemaData(final int idx) {
		return(SubjectData) super.getSchemaData(idx);
	}
}
