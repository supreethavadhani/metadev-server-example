package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StudentAssessmentDetailDataTable;
/** class for form data table marksForAssessment  */
public class MarksForAssessmentFdt extends FormDataTable {
	public MarksForAssessmentFdt(final MarksForAssessmentForm form, final StudentAssessmentDetailDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public StudentAssessmentDetailDataTable getDataTable() {
		 return (StudentAssessmentDetailDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(StudentAssessmentDetailDataTable table) {
		this.dataTable = table;
	}
}
