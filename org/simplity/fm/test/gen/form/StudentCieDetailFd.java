package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StudentCieDetailData;
/** class for form data studentCieDetail  */
public class StudentCieDetailFd extends FormData {
	public StudentCieDetailFd(final StudentCieDetailForm form, final StudentCieDetailData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public StudentCieDetailData getSchemaData() {
		return (StudentCieDetailData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(StudentCieDetailData data) {
		this.dataObject = data;
	}
}
