package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SectionAttendanceData;
/** class for form data sectionAttendance  */
public class SectionAttendanceFd extends FormData {
	public SectionAttendanceFd(final SectionAttendanceForm form, final SectionAttendanceData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public SectionAttendanceData getSchemaData() {
		return (SectionAttendanceData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(SectionAttendanceData data) {
		this.dataObject = data;
	}
}
