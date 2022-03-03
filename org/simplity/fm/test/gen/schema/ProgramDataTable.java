package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of program
 */ 
public class ProgramDataTable extends SchemaDataTable {

	protected ProgramDataTable(final ProgramSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ProgramData getSchemaData(final int idx) {
		return(ProgramData) super.getSchemaData(idx);
	}
}
