package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.HallTicketStudentDataTable;
/** class for form data table hallTicketStudent  */
public class HallTicketStudentFdt extends FormDataTable {
	public HallTicketStudentFdt(final HallTicketStudentForm form, final HallTicketStudentDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public HallTicketStudentDataTable getDataTable() {
		 return (HallTicketStudentDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(HallTicketStudentDataTable table) {
		this.dataTable = table;
	}
}
