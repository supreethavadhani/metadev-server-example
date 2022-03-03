package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of condoneAttendance
 */ 
public class CondoneAttendanceDataTable extends SchemaDataTable {

	protected CondoneAttendanceDataTable(final CondoneAttendanceSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public CondoneAttendanceData getSchemaData(final int idx) {
		return(CondoneAttendanceData) super.getSchemaData(idx);
	}
}
