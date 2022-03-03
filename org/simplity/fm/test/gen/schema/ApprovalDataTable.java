package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of approval
 */ 
public class ApprovalDataTable extends SchemaDataTable {

	protected ApprovalDataTable(final ApprovalSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ApprovalData getSchemaData(final int idx) {
		return(ApprovalData) super.getSchemaData(idx);
	}
}
