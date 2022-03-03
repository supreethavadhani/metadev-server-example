package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of staff
 */ 
public class StaffData extends SchemaData {

	protected StaffData(final StaffSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected StaffData newInstance(final Object[] arr) {
		return new StaffData((StaffSchema) this.schema, arr);
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
	 * set value for departmentId
	 * @param value to be assigned to departmentId
	 */
	public void setDepartmentId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of departmentId
	 */
	public long getDepartmentId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for empId
	 * @param value to be assigned to empId
	 */
	public void setEmpId(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of empId
	 */
	public String getEmpId(){
		return super.getStringValue(3);
	}

	/**
	 * set value for firstName
	 * @param value to be assigned to firstName
	 */
	public void setFirstName(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of firstName
	 */
	public String getFirstName(){
		return super.getStringValue(4);
	}

	/**
	 * set value for middleName
	 * @param value to be assigned to middleName
	 */
	public void setMiddleName(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of middleName
	 */
	public String getMiddleName(){
		return super.getStringValue(5);
	}

	/**
	 * set value for lastName
	 * @param value to be assigned to lastName
	 */
	public void setLastName(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of lastName
	 */
	public String getLastName(){
		return super.getStringValue(6);
	}

	/**
	 * set value for displayName
	 * @param value to be assigned to displayName
	 */
	public void setDisplayName(String value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of displayName
	 */
	public String getDisplayName(){
		return super.getStringValue(7);
	}

	/**
	 * set value for spouseName
	 * @param value to be assigned to spouseName
	 */
	public void setSpouseName(String value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of spouseName
	 */
	public String getSpouseName(){
		return super.getStringValue(8);
	}

	/**
	 * set value for fatherName
	 * @param value to be assigned to fatherName
	 */
	public void setFatherName(String value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of fatherName
	 */
	public String getFatherName(){
		return super.getStringValue(9);
	}

	/**
	 * set value for addressLine1
	 * @param value to be assigned to addressLine1
	 */
	public void setAddressLine1(String value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of addressLine1
	 */
	public String getAddressLine1(){
		return super.getStringValue(10);
	}

	/**
	 * set value for addressLine2
	 * @param value to be assigned to addressLine2
	 */
	public void setAddressLine2(String value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of addressLine2
	 */
	public String getAddressLine2(){
		return super.getStringValue(11);
	}

	/**
	 * set value for city
	 * @param value to be assigned to city
	 */
	public void setCity(String value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of city
	 */
	public String getCity(){
		return super.getStringValue(12);
	}

	/**
	 * set value for state
	 * @param value to be assigned to state
	 */
	public void setState(String value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of state
	 */
	public String getState(){
		return super.getStringValue(13);
	}

	/**
	 * set value for pincode
	 * @param value to be assigned to pincode
	 */
	public void setPincode(String value){
		this.fieldValues[14] = value;
	}

	/**
	 * @return value of pincode
	 */
	public String getPincode(){
		return super.getStringValue(14);
	}

	/**
	 * set value for country
	 * @param value to be assigned to country
	 */
	public void setCountry(long value){
		this.fieldValues[15] = value;
	}

	/**
	 * @return value of country
	 */
	public long getCountry(){
		return super.getLongValue(15);
	}

	/**
	 * set value for phoneNumber
	 * @param value to be assigned to phoneNumber
	 */
	public void setPhoneNumber(String value){
		this.fieldValues[16] = value;
	}

	/**
	 * @return value of phoneNumber
	 */
	public String getPhoneNumber(){
		return super.getStringValue(16);
	}

	/**
	 * set value for email
	 * @param value to be assigned to email
	 */
	public void setEmail(String value){
		this.fieldValues[17] = value;
	}

	/**
	 * @return value of email
	 */
	public String getEmail(){
		return super.getStringValue(17);
	}

	/**
	 * set value for gender
	 * @param value to be assigned to gender
	 */
	public void setGender(String value){
		this.fieldValues[18] = value;
	}

	/**
	 * @return value of gender
	 */
	public String getGender(){
		return super.getStringValue(18);
	}

	/**
	 * set value for dateOfBirth
	 * @param value to be assigned to dateOfBirth
	 */
	public void setDateOfBirth(LocalDate value){
		this.fieldValues[19] = value;
	}

	/**
	 * @return value of dateOfBirth
	 */
	public LocalDate getDateOfBirth(){
		return super.getDateValue(19);
	}

	/**
	 * set value for dateOfJoining
	 * @param value to be assigned to dateOfJoining
	 */
	public void setDateOfJoining(LocalDate value){
		this.fieldValues[20] = value;
	}

	/**
	 * @return value of dateOfJoining
	 */
	public LocalDate getDateOfJoining(){
		return super.getDateValue(20);
	}

	/**
	 * set value for dateOfLeaving
	 * @param value to be assigned to dateOfLeaving
	 */
	public void setDateOfLeaving(LocalDate value){
		this.fieldValues[21] = value;
	}

	/**
	 * @return value of dateOfLeaving
	 */
	public LocalDate getDateOfLeaving(){
		return super.getDateValue(21);
	}

	/**
	 * set value for reasonForLeaving
	 * @param value to be assigned to reasonForLeaving
	 */
	public void setReasonForLeaving(String value){
		this.fieldValues[22] = value;
	}

	/**
	 * @return value of reasonForLeaving
	 */
	public String getReasonForLeaving(){
		return super.getStringValue(22);
	}

	/**
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[23] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(23);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[24] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(24);
	}
}
