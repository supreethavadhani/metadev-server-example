package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of staffDetail
 */ 
public class StaffDetailDataTable extends SchemaDataTable {

	protected StaffDetailDataTable(final StaffDetailSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public StaffDetailData getSchemaData(final int idx) {
		return(StaffDetailData) super.getSchemaData(idx);
	}
}
