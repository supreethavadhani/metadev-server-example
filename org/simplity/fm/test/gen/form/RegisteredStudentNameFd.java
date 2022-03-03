package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.RegisteredStudentNameData;
/** class for form data registeredStudentName  */
public class RegisteredStudentNameFd extends FormData {
	public RegisteredStudentNameFd(final RegisteredStudentNameForm form, final RegisteredStudentNameData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public RegisteredStudentNameData getSchemaData() {
		return (RegisteredStudentNameData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(RegisteredStudentNameData data) {
		this.dataObject = data;
	}
}
