package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.OfferedSubjectDataTable;
/** class for form data table selectSubjectTest  */
public class SelectSubjectTestFdt extends FormDataTable {
	public SelectSubjectTestFdt(final SelectSubjectTestForm form, final OfferedSubjectDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public OfferedSubjectDataTable getDataTable() {
		 return (OfferedSubjectDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(OfferedSubjectDataTable table) {
		this.dataTable = table;
	}
}
