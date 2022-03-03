package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ExamAttendeeNameData;
/** class for form data examAttendeeName  */
public class ExamAttendeeNameFd extends FormData {
	public ExamAttendeeNameFd(final ExamAttendeeNameForm form, final ExamAttendeeNameData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public ExamAttendeeNameData getSchemaData() {
		return (ExamAttendeeNameData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(ExamAttendeeNameData data) {
		this.dataObject = data;
	}
}
