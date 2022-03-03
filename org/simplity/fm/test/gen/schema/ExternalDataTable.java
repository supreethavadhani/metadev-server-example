package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of external
 */ 
public class ExternalDataTable extends SchemaDataTable {

	protected ExternalDataTable(final ExternalSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ExternalData getSchemaData(final int idx) {
		return(ExternalData) super.getSchemaData(idx);
	}
}
