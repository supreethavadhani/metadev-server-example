package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ProgramLevelListDataTable;
/** class for form data table hallTicketLevel  */
public class HallTicketLevelFdt extends FormDataTable {
	public HallTicketLevelFdt(final HallTicketLevelForm form, final ProgramLevelListDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public ProgramLevelListDataTable getDataTable() {
		 return (ProgramLevelListDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(ProgramLevelListDataTable table) {
		this.dataTable = table;
	}
}
