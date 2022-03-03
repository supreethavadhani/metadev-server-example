package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ProgramDataTable;
/** class for form data table program  */
public class ProgramFdt extends FormDataTable {
	public ProgramFdt(final ProgramForm form, final ProgramDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public ProgramDataTable getDataTable() {
		 return (ProgramDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(ProgramDataTable table) {
		this.dataTable = table;
	}
}
