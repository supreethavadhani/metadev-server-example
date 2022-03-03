package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of attendanceUpdate
 */ 
public class AttendanceUpdateData extends SchemaData {

	protected AttendanceUpdateData(final AttendanceUpdateSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected AttendanceUpdateData newInstance(final Object[] arr) {
		return new AttendanceUpdateData((AttendanceUpdateSchema) this.schema, arr);
	}

	/**
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of subjectRegisterId
	 */
	public long getSubjectRegisterId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for subjectId
	 * @param value to be assigned to subjectId
	 */
	public void setSubjectId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of subjectId
	 */
	public long getSubjectId(){
		return super.getLongValue(2);
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

	/**
	 * set value for subjectName
	 * @param value to be assigned to subjectName
	 */
	public void setSubjectName(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of subjectName
	 */
	public String getSubjectName(){
		return super.getStringValue(4);
	}

	/**
	 * set value for sectionName
	 * @param value to be assigned to sectionName
	 */
	public void setSectionName(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of sectionName
	 */
	public String getSectionName(){
		return super.getStringValue(5);
	}

	/**
	 * set value for studentName
	 * @param value to be assigned to studentName
	 */
	public void setStudentName(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of studentName
	 */
	public String getStudentName(){
		return super.getStringValue(6);
	}

	/**
	 * set value for usn
	 * @param value to be assigned to usn
	 */
	public void setUsn(String value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of usn
	 */
	public String getUsn(){
		return super.getStringValue(7);
	}

	/**
	 * set value for totalClasses
	 * @param value to be assigned to totalClasses
	 */
	public void setTotalClasses(long value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of totalClasses
	 */
	public long getTotalClasses(){
		return super.getLongValue(8);
	}

	/**
	 * set value for currentTotalAttendance
	 * @param value to be assigned to currentTotalAttendance
	 */
	public void setCurrentTotalAttendance(long value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of currentTotalAttendance
	 */
	public long getCurrentTotalAttendance(){
		return super.getLongValue(9);
	}

	/**
	 * set value for totalAttendance
	 * @param value to be assigned to totalAttendance
	 */
	public void setTotalAttendance(long value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of totalAttendance
	 */
	public long getTotalAttendance(){
		return super.getLongValue(10);
	}

	/**
	 * set value for requesterName
	 * @param value to be assigned to requesterName
	 */
	public void setRequesterName(String value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of requesterName
	 */
	public String getRequesterName(){
		return super.getStringValue(11);
	}

	/**
	 * set value for requesterPhone
	 * @param value to be assigned to requesterPhone
	 */
	public void setRequesterPhone(String value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of requesterPhone
	 */
	public String getRequesterPhone(){
		return super.getStringValue(12);
	}

	/**
	 * set value for remarks
	 * @param value to be assigned to remarks
	 */
	public void setRemarks(String value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of remarks
	 */
	public String getRemarks(){
		return super.getStringValue(13);
	}
}
