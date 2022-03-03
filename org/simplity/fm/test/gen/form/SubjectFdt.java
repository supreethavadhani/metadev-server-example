package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectDataTable;
/** class for form data table subject  */
public class SubjectFdt extends FormDataTable {
	public SubjectFdt(final SubjectForm form, final SubjectDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public SubjectDataTable getDataTable() {
		 return (SubjectDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(SubjectDataTable table) {
		this.dataTable = table;
	}
}
