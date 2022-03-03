package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.IntegratedCieDataTable;
/** class for form data table integratedCie  */
public class IntegratedCieFdt extends FormDataTable {
	public IntegratedCieFdt(final IntegratedCieForm form, final IntegratedCieDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public IntegratedCieDataTable getDataTable() {
		 return (IntegratedCieDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(IntegratedCieDataTable table) {
		this.dataTable = table;
	}
}
