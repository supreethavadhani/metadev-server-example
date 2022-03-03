package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of assignedStaffSubject
 */ 
public class AssignedStaffSubjectDataTable extends SchemaDataTable {

	protected AssignedStaffSubjectDataTable(final AssignedStaffSubjectSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public AssignedStaffSubjectData getSchemaData(final int idx) {
		return(AssignedStaffSubjectData) super.getSchemaData(idx);
	}
}
