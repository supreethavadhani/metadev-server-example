package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of offeredSubjectList
 */ 
public class OfferedSubjectListDataTable extends SchemaDataTable {

	protected OfferedSubjectListDataTable(final OfferedSubjectListSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public OfferedSubjectListData getSchemaData(final int idx) {
		return(OfferedSubjectListData) super.getSchemaData(idx);
	}
}
