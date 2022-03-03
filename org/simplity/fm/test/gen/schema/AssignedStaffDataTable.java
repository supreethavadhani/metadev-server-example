package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of assignedStaff
 */ 
public class AssignedStaffDataTable extends SchemaDataTable {

	protected AssignedStaffDataTable(final AssignedStaffSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AssignedStaffData getSchemaData(final int idx) {
		return(AssignedStaffData) super.getSchemaData(idx);
	}
}
