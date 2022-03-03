package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of subjectSection
 */ 
public class SubjectSectionDataTable extends SchemaDataTable {

	protected SubjectSectionDataTable(final SubjectSectionSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public SubjectSectionData getSchemaData(final int idx) {
		return(SubjectSectionData) super.getSchemaData(idx);
	}
}
