package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StudentDetailDataTable;
/** class for form data table studentDetail  */
public class StudentDetailFdt extends FormDataTable {
	public StudentDetailFdt(final StudentDetailForm form, final StudentDetailDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public StudentDetailDataTable getDataTable() {
		 return (StudentDetailDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(StudentDetailDataTable table) {
		this.dataTable = table;
	}
}
