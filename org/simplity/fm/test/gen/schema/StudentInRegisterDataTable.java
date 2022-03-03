package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of studentInRegister
 */ 
public class StudentInRegisterDataTable extends SchemaDataTable {

	protected StudentInRegisterDataTable(final StudentInRegisterSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public StudentInRegisterData getSchemaData(final int idx) {
		return(StudentInRegisterData) super.getSchemaData(idx);
	}
}
