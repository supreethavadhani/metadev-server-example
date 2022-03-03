package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ExamAttendanceDataTable;
/** class for form data table examAttendance  */
public class ExamAttendanceFdt extends FormDataTable {
	public ExamAttendanceFdt(final ExamAttendanceForm form, final ExamAttendanceDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public ExamAttendanceDataTable getDataTable() {
		 return (ExamAttendanceDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(ExamAttendanceDataTable table) {
		this.dataTable = table;
	}
}
