package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of resultType
 */ 
public class ResultTypeDataTable extends SchemaDataTable {

	protected ResultTypeDataTable(final ResultTypeSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ResultTypeData getSchemaData(final int idx) {
		return(ResultTypeData) super.getSchemaData(idx);
	}
}
