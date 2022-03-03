package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.CurrentApprovalData;
/** class for form data currentApproval  */
public class CurrentApprovalFd extends FormData {
	public CurrentApprovalFd(final CurrentApprovalForm form, final CurrentApprovalData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public CurrentApprovalData getSchemaData() {
		return (CurrentApprovalData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(CurrentApprovalData data) {
		this.dataObject = data;
	}
}
