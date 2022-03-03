package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of sectionAttendance
 */ 
public class SectionAttendanceDataTable extends SchemaDataTable {

	protected SectionAttendanceDataTable(final SectionAttendanceSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public SectionAttendanceData getSchemaData(final int idx) {
		return(SectionAttendanceData) super.getSchemaData(idx);
	}
}
