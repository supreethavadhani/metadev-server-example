package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of examAttendeeName
 */ 
public class ExamAttendeeNameDataTable extends SchemaDataTable {

	protected ExamAttendeeNameDataTable(final ExamAttendeeNameSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ExamAttendeeNameData getSchemaData(final int idx) {
		return(ExamAttendeeNameData) super.getSchemaData(idx);
	}
}
