package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.OfferedSubjectListDataTable;
/** class for form data table offeredSubjectList  */
public class OfferedSubjectListFdt extends FormDataTable {
	public OfferedSubjectListFdt(final OfferedSubjectListForm form, final OfferedSubjectListDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public OfferedSubjectListDataTable getDataTable() {
		 return (OfferedSubjectListDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(OfferedSubjectListDataTable table) {
		this.dataTable = table;
	}
}
