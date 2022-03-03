package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SelectableTestDataTable;
/** class for form data table selectableTest  */
public class SelectableTestFdt extends FormDataTable {
	public SelectableTestFdt(final SelectableTestForm form, final SelectableTestDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public SelectableTestDataTable getDataTable() {
		 return (SelectableTestDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(SelectableTestDataTable table) {
		this.dataTable = table;
	}
}
