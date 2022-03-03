package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of assessmentItem
 */ 
public class AssessmentItemDataTable extends SchemaDataTable {

	protected AssessmentItemDataTable(final AssessmentItemSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AssessmentItemData getSchemaData(final int idx) {
		return(AssessmentItemData) super.getSchemaData(idx);
	}
}
