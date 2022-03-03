package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.CurrentApprovalDataTable;
/** class for form data table currentApproval  */
public class CurrentApprovalFdt extends FormDataTable {
	public CurrentApprovalFdt(final CurrentApprovalForm form, final CurrentApprovalDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public CurrentApprovalDataTable getDataTable() {
		 return (CurrentApprovalDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(CurrentApprovalDataTable table) {
		this.dataTable = table;
	}
}
