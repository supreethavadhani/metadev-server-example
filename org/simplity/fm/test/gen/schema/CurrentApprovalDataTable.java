package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of currentApproval
 */ 
public class CurrentApprovalDataTable extends SchemaDataTable {

	protected CurrentApprovalDataTable(final CurrentApprovalSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public CurrentApprovalData getSchemaData(final int idx) {
		return(CurrentApprovalData) super.getSchemaData(idx);
	}
}
