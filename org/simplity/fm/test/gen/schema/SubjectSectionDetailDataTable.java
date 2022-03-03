package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of subjectSectionDetail
 */ 
public class SubjectSectionDetailDataTable extends SchemaDataTable {

	protected SubjectSectionDetailDataTable(final SubjectSectionDetailSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public SubjectSectionDetailData getSchemaData(final int idx) {
		return(SubjectSectionDetailData) super.getSchemaData(idx);
	}
}
