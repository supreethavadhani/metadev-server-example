package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ApprovalDataTable;
/** class for form data table approval  */
public class ApprovalFdt extends FormDataTable {
	public ApprovalFdt(final ApprovalForm form, final ApprovalDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public ApprovalDataTable getDataTable() {
		 return (ApprovalDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(ApprovalDataTable table) {
		this.dataTable = table;
	}
}
