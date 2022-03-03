package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.MarksUpdateDataTable;
/** class for form data table marksUpdate  */
public class MarksUpdateFdt extends FormDataTable {
	public MarksUpdateFdt(final MarksUpdateForm form, final MarksUpdateDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public MarksUpdateDataTable getDataTable() {
		 return (MarksUpdateDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(MarksUpdateDataTable table) {
		this.dataTable = table;
	}
}
