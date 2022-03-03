package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.AssessmentItemNameData;
/** class for form data assessmentItemName  */
public class AssessmentItemNameFd extends FormData {
	public AssessmentItemNameFd(final AssessmentItemNameForm form, final AssessmentItemNameData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public AssessmentItemNameData getSchemaData() {
		return (AssessmentItemNameData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(AssessmentItemNameData data) {
		this.dataObject = data;
	}
}
