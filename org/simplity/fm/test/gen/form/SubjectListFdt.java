package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectListDataTable;
/** class for form data table subjectList  */
public class SubjectListFdt extends FormDataTable {
	public SubjectListFdt(final SubjectListForm form, final SubjectListDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public SubjectListDataTable getDataTable() {
		 return (SubjectListDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(SubjectListDataTable table) {
		this.dataTable = table;
	}
}
