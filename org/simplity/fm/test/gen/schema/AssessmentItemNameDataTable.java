package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of assessmentItemName
 */ 
public class AssessmentItemNameDataTable extends SchemaDataTable {

	protected AssessmentItemNameDataTable(final AssessmentItemNameSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AssessmentItemNameData getSchemaData(final int idx) {
		return(AssessmentItemNameData) super.getSchemaData(idx);
	}
}
