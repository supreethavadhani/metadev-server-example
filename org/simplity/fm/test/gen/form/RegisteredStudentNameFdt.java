package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.RegisteredStudentNameDataTable;
/** class for form data table registeredStudentName  */
public class RegisteredStudentNameFdt extends FormDataTable {
	public RegisteredStudentNameFdt(final RegisteredStudentNameForm form, final RegisteredStudentNameDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public RegisteredStudentNameDataTable getDataTable() {
		 return (RegisteredStudentNameDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(RegisteredStudentNameDataTable table) {
		this.dataTable = table;
	}
}
