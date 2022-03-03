package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of forgotPassword
 */ 
public class ForgotPasswordDataTable extends SchemaDataTable {

	protected ForgotPasswordDataTable(final ForgotPasswordSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ForgotPasswordData getSchemaData(final int idx) {
		return(ForgotPasswordData) super.getSchemaData(idx);
	}
}
