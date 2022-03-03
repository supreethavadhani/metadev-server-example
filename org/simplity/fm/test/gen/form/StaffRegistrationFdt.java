package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StaffRegistrationDataTable;
/** class for form data table staffRegistration  */
public class StaffRegistrationFdt extends FormDataTable {
	public StaffRegistrationFdt(final StaffRegistrationForm form, final StaffRegistrationDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public StaffRegistrationDataTable getDataTable() {
		 return (StaffRegistrationDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(StaffRegistrationDataTable table) {
		this.dataTable = table;
	}
}
