package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.CieMarksDataTable;
/** class for form data table cieMarks  */
public class CieMarksFdt extends FormDataTable {
	public CieMarksFdt(final CieMarksForm form, final CieMarksDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public CieMarksDataTable getDataTable() {
		 return (CieMarksDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(CieMarksDataTable table) {
		this.dataTable = table;
	}
}
