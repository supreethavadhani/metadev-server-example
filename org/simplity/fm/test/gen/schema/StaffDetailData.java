package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of staffDetail
 */ 
public class StaffDetailData extends SchemaData {

	protected StaffDetailData(final StaffDetailSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected StaffDetailData newInstance(final Object[] arr) {
		return new StaffDetailData((StaffDetailSchema) this.schema, arr);
	}

	/**
	 * set value for staffId
	 * @param value to be assigned to staffId
	 */
	public void setStaffId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of staffId
	 */
	public long getStaffId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for empId
	 * @param value to be assigned to empId
	 */
	public void setEmpId(String value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of empId
	 */
	public String getEmpId(){
		return super.getStringValue(1);
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
	 * set value for departmentName
	 * @param value to be assigned to departmentName
	 */
	public void setDepartmentName(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of departmentName
	 */
	public String getDepartmentName(){
		return super.getStringValue(3);
	}

	/**
	 * set value for departmentId
	 * @param value to be assigned to departmentId
	 */
	public void setDepartmentId(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of departmentId
	 */
	public long getDepartmentId(){
		return super.getLongValue(4);
	}

	/**
	 * set value for firstName
	 * @param value to be assigned to firstName
	 */
	public void setFirstName(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of firstName
	 */
	public String getFirstName(){
		return super.getStringValue(5);
	}

	/**
	 * set value for middleName
	 * @param value to be assigned to middleName
	 */
	public void setMiddleName(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of middleName
	 */
	public String getMiddleName(){
		return super.getStringValue(6);
	}

	/**
	 * set value for lastName
	 * @param value to be assigned to lastName
	 */
	public void setLastName(String value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of lastName
	 */
	public String getLastName(){
		return super.getStringValue(7);
	}

	/**
	 * set value for displayName
	 * @param value to be assigned to displayName
	 */
	public void setDisplayName(String value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of displayName
	 */
	public String getDisplayName(){
		return super.getStringValue(8);
	}

	/**
	 * set value for email
	 * @param value to be assigned to email
	 */
	public void setEmail(String value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of email
	 */
	public String getEmail(){
		return super.getStringValue(9);
	}

	/**
	 * set value for phoneNumber
	 * @param value to be assigned to phoneNumber
	 */
	public void setPhoneNumber(String value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of phoneNumber
	 */
	public String getPhoneNumber(){
		return super.getStringValue(10);
	}
}
