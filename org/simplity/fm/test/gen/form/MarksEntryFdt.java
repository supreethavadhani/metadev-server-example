package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailDataTable;
/** class for form data table marksEntry  */
public class MarksEntryFdt extends FormDataTable {
	public MarksEntryFdt(final MarksEntryForm form, final SubjectSectionDetailDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public SubjectSectionDetailDataTable getDataTable() {
		 return (SubjectSectionDetailDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(SubjectSectionDetailDataTable table) {
		this.dataTable = table;
	}
}
