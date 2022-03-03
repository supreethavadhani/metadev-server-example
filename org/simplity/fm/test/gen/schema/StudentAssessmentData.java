package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of studentAssessment
 */ 
public class StudentAssessmentData extends SchemaData {

	protected StudentAssessmentData(final StudentAssessmentSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected StudentAssessmentData newInstance(final Object[] arr) {
		return new StudentAssessmentData((StudentAssessmentSchema) this.schema, arr);
	}

	/**
	 * set value for studentAssessmentId
	 * @param value to be assigned to studentAssessmentId
	 */
	public void setStudentAssessmentId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of studentAssessmentId
	 */
	public long getStudentAssessmentId(){
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
	 * set value for seasonId
	 * @param value to be assigned to seasonId
	 */
	public void setSeasonId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of seasonId
	 */
	public long getSeasonId(){
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
	 * set value for subjectSectionId
	 * @param value to be assigned to subjectSectionId
	 */
	public void setSubjectSectionId(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of subjectSectionId
	 */
	public long getSubjectSectionId(){
		return super.getLongValue(4);
	}

	/**
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of subjectRegisterId
	 */
	public long getSubjectRegisterId(){
		return super.getLongValue(5);
	}

	/**
	 * set value for assessmentSchemeId
	 * @param value to be assigned to assessmentSchemeId
	 */
	public void setAssessmentSchemeId(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of assessmentSchemeId
	 */
	public long getAssessmentSchemeId(){
		return super.getLongValue(6);
	}

	/**
	 * set value for assessmentSeqNo
	 * @param value to be assigned to assessmentSeqNo
	 */
	public void setAssessmentSeqNo(long value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of assessmentSeqNo
	 */
	public long getAssessmentSeqNo(){
		return super.getLongValue(7);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of studentId
	 */
	public long getStudentId(){
		return super.getLongValue(8);
	}

	/**
	 * set value for sectionId
	 * @param value to be assigned to sectionId
	 */
	public void setSectionId(long value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of sectionId
	 */
	public long getSectionId(){
		return super.getLongValue(9);
	}

	/**
	 * set value for hasAttended
	 * @param value to be assigned to hasAttended
	 */
	public void setHasAttended(boolean value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of hasAttended
	 */
	public boolean getHasAttended(){
		return super.getBoolValue(10);
	}

	/**
	 * set value for marksScored
	 * @param value to be assigned to marksScored
	 */
	public void setMarksScored(long value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of marksScored
	 */
	public long getMarksScored(){
		return super.getLongValue(11);
	}

	/**
	 * set value for enteredByUserId
	 * @param value to be assigned to enteredByUserId
	 */
	public void setEnteredByUserId(long value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of enteredByUserId
	 */
	public long getEnteredByUserId(){
		return super.getLongValue(12);
	}

	/**
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(13);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[14] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(14);
	}
}
