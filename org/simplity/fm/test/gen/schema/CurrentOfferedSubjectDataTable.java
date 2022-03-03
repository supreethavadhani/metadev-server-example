package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of currentOfferedSubject
 */ 
public class CurrentOfferedSubjectDataTable extends SchemaDataTable {

	protected CurrentOfferedSubjectDataTable(final CurrentOfferedSubjectSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public CurrentOfferedSubjectData getSchemaData(final int idx) {
		return(CurrentOfferedSubjectData) super.getSchemaData(idx);
	}
}
