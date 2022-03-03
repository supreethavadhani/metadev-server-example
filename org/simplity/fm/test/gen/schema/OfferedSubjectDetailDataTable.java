package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of offeredSubjectDetail
 */ 
public class OfferedSubjectDetailDataTable extends SchemaDataTable {

	protected OfferedSubjectDetailDataTable(final OfferedSubjectDetailSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public OfferedSubjectDetailData getSchemaData(final int idx) {
		return(OfferedSubjectDetailData) super.getSchemaData(idx);
	}
}
