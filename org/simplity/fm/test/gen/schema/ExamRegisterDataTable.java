package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of examRegister
 */ 
public class ExamRegisterDataTable extends SchemaDataTable {

	protected ExamRegisterDataTable(final ExamRegisterSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ExamRegisterData getSchemaData(final int idx) {
		return(ExamRegisterData) super.getSchemaData(idx);
	}
}
