package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.PendingApprovalDataTable;
/** class for form data table pendingApproval  */
public class PendingApprovalFdt extends FormDataTable {
	public PendingApprovalFdt(final PendingApprovalForm form, final PendingApprovalDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public PendingApprovalDataTable getDataTable() {
		 return (PendingApprovalDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(PendingApprovalDataTable table) {
		this.dataTable = table;
	}
}
