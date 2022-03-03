package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of resultMarks
 */ 
public class ResultMarksDataTable extends SchemaDataTable {

	protected ResultMarksDataTable(final ResultMarksSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ResultMarksData getSchemaData(final int idx) {
		return(ResultMarksData) super.getSchemaData(idx);
	}
}
