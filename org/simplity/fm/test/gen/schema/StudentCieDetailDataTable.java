package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of studentCieDetail
 */ 
public class StudentCieDetailDataTable extends SchemaDataTable {

	protected StudentCieDetailDataTable(final StudentCieDetailSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public StudentCieDetailData getSchemaData(final int idx) {
		return(StudentCieDetailData) super.getSchemaData(idx);
	}
}
