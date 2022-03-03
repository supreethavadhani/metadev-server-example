package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StaffDataTable;
/** class for form data table staff  */
public class StaffFdt extends FormDataTable {
	public StaffFdt(final StaffForm form, final StaffDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public StaffDataTable getDataTable() {
		 return (StaffDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(StaffDataTable table) {
		this.dataTable = table;
	}
}
