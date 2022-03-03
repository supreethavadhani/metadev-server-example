package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of registerableStudent
 */ 
public class RegisterableStudentDataTable extends SchemaDataTable {

	protected RegisterableStudentDataTable(final RegisterableStudentSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public RegisterableStudentData getSchemaData(final int idx) {
		return(RegisterableStudentData) super.getSchemaData(idx);
	}
}
