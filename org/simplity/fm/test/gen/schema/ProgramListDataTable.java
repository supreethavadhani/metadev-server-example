package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of programList
 */ 
public class ProgramListDataTable extends SchemaDataTable {

	protected ProgramListDataTable(final ProgramListSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ProgramListData getSchemaData(final int idx) {
		return(ProgramListData) super.getSchemaData(idx);
	}
}
