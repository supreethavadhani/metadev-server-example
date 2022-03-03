package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of subjectType
 */ 
public class SubjectTypeDataTable extends SchemaDataTable {

	protected SubjectTypeDataTable(final SubjectTypeSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public SubjectTypeData getSchemaData(final int idx) {
		return(SubjectTypeData) super.getSchemaData(idx);
	}
}
