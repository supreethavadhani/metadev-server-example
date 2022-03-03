package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of eligibilityList
 */ 
public class EligibilityListDataTable extends SchemaDataTable {

	protected EligibilityListDataTable(final EligibilityListSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public EligibilityListData getSchemaData(final int idx) {
		return(EligibilityListData) super.getSchemaData(idx);
	}
}
