package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of childSubject
 */ 
public class ChildSubjectDataTable extends SchemaDataTable {

	protected ChildSubjectDataTable(final ChildSubjectSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public ChildSubjectData getSchemaData(final int idx) {
		return(ChildSubjectData) super.getSchemaData(idx);
	}
}
