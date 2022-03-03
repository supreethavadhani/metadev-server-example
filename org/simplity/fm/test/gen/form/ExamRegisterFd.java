package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ExamRegisterData;
/** class for form data examRegister  */
public class ExamRegisterFd extends FormData {
	public ExamRegisterFd(final ExamRegisterForm form, final ExamRegisterData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public ExamRegisterData getSchemaData() {
		return (ExamRegisterData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(ExamRegisterData data) {
		this.dataObject = data;
	}
}
