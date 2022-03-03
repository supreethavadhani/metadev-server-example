package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.PendingApprovalData;
/** class for form data pendingApproval  */
public class PendingApprovalFd extends FormData {
	public PendingApprovalFd(final PendingApprovalForm form, final PendingApprovalData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public PendingApprovalData getSchemaData() {
		return (PendingApprovalData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(PendingApprovalData data) {
		this.dataObject = data;
	}
}
