package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ExamAttendanceData;
/** class for form data examAttendance  */
public class ExamAttendanceFd extends FormData {
	public ExamAttendanceFd(final ExamAttendanceForm form, final ExamAttendanceData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public ExamAttendanceData getSchemaData() {
		return (ExamAttendanceData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(ExamAttendanceData data) {
		this.dataObject = data;
	}

	/** get form table for this linked form ExamRegister **/
	public ExamRegisterFdt getExamRegisterFdt() {
		return (ExamRegisterFdt)this.linkedData[0];
	}

	/** set form table for this linked form ExamRegister **/
	public void setExamRegisterFdt(ExamRegisterFdt fdt) {
		 this.linkedData[0] = (ExamRegisterFdt) fdt;
	}
}
