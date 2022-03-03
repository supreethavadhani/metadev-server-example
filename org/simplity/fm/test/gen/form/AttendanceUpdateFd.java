package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.AttendanceUpdateData;
/** class for form data attendanceUpdate  */
public class AttendanceUpdateFd extends FormData {
	public AttendanceUpdateFd(final AttendanceUpdateForm form, final AttendanceUpdateData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public AttendanceUpdateData getSchemaData() {
		return (AttendanceUpdateData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(AttendanceUpdateData data) {
		this.dataObject = data;
	}
}
