package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.OfferableSubjectDataTable;
/** class for form data table offerableSubject  */
public class OfferableSubjectFdt extends FormDataTable {
	public OfferableSubjectFdt(final OfferableSubjectForm form, final OfferableSubjectDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public OfferableSubjectDataTable getDataTable() {
		 return (OfferableSubjectDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(OfferableSubjectDataTable table) {
		this.dataTable = table;
	}
}
