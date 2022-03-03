package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.AssignedStaffNameData;
/** class for form data assignedStaffName  */
public class AssignedStaffNameFd extends FormData {
	public AssignedStaffNameFd(final AssignedStaffNameForm form, final AssignedStaffNameData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public AssignedStaffNameData getSchemaData() {
		return (AssignedStaffNameData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(AssignedStaffNameData data) {
		this.dataObject = data;
	}
}
