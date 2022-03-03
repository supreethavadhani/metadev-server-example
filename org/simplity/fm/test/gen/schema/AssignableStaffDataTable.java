package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of assignableStaff
 */ 
public class AssignableStaffDataTable extends SchemaDataTable {

	protected AssignableStaffDataTable(final AssignableStaffSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AssignableStaffData getSchemaData(final int idx) {
		return(AssignableStaffData) super.getSchemaData(idx);
	}
}
