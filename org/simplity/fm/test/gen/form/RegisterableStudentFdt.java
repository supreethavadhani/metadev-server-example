package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.RegisterableStudentDataTable;
/** class for form data table registerableStudent  */
public class RegisterableStudentFdt extends FormDataTable {
	public RegisterableStudentFdt(final RegisterableStudentForm form, final RegisterableStudentDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public RegisterableStudentDataTable getDataTable() {
		 return (RegisterableStudentDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(RegisterableStudentDataTable table) {
		this.dataTable = table;
	}
}
