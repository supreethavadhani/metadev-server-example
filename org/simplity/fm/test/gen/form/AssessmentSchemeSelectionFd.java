package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.AssessmentSchemeSelectionData;
/** class for form data assessmentSchemeSelection  */
public class AssessmentSchemeSelectionFd extends FormData {
	public AssessmentSchemeSelectionFd(final AssessmentSchemeSelectionForm form, final AssessmentSchemeSelectionData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public AssessmentSchemeSelectionData getSchemaData() {
		return (AssessmentSchemeSelectionData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(AssessmentSchemeSelectionData data) {
		this.dataObject = data;
	}
}
