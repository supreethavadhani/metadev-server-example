package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.DepartmentDataTable;
/** class for form data table department  */
public class DepartmentFdt extends FormDataTable {
	public DepartmentFdt(final DepartmentForm form, final DepartmentDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public DepartmentDataTable getDataTable() {
		 return (DepartmentDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(DepartmentDataTable table) {
		this.dataTable = table;
	}
}
