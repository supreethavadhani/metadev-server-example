package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of examAttendeeInitial
 */ 
public class ExamAttendeeInitialDataTable extends SchemaDataTable {

	protected ExamAttendeeInitialDataTable(final ExamAttendeeInitialSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ExamAttendeeInitialData getSchemaData(final int idx) {
		return(ExamAttendeeInitialData) super.getSchemaData(idx);
	}
}
