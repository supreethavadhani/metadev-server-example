package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of studentAssessmentDetail
 */ 
public class StudentAssessmentDetailDataTable extends SchemaDataTable {

	protected StudentAssessmentDetailDataTable(final StudentAssessmentDetailSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public StudentAssessmentDetailData getSchemaData(final int idx) {
		return(StudentAssessmentDetailData) super.getSchemaData(idx);
	}
}
