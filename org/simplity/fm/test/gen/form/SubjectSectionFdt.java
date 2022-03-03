package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectSectionDataTable;
/** class for form data table subjectSection  */
public class SubjectSectionFdt extends FormDataTable {
	public SubjectSectionFdt(final SubjectSectionForm form, final SubjectSectionDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public SubjectSectionDataTable getDataTable() {
		 return (SubjectSectionDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(SubjectSectionDataTable table) {
		this.dataTable = table;
	}
}
