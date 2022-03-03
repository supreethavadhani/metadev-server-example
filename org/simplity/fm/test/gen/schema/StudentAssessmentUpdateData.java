package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of studentAssessmentUpdate
 */ 
public class StudentAssessmentUpdateData extends SchemaData {

	protected StudentAssessmentUpdateData(final StudentAssessmentUpdateSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected StudentAssessmentUpdateData newInstance(final Object[] arr) {
		return new StudentAssessmentUpdateData((StudentAssessmentUpdateSchema) this.schema, arr);
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
	 * set value for subjectSectionId
	 * @param value to be assigned to subjectSectionId
	 */
	public void setSubjectSectionId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of subjectSectionId
	 */
	public long getSubjectSectionId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for assessmentSeqNo
	 * @param value to be assigned to assessmentSeqNo
	 */
	public void setAssessmentSeqNo(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of assessmentSeqNo
	 */
	public long getAssessmentSeqNo(){
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
	 * set value for hasAttended
	 * @param value to be assigned to hasAttended
	 */
	public void setHasAttended(boolean value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of hasAttended
	 */
	public boolean getHasAttended(){
		return super.getBoolValue(5);
	}

	/**
	 * set value for marksScored
	 * @param value to be assigned to marksScored
	 */
	public void setMarksScored(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of marksScored
	 */
	public long getMarksScored(){
		return super.getLongValue(6);
	}

	/**
	 * set value for enteredByUserId
	 * @param value to be assigned to enteredByUserId
	 */
	public void setEnteredByUserId(long value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of enteredByUserId
	 */
	public long getEnteredByUserId(){
		return super.getLongValue(7);
	}

	/**
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(8);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(9);
	}
}
