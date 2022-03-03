package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StudentDetailData;
/** class for form data studentDetail  */
public class StudentDetailFd extends FormData {
	public StudentDetailFd(final StudentDetailForm form, final StudentDetailData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public StudentDetailData getSchemaData() {
		return (StudentDetailData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(StudentDetailData data) {
		this.dataObject = data;
	}
}
