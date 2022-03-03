package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StudentDataTable;
/** class for form data table student  */
public class StudentFdt extends FormDataTable {
	public StudentFdt(final StudentForm form, final StudentDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public StudentDataTable getDataTable() {
		 return (StudentDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(StudentDataTable table) {
		this.dataTable = table;
	}
}
