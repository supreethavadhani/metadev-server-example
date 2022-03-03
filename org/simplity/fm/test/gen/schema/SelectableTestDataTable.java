package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of selectableTest
 */ 
public class SelectableTestDataTable extends SchemaDataTable {

	protected SelectableTestDataTable(final SelectableTestSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public SelectableTestData getSchemaData(final int idx) {
		return(SelectableTestData) super.getSchemaData(idx);
	}
}
