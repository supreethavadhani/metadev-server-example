package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of hallTicketSubject
 */ 
public class HallTicketSubjectData extends SchemaData {

	protected HallTicketSubjectData(final HallTicketSubjectSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected HallTicketSubjectData newInstance(final Object[] arr) {
		return new HallTicketSubjectData((HallTicketSubjectSchema) this.schema, arr);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of studentId
	 */
	public long getStudentId(){
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
	 * set value for subjectName
	 * @param value to be assigned to subjectName
	 */
	public void setSubjectName(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of subjectName
	 */
	public String getSubjectName(){
		return super.getStringValue(2);
	}

	/**
	 * set value for subjectCode
	 * @param value to be assigned to subjectCode
	 */
	public void setSubjectCode(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of subjectCode
	 */
	public String getSubjectCode(){
		return super.getStringValue(3);
	}

	/**
	 * set value for isEligible
	 * @param value to be assigned to isEligible
	 */
	public void setIsEligible(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of isEligible
	 */
	public String getIsEligible(){
		return super.getStringValue(4);
	}
}
