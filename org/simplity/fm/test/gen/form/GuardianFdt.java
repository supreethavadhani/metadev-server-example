package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.GuardianDataTable;
/** class for form data table guardian  */
public class GuardianFdt extends FormDataTable {
	public GuardianFdt(final GuardianForm form, final GuardianDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public GuardianDataTable getDataTable() {
		 return (GuardianDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(GuardianDataTable table) {
		this.dataTable = table;
	}
}
