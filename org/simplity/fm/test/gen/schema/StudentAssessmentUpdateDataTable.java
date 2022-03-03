package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of studentAssessmentUpdate
 */ 
public class StudentAssessmentUpdateDataTable extends SchemaDataTable {

	protected StudentAssessmentUpdateDataTable(final StudentAssessmentUpdateSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public StudentAssessmentUpdateData getSchemaData(final int idx) {
		return(StudentAssessmentUpdateData) super.getSchemaData(idx);
	}
}
