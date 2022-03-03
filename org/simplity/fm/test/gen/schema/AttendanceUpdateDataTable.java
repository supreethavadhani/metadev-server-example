package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of attendanceUpdate
 */ 
public class AttendanceUpdateDataTable extends SchemaDataTable {

	protected AttendanceUpdateDataTable(final AttendanceUpdateSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AttendanceUpdateData getSchemaData(final int idx) {
		return(AttendanceUpdateData) super.getSchemaData(idx);
	}
}
