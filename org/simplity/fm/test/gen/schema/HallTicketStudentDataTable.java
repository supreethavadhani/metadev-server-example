package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of hallTicketStudent
 */ 
public class HallTicketStudentDataTable extends SchemaDataTable {

	protected HallTicketStudentDataTable(final HallTicketStudentSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public HallTicketStudentData getSchemaData(final int idx) {
		return(HallTicketStudentData) super.getSchemaData(idx);
	}
}
