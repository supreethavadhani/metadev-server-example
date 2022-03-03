package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of assignedStaffName
 */ 
public class AssignedStaffNameDataTable extends SchemaDataTable {

	protected AssignedStaffNameDataTable(final AssignedStaffNameSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AssignedStaffNameData getSchemaData(final int idx) {
		return(AssignedStaffNameData) super.getSchemaData(idx);
	}
}
