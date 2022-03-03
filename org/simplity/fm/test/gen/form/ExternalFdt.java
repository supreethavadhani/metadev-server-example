package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ExternalDataTable;
/** class for form data table external  */
public class ExternalFdt extends FormDataTable {
	public ExternalFdt(final ExternalForm form, final ExternalDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public ExternalDataTable getDataTable() {
		 return (ExternalDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(ExternalDataTable table) {
		this.dataTable = table;
	}
}
