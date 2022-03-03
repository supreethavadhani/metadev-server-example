package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of registerableStudent
 */ 
public class RegisterableStudentData extends SchemaData {

	protected RegisterableStudentData(final RegisterableStudentSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected RegisterableStudentData newInstance(final Object[] arr) {
		return new RegisterableStudentData((RegisterableStudentSchema) this.schema, arr);
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
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(1);
	}

	/**
	 * set value for usn
	 * @param value to be assigned to usn
	 */
	public void setUsn(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of usn
	 */
	public String getUsn(){
		return super.getStringValue(2);
	}

	/**
	 * set value for department
	 * @param value to be assigned to department
	 */
	public void setDepartment(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of department
	 */
	public String getDepartment(){
		return super.getStringValue(3);
	}

	/**
	 * set value for isRegistered
	 * @param value to be assigned to isRegistered
	 */
	public void setIsRegistered(boolean value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of isRegistered
	 */
	public boolean getIsRegistered(){
		return super.getBoolValue(4);
	}
}
