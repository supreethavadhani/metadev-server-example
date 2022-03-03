package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ForgotPasswordDataTable;
/** class for form data table forgotPassword  */
public class ForgotPasswordFdt extends FormDataTable {
	public ForgotPasswordFdt(final ForgotPasswordForm form, final ForgotPasswordDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public ForgotPasswordDataTable getDataTable() {
		 return (ForgotPasswordDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(ForgotPasswordDataTable table) {
		this.dataTable = table;
	}
}
