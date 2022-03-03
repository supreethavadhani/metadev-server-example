package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.LevelDataTable;
/** class for form data table level  */
public class LevelFdt extends FormDataTable {
	public LevelFdt(final LevelForm form, final LevelDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public LevelDataTable getDataTable() {
		 return (LevelDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(LevelDataTable table) {
		this.dataTable = table;
	}
}
