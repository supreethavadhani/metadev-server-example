package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of registeredStudentList
 */ 
public class RegisteredStudentListDataTable extends SchemaDataTable {

	protected RegisteredStudentListDataTable(final RegisteredStudentListSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public RegisteredStudentListData getSchemaData(final int idx) {
		return(RegisteredStudentListData) super.getSchemaData(idx);
	}
}
