package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of season
 */ 
public class SeasonDataTable extends SchemaDataTable {

	protected SeasonDataTable(final SeasonSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public SeasonData getSchemaData(final int idx) {
		return(SeasonData) super.getSchemaData(idx);
	}
}
