package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of code
 */ 
public class CodeDataTable extends SchemaDataTable {

	protected CodeDataTable(final CodeSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public CodeData getSchemaData(final int idx) {
		return(CodeData) super.getSchemaData(idx);
	}
}
