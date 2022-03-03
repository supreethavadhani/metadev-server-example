package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StaffData;
/** class for form data staff  */
public class StaffFd extends FormData {
	public StaffFd(final StaffForm form, final StaffData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public StaffData getSchemaData() {
		return (StaffData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(StaffData data) {
		this.dataObject = data;
	}
}
