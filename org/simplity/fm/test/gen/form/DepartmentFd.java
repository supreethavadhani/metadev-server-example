package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.DepartmentData;
/** class for form data department  */
public class DepartmentFd extends FormData {
	public DepartmentFd(final DepartmentForm form, final DepartmentData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public DepartmentData getSchemaData() {
		return (DepartmentData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(DepartmentData data) {
		this.dataObject = data;
	}
}
