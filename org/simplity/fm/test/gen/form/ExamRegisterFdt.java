package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ExamRegisterDataTable;
/** class for form data table examRegister  */
public class ExamRegisterFdt extends FormDataTable {
	public ExamRegisterFdt(final ExamRegisterForm form, final ExamRegisterDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public ExamRegisterDataTable getDataTable() {
		 return (ExamRegisterDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(ExamRegisterDataTable table) {
		this.dataTable = table;
	}
}
