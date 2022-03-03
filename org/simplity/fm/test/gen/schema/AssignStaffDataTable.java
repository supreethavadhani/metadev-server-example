package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of assignStaff
 */ 
public class AssignStaffDataTable extends SchemaDataTable {

	protected AssignStaffDataTable(final AssignStaffSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AssignStaffData getSchemaData(final int idx) {
		return(AssignStaffData) super.getSchemaData(idx);
	}
}
