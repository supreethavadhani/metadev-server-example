package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SectionAttendanceDataTable;
/** class for form data table sectionAttendance  */
public class SectionAttendanceFdt extends FormDataTable {
	public SectionAttendanceFdt(final SectionAttendanceForm form, final SectionAttendanceDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public SectionAttendanceDataTable getDataTable() {
		 return (SectionAttendanceDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(SectionAttendanceDataTable table) {
		this.dataTable = table;
	}
}
