package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailDataTable;
/** class for form data table consolidatedAttendance  */
public class ConsolidatedAttendanceFdt extends FormDataTable {
	public ConsolidatedAttendanceFdt(final ConsolidatedAttendanceForm form, final SubjectSectionDetailDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public SubjectSectionDetailDataTable getDataTable() {
		 return (SubjectSectionDetailDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(SubjectSectionDetailDataTable table) {
		this.dataTable = table;
	}
}
