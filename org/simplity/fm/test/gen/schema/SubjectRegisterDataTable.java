package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of subjectRegister
 */ 
public class SubjectRegisterDataTable extends SchemaDataTable {

	protected SubjectRegisterDataTable(final SubjectRegisterSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public SubjectRegisterData getSchemaData(final int idx) {
		return(SubjectRegisterData) super.getSchemaData(idx);
	}
}
