package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaDataTable;

/**
 * class that represents an array of structure of offerableSection
 */ 
public class OfferableSectionDataTable extends SchemaDataTable {

	protected OfferableSectionDataTable(final OfferableSectionSchema schema, final Object[][] data) {
		super(schema, data);
	}

	@Override
	public OfferableSectionData getSchemaData(final int idx) {
		return(OfferableSectionData) super.getSchemaData(idx);
	}
}
