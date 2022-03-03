package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of staff
 */ 
public class StaffDataTable extends SchemaDataTable {

	protected StaffDataTable(final StaffSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public StaffData getSchemaData(final int idx) {
		return(StaffData) super.getSchemaData(idx);
	}
}
