package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of marksUpdate
 */ 
public class MarksUpdateDataTable extends SchemaDataTable {

	protected MarksUpdateDataTable(final MarksUpdateSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public MarksUpdateData getSchemaData(final int idx) {
		return(MarksUpdateData) super.getSchemaData(idx);
	}
}
