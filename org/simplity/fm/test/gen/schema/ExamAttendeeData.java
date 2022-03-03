package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of examAttendee
 */ 
public class ExamAttendeeData extends SchemaData {

	protected ExamAttendeeData(final ExamAttendeeSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected ExamAttendeeData newInstance(final Object[] arr) {
		return new ExamAttendeeData((ExamAttendeeSchema) this.schema, arr);
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
	 * set value for isMakeup
	 * @param value to be assigned to isMakeup
	 */
	public void setIsMakeup(boolean value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of isMakeup
	 */
	public boolean getIsMakeup(){
		return super.getBoolValue(1);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of offeredSubjectId
	 */
	public long getOfferedSubjectId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of studentId
	 */
	public long getStudentId(){
		return super.getLongValue(4);
	}

	/**
	 * set value for eligibleForReval
	 * @param value to be assigned to eligibleForReval
	 */
	public void setEligibleForReval(boolean value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of eligibleForReval
	 */
	public boolean getEligibleForReval(){
		return super.getBoolValue(5);
	}

	/**
	 * set value for optedForReval
	 * @param value to be assigned to optedForReval
	 */
	public void setOptedForReval(boolean value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of optedForReval
	 */
	public boolean getOptedForReval(){
		return super.getBoolValue(6);
	}

	/**
	 * set value for optedToChallenge
	 * @param value to be assigned to optedToChallenge
	 */
	public void setOptedToChallenge(boolean value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of optedToChallenge
	 */
	public boolean getOptedToChallenge(){
		return super.getBoolValue(7);
	}

	/**
	 * set value for finalMarks
	 * @param value to be assigned to finalMarks
	 */
	public void setFinalMarks(long value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of finalMarks
	 */
	public long getFinalMarks(){
		return super.getLongValue(8);
	}

	/**
	 * set value for listedMarks
	 * @param value to be assigned to listedMarks
	 */
	public void setListedMarks(long value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of listedMarks
	 */
	public long getListedMarks(){
		return super.getLongValue(9);
	}

	/**
	 * set value for grade
	 * @param value to be assigned to grade
	 */
	public void setGrade(String value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of grade
	 */
	public String getGrade(){
		return super.getStringValue(10);
	}
}
