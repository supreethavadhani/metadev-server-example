package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of assignableStaff
 */ 
public class AssignableStaffData extends SchemaData {

	protected AssignableStaffData(final AssignableStaffSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected AssignableStaffData newInstance(final Object[] arr) {
		return new AssignableStaffData((AssignableStaffSchema) this.schema, arr);
	}

	/**
	 * set value for departmentId
	 * @param value to be assigned to departmentId
	 */
	public void setDepartmentId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of departmentId
	 */
	public long getDepartmentId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for staffId
	 * @param value to be assigned to staffId
	 */
	public void setStaffId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of staffId
	 */
	public long getStaffId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for isAssigned
	 * @param value to be assigned to isAssigned
	 */
	public void setIsAssigned(boolean value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of isAssigned
	 */
	public boolean getIsAssigned(){
		return super.getBoolValue(2);
	}

	/**
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(3);
	}

	/**
	 * set value for email
	 * @param value to be assigned to email
	 */
	public void setEmail(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of email
	 */
	public String getEmail(){
		return super.getStringValue(4);
	}
}
