package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailData;
import java.time.LocalDate;
import java.time.Instant;
/** class for form data consolidatedAttendanceEdit  */
public class ConsolidatedAttendanceEditFd extends FormData {
	public ConsolidatedAttendanceEditFd(final ConsolidatedAttendanceEditForm form, final SubjectSectionDetailData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public SubjectSectionDetailData getSchemaData() {
		return (SubjectSectionDetailData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(SubjectSectionDetailData data) {
		this.dataObject = data;
	}

	/**
	 * set value for currentAttended
	 * @param value to be assigned to currentAttended
	 */
	public void setCurrentAttended(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of currentAttended
	 */
	public long getCurrentAttended(){
		return super.getLongValue(0);
	}

	/**
	 * set value for updatedAttended
	 * @param value to be assigned to updatedAttended
	 */
	public void setUpdatedAttended(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of updatedAttended
	 */
	public long getUpdatedAttended(){
		return super.getLongValue(1);
	}

	/**
	 * set value for studentName
	 * @param value to be assigned to studentName
	 */
	public void setStudentName(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of studentName
	 */
	public String getStudentName(){
		return super.getStringValue(2);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of studentId
	 */
	public long getStudentId(){
		return super.getLongValue(3);
	}
}
