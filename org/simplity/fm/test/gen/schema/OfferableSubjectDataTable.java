package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of offerableSubject
 */ 
public class OfferableSubjectDataTable extends SchemaDataTable {

	protected OfferableSubjectDataTable(final OfferableSubjectSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public OfferableSubjectData getSchemaData(final int idx) {
		return(OfferableSubjectData) super.getSchemaData(idx);
	}
}
