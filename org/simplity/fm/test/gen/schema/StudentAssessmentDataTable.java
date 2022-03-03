package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of studentAssessment
 */ 
public class StudentAssessmentDataTable extends SchemaDataTable {

	protected StudentAssessmentDataTable(final StudentAssessmentSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public StudentAssessmentData getSchemaData(final int idx) {
		return(StudentAssessmentData) super.getSchemaData(idx);
	}
}
