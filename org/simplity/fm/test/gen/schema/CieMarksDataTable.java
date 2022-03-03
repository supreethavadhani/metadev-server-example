package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of cieMarks
 */ 
public class CieMarksDataTable extends SchemaDataTable {

	protected CieMarksDataTable(final CieMarksSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public CieMarksData getSchemaData(final int idx) {
		return(CieMarksData) super.getSchemaData(idx);
	}
}
