package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of studentEnrollment
 */ 
public class StudentEnrollmentDataTable extends SchemaDataTable {

	protected StudentEnrollmentDataTable(final StudentEnrollmentSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public StudentEnrollmentData getSchemaData(final int idx) {
		return(StudentEnrollmentData) super.getSchemaData(idx);
	}
}
