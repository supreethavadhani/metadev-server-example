package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.CieDownloadDataTable;
/** class for form data table cieDownload  */
public class CieDownloadFdt extends FormDataTable {
	public CieDownloadFdt(final CieDownloadForm form, final CieDownloadDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public CieDownloadDataTable getDataTable() {
		 return (CieDownloadDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(CieDownloadDataTable table) {
		this.dataTable = table;
	}
}
