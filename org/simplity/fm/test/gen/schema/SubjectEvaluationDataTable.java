package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of subjectEvaluation
 */ 
public class SubjectEvaluationDataTable extends SchemaDataTable {

	protected SubjectEvaluationDataTable(final SubjectEvaluationSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public SubjectEvaluationData getSchemaData(final int idx) {
		return(SubjectEvaluationData) super.getSchemaData(idx);
	}
}
