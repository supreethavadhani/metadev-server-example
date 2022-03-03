package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StudentAssessmentDetailData;
/** class for form data marksForAssessment  */
public class MarksForAssessmentFd extends FormData {
	public MarksForAssessmentFd(final MarksForAssessmentForm form, final StudentAssessmentDetailData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public StudentAssessmentDetailData getSchemaData() {
		return (StudentAssessmentDetailData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(StudentAssessmentDetailData data) {
		this.dataObject = data;
	}
}
