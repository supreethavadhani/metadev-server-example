package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.UserDataTable;
/** class for form data table user  */
public class UserFdt extends FormDataTable {
	public UserFdt(final UserForm form, final UserDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public UserDataTable getDataTable() {
		 return (UserDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(UserDataTable table) {
		this.dataTable = table;
	}
}
