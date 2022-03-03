package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of pendingApproval
 */ 
public class PendingApprovalDataTable extends SchemaDataTable {

	protected PendingApprovalDataTable(final PendingApprovalSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public PendingApprovalData getSchemaData(final int idx) {
		return(PendingApprovalData) super.getSchemaData(idx);
	}
}
