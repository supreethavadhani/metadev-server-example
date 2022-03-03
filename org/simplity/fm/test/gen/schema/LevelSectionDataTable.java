package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of levelSection
 */ 
public class LevelSectionDataTable extends SchemaDataTable {

	protected LevelSectionDataTable(final LevelSectionSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public LevelSectionData getSchemaData(final int idx) {
		return(LevelSectionData) super.getSchemaData(idx);
	}
}
