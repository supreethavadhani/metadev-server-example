package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SeasonDataTable;
/** class for form data table season  */
public class SeasonFdt extends FormDataTable {
	public SeasonFdt(final SeasonForm form, final SeasonDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public SeasonDataTable getDataTable() {
		 return (SeasonDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(SeasonDataTable table) {
		this.dataTable = table;
	}
}
