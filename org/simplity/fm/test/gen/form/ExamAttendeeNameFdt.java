package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ExamAttendeeNameDataTable;
/** class for form data table examAttendeeName  */
public class ExamAttendeeNameFdt extends FormDataTable {
	public ExamAttendeeNameFdt(final ExamAttendeeNameForm form, final ExamAttendeeNameDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public ExamAttendeeNameDataTable getDataTable() {
		 return (ExamAttendeeNameDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(ExamAttendeeNameDataTable table) {
		this.dataTable = table;
	}
}
