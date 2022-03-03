package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ApprovalData;
/** class for form data approval  */
public class ApprovalFd extends FormData {
	public ApprovalFd(final ApprovalForm form, final ApprovalData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public ApprovalData getSchemaData() {
		return (ApprovalData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(ApprovalData data) {
		this.dataObject = data;
	}
}
