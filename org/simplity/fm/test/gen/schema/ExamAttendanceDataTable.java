package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of examAttendance
 */ 
public class ExamAttendanceDataTable extends SchemaDataTable {

	protected ExamAttendanceDataTable(final ExamAttendanceSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ExamAttendanceData getSchemaData(final int idx) {
		return(ExamAttendanceData) super.getSchemaData(idx);
	}
}
