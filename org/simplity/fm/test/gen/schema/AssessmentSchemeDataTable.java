package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of assessmentScheme
 */ 
public class AssessmentSchemeDataTable extends SchemaDataTable {

	protected AssessmentSchemeDataTable(final AssessmentSchemeSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AssessmentSchemeData getSchemaData(final int idx) {
		return(AssessmentSchemeData) super.getSchemaData(idx);
	}
}
