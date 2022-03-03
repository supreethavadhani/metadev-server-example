package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of integratedCie
 */ 
public class IntegratedCieDataTable extends SchemaDataTable {

	protected IntegratedCieDataTable(final IntegratedCieSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public IntegratedCieData getSchemaData(final int idx) {
		return(IntegratedCieData) super.getSchemaData(idx);
	}
}
