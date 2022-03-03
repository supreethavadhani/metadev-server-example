package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.AssessmentSchemeSelectionDataTable;
/** class for form data table assessmentSchemeSelection  */
public class AssessmentSchemeSelectionFdt extends FormDataTable {
	public AssessmentSchemeSelectionFdt(final AssessmentSchemeSelectionForm form, final AssessmentSchemeSelectionDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public AssessmentSchemeSelectionDataTable getDataTable() {
		 return (AssessmentSchemeSelectionDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(AssessmentSchemeSelectionDataTable table) {
		this.dataTable = table;
	}
}
