package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ChildSubjectDataTable;
/** class for form data table childSubject  */
public class ChildSubjectFdt extends FormDataTable {
	public ChildSubjectFdt(final ChildSubjectForm form, final ChildSubjectDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public ChildSubjectDataTable getDataTable() {
		 return (ChildSubjectDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(ChildSubjectDataTable table) {
		this.dataTable = table;
	}
}
