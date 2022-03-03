package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StaffDetailDataTable;
/** class for form data table staffDetail  */
public class StaffDetailFdt extends FormDataTable {
	public StaffDetailFdt(final StaffDetailForm form, final StaffDetailDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public StaffDetailDataTable getDataTable() {
		 return (StaffDetailDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(StaffDetailDataTable table) {
		this.dataTable = table;
	}
}
