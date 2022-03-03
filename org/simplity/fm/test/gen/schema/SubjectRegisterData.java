package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of subjectRegister
 */ 
public class SubjectRegisterData extends SchemaData {

	protected SubjectRegisterData(final SubjectRegisterSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected SubjectRegisterData newInstance(final Object[] arr) {
		return new SubjectRegisterData((SubjectRegisterSchema) this.schema, arr);
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
	 * set value for sectionId
	 * @param value to be assigned to sectionId
	 */
	public void setSectionId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of sectionId
	 */
	public long getSectionId(){
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
	 * set value for seasonId
	 * @param value to be assigned to seasonId
	 */
	public void setSeasonId(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of seasonId
	 */
	public long getSeasonId(){
		return super.getLongValue(5);
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of offeredSubjectId
	 */
	public long getOfferedSubjectId(){
		return super.getLongValue(6);
	}

	/**
	 * set value for subjectSectionId
	 * @param value to be assigned to subjectSectionId
	 */
	public void setSubjectSectionId(long value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of subjectSectionId
	 */
	public long getSubjectSectionId(){
		return super.getLongValue(7);
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
	 * set value for totalAttendance
	 * @param value to be assigned to totalAttendance
	 */
	public void setTotalAttendance(long value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of totalAttendance
	 */
	public long getTotalAttendance(){
		return super.getLongValue(9);
	}

	/**
	 * set value for overallAttendance
	 * @param value to be assigned to overallAttendance
	 */
	public void setOverallAttendance(String value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of overallAttendance
	 */
	public String getOverallAttendance(){
		return super.getStringValue(10);
	}

	/**
	 * set value for cieMarks
	 * @param value to be assigned to cieMarks
	 */
	public void setCieMarks(long value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of cieMarks
	 */
	public long getCieMarks(){
		return super.getLongValue(11);
	}

	/**
	 * set value for hasAttendanceShortage
	 * @param value to be assigned to hasAttendanceShortage
	 */
	public void setHasAttendanceShortage(boolean value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of hasAttendanceShortage
	 */
	public boolean getHasAttendanceShortage(){
		return super.getBoolValue(12);
	}

	/**
	 * set value for hasCieShortage
	 * @param value to be assigned to hasCieShortage
	 */
	public void setHasCieShortage(boolean value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of hasCieShortage
	 */
	public boolean getHasCieShortage(){
		return super.getBoolValue(13);
	}

	/**
	 * set value for isCondonable
	 * @param value to be assigned to isCondonable
	 */
	public void setIsCondonable(boolean value){
		this.fieldValues[14] = value;
	}

	/**
	 * @return value of isCondonable
	 */
	public boolean getIsCondonable(){
		return super.getBoolValue(14);
	}

	/**
	 * set value for isCondoned
	 * @param value to be assigned to isCondoned
	 */
	public void setIsCondoned(boolean value){
		this.fieldValues[15] = value;
	}

	/**
	 * @return value of isCondoned
	 */
	public boolean getIsCondoned(){
		return super.getBoolValue(15);
	}

	/**
	 * set value for condonedByUser
	 * @param value to be assigned to condonedByUser
	 */
	public void setCondonedByUser(long value){
		this.fieldValues[16] = value;
	}

	/**
	 * @return value of condonedByUser
	 */
	public long getCondonedByUser(){
		return super.getLongValue(16);
	}

	/**
	 * set value for isEligibleForExam
	 * @param value to be assigned to isEligibleForExam
	 */
	public void setIsEligibleForExam(boolean value){
		this.fieldValues[17] = value;
	}

	/**
	 * @return value of isEligibleForExam
	 */
	public boolean getIsEligibleForExam(){
		return super.getBoolValue(17);
	}

	/**
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[18] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(18);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[19] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(19);
	}
}
