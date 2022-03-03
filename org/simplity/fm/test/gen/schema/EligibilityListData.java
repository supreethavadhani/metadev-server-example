package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of eligibilityList
 */ 
public class EligibilityListData extends SchemaData {

	protected EligibilityListData(final EligibilityListSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected EligibilityListData newInstance(final Object[] arr) {
		return new EligibilityListData((EligibilityListSchema) this.schema, arr);
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
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(4);
	}

	/**
	 * set value for usn
	 * @param value to be assigned to usn
	 */
	public void setUsn(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of usn
	 */
	public String getUsn(){
		return super.getStringValue(5);
	}

	/**
	 * set value for cieMarks
	 * @param value to be assigned to cieMarks
	 */
	public void setCieMarks(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of cieMarks
	 */
	public long getCieMarks(){
		return super.getLongValue(6);
	}

	/**
	 * set value for overallAttendance
	 * @param value to be assigned to overallAttendance
	 */
	public void setOverallAttendance(String value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of overallAttendance
	 */
	public String getOverallAttendance(){
		return super.getStringValue(7);
	}

	/**
	 * set value for hasAttendanceShortage
	 * @param value to be assigned to hasAttendanceShortage
	 */
	public void setHasAttendanceShortage(boolean value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of hasAttendanceShortage
	 */
	public boolean getHasAttendanceShortage(){
		return super.getBoolValue(8);
	}

	/**
	 * set value for isCondoned
	 * @param value to be assigned to isCondoned
	 */
	public void setIsCondoned(boolean value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of isCondoned
	 */
	public boolean getIsCondoned(){
		return super.getBoolValue(9);
	}

	/**
	 * set value for isCondonable
	 * @param value to be assigned to isCondonable
	 */
	public void setIsCondonable(boolean value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of isCondonable
	 */
	public boolean getIsCondonable(){
		return super.getBoolValue(10);
	}

	/**
	 * set value for isEligibleForExam
	 * @param value to be assigned to isEligibleForExam
	 */
	public void setIsEligibleForExam(boolean value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of isEligibleForExam
	 */
	public boolean getIsEligibleForExam(){
		return super.getBoolValue(11);
	}
}
