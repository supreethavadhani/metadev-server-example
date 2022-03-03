package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.AssignedStaffNameDataTable;
/** class for form data table assignedStaffName  */
public class AssignedStaffNameFdt extends FormDataTable {
	public AssignedStaffNameFdt(final AssignedStaffNameForm form, final AssignedStaffNameDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public AssignedStaffNameDataTable getDataTable() {
		 return (AssignedStaffNameDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(AssignedStaffNameDataTable table) {
		this.dataTable = table;
	}
}
