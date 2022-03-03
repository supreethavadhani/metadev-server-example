package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of examAttendee
 */ 
public class ExamAttendeeDataTable extends SchemaDataTable {

	protected ExamAttendeeDataTable(final ExamAttendeeSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ExamAttendeeData getSchemaData(final int idx) {
		return(ExamAttendeeData) super.getSchemaData(idx);
	}
}
