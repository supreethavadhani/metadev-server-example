package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.AssignableStaffDataTable;
/** class for form data table assignableStaff  */
public class AssignableStaffFdt extends FormDataTable {
	public AssignableStaffFdt(final AssignableStaffForm form, final AssignableStaffDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public AssignableStaffDataTable getDataTable() {
		 return (AssignableStaffDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(AssignableStaffDataTable table) {
		this.dataTable = table;
	}
}
