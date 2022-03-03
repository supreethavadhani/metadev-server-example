package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of studentDetail
 */ 
public class StudentDetailDataTable extends SchemaDataTable {

	protected StudentDetailDataTable(final StudentDetailSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public StudentDetailData getSchemaData(final int idx) {
		return(StudentDetailData) super.getSchemaData(idx);
	}
}
