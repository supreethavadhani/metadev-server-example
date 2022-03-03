package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.OfferableSectionDataTable;
/** class for form data table offerableSection  */
public class OfferableSectionFdt extends FormDataTable {
	public OfferableSectionFdt(final OfferableSectionForm form, final OfferableSectionDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public OfferableSectionDataTable getDataTable() {
		 return (OfferableSectionDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(OfferableSectionDataTable table) {
		this.dataTable = table;
	}
}
