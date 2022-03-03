package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of registeredStudentName
 */ 
public class RegisteredStudentNameDataTable extends SchemaDataTable {

	protected RegisteredStudentNameDataTable(final RegisteredStudentNameSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public RegisteredStudentNameData getSchemaData(final int idx) {
		return(RegisteredStudentNameData) super.getSchemaData(idx);
	}
}
