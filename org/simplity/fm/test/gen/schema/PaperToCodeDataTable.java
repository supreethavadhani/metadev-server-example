package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of paperToCode
 */ 
public class PaperToCodeDataTable extends SchemaDataTable {

	protected PaperToCodeDataTable(final PaperToCodeSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public PaperToCodeData getSchemaData(final int idx) {
		return(PaperToCodeData) super.getSchemaData(idx);
	}
}
