package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.AttendanceUpdateDataTable;
/** class for form data table attendanceUpdate  */
public class AttendanceUpdateFdt extends FormDataTable {
	public AttendanceUpdateFdt(final AttendanceUpdateForm form, final AttendanceUpdateDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public AttendanceUpdateDataTable getDataTable() {
		 return (AttendanceUpdateDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(AttendanceUpdateDataTable table) {
		this.dataTable = table;
	}
}
