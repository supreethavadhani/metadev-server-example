package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.RegisterableStudentData;
/** class for form data registerableStudent  */
public class RegisterableStudentFd extends FormData {
	public RegisterableStudentFd(final RegisterableStudentForm form, final RegisterableStudentData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public RegisterableStudentData getSchemaData() {
		return (RegisterableStudentData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(RegisterableStudentData data) {
		this.dataObject = data;
	}
}
