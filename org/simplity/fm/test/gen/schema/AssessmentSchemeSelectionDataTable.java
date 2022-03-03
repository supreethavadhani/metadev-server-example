package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of assessmentSchemeSelection
 */ 
public class AssessmentSchemeSelectionDataTable extends SchemaDataTable {

	protected AssessmentSchemeSelectionDataTable(final AssessmentSchemeSelectionSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AssessmentSchemeSelectionData getSchemaData(final int idx) {
		return(AssessmentSchemeSelectionData) super.getSchemaData(idx);
	}
}
