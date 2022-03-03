package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.AssessmentItemNameDataTable;
/** class for form data table assessmentItemName  */
public class AssessmentItemNameFdt extends FormDataTable {
	public AssessmentItemNameFdt(final AssessmentItemNameForm form, final AssessmentItemNameDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public AssessmentItemNameDataTable getDataTable() {
		 return (AssessmentItemNameDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(AssessmentItemNameDataTable table) {
		this.dataTable = table;
	}
}
