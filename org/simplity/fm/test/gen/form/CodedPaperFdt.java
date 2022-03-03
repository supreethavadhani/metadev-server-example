package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.CodedPaperDataTable;
/** class for form data table codedPaper  */
public class CodedPaperFdt extends FormDataTable {
	public CodedPaperFdt(final CodedPaperForm form, final CodedPaperDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public CodedPaperDataTable getDataTable() {
		 return (CodedPaperDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(CodedPaperDataTable table) {
		this.dataTable = table;
	}
}
