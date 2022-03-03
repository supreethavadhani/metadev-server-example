package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of programLevelList
 */ 
public class ProgramLevelListDataTable extends SchemaDataTable {

	protected ProgramLevelListDataTable(final ProgramLevelListSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ProgramLevelListData getSchemaData(final int idx) {
		return(ProgramLevelListData) super.getSchemaData(idx);
	}
}
