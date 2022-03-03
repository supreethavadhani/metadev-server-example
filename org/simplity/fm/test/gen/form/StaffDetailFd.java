package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StaffDetailData;
/** class for form data staffDetail  */
public class StaffDetailFd extends FormData {
	public StaffDetailFd(final StaffDetailForm form, final StaffDetailData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public StaffDetailData getSchemaData() {
		return (StaffDetailData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(StaffDetailData data) {
		this.dataObject = data;
	}
}
