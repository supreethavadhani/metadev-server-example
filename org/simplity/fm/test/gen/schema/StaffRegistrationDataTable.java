package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of staffRegistration
 */ 
public class StaffRegistrationDataTable extends SchemaDataTable {

	protected StaffRegistrationDataTable(final StaffRegistrationSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public StaffRegistrationData getSchemaData(final int idx) {
		return(StaffRegistrationData) super.getSchemaData(idx);
	}
}
