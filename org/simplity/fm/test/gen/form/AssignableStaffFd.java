package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.AssignableStaffData;
/** class for form data assignableStaff  */
public class AssignableStaffFd extends FormData {
	public AssignableStaffFd(final AssignableStaffForm form, final AssignableStaffData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public AssignableStaffData getSchemaData() {
		return (AssignableStaffData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(AssignableStaffData data) {
		this.dataObject = data;
	}
}
