package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StudentInRegisterDataTable;
/** class for form data table marksForStudent  */
public class MarksForStudentFdt extends FormDataTable {
	public MarksForStudentFdt(final MarksForStudentForm form, final StudentInRegisterDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public StudentInRegisterDataTable getDataTable() {
		 return (StudentInRegisterDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(StudentInRegisterDataTable table) {
		this.dataTable = table;
	}
}
