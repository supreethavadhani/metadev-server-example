package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.CodedPaperNameDataTable;
/** class for form data table codedPaperName  */
public class CodedPaperNameFdt extends FormDataTable {
	public CodedPaperNameFdt(final CodedPaperNameForm form, final CodedPaperNameDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public CodedPaperNameDataTable getDataTable() {
		 return (CodedPaperNameDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(CodedPaperNameDataTable table) {
		this.dataTable = table;
	}
}
