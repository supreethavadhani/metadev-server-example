package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.SchemaData;
import java.time.LocalDate;
import java.time.Instant;
/** class for form data examAttendeeList  */
public class ExamAttendeeListFd extends FormData {
	public ExamAttendeeListFd(final ExamAttendeeListForm form, final SchemaData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	/**
	 * set value for departmentId
	 * @param value to be assigned to departmentId
	 */
	public void setDepartmentId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of departmentId
	 */
	public long getDepartmentId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of offeredSubjectId
	 */
	public long getOfferedSubjectId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for isMakeup
	 * @param value to be assigned to isMakeup
	 */
	public void setIsMakeup(boolean value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of isMakeup
	 */
	public boolean getIsMakeup(){
		return super.getBoolValue(2);
	}

	/** get form table for this linked form ExamAttendeeName **/
	public ExamAttendeeNameFdt getExamAttendeeNameFdt() {
		return (ExamAttendeeNameFdt)this.linkedData[0];
	}

	/** set form table for this linked form ExamAttendeeName **/
	public void setExamAttendeeNameFdt(ExamAttendeeNameFdt fdt) {
		 this.linkedData[0] = (ExamAttendeeNameFdt) fdt;
	}
}
