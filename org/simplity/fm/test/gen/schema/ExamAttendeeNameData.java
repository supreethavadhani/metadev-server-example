package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of examAttendeeName
 */ 
public class ExamAttendeeNameData extends SchemaData {

	protected ExamAttendeeNameData(final ExamAttendeeNameSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected ExamAttendeeNameData newInstance(final Object[] arr) {
		return new ExamAttendeeNameData((ExamAttendeeNameSchema) this.schema, arr);
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
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(5);
	}

	/**
	 * set value for usn
	 * @param value to be assigned to usn
	 */
	public void setUsn(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of usn
	 */
	public String getUsn(){
		return super.getStringValue(6);
	}

	/**
	 * set value for department
	 * @param value to be assigned to department
	 */
	public void setDepartment(String value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of department
	 */
	public String getDepartment(){
		return super.getStringValue(7);
	}

	/**
	 * set value for level
	 * @param value to be assigned to level
	 */
	public void setLevel(String value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of level
	 */
	public String getLevel(){
		return super.getStringValue(8);
	}

	/**
	 * set value for section
	 * @param value to be assigned to section
	 */
	public void setSection(String value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of section
	 */
	public String getSection(){
		return super.getStringValue(9);
	}
}
