package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of offeredSubject
 */ 
public class OfferedSubjectDataTable extends SchemaDataTable {

	protected OfferedSubjectDataTable(final OfferedSubjectSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public OfferedSubjectData getSchemaData(final int idx) {
		return(OfferedSubjectData) super.getSchemaData(idx);
	}
}
