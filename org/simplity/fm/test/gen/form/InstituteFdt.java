package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.InstituteDataTable;
/** class for form data table institute  */
public class InstituteFdt extends FormDataTable {
	public InstituteFdt(final InstituteForm form, final InstituteDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public InstituteDataTable getDataTable() {
		 return (InstituteDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(InstituteDataTable table) {
		this.dataTable = table;
	}
}
