package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of hallTicketSubject
 */ 
public class HallTicketSubjectDataTable extends SchemaDataTable {

	protected HallTicketSubjectDataTable(final HallTicketSubjectSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public HallTicketSubjectData getSchemaData(final int idx) {
		return(HallTicketSubjectData) super.getSchemaData(idx);
	}
}
