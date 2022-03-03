package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.HallTicketSubjectDataTable;
/** class for form data table hallTicketSubject  */
public class HallTicketSubjectFdt extends FormDataTable {
	public HallTicketSubjectFdt(final HallTicketSubjectForm form, final HallTicketSubjectDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public HallTicketSubjectDataTable getDataTable() {
		 return (HallTicketSubjectDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(HallTicketSubjectDataTable table) {
		this.dataTable = table;
	}
}
