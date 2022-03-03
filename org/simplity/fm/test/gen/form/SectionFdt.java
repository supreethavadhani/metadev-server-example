package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SectionDataTable;
/** class for form data table section  */
public class SectionFdt extends FormDataTable {
	public SectionFdt(final SectionForm form, final SectionDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public SectionDataTable getDataTable() {
		 return (SectionDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(SectionDataTable table) {
		this.dataTable = table;
	}
}
