package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ProgramListDataTable;
/** class for form data table programList  */
public class ProgramListFdt extends FormDataTable {
	public ProgramListFdt(final ProgramListForm form, final ProgramListDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public ProgramListDataTable getDataTable() {
		 return (ProgramListDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(ProgramListDataTable table) {
		this.dataTable = table;
	}
}
