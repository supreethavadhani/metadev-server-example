package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.OfferedSubjectDetailDataTable;
/** class for form data table offeredSubjectDetail  */
public class OfferedSubjectDetailFdt extends FormDataTable {
	public OfferedSubjectDetailFdt(final OfferedSubjectDetailForm form, final OfferedSubjectDetailDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public OfferedSubjectDetailDataTable getDataTable() {
		 return (OfferedSubjectDetailDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(OfferedSubjectDetailDataTable table) {
		this.dataTable = table;
	}
}
