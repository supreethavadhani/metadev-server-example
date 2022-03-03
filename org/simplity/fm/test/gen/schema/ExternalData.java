package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of external
 */ 
public class ExternalData extends SchemaData {

	protected ExternalData(final ExternalSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected ExternalData newInstance(final Object[] arr) {
		return new ExternalData((ExternalSchema) this.schema, arr);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for externalId
	 * @param value to be assigned to externalId
	 */
	public void setExternalId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of externalId
	 */
	public long getExternalId(){
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
	 * set value for collegeName
	 * @param value to be assigned to collegeName
	 */
	public void setCollegeName(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of collegeName
	 */
	public String getCollegeName(){
		return super.getStringValue(3);
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
	 * set value for phoneNumber
	 * @param value to be assigned to phoneNumber
	 */
	public void setPhoneNumber(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of phoneNumber
	 */
	public String getPhoneNumber(){
		return super.getStringValue(5);
	}

	/**
	 * set value for email
	 * @param value to be assigned to email
	 */
	public void setEmail(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of email
	 */
	public String getEmail(){
		return super.getStringValue(6);
	}

	/**
	 * set value for isActive
	 * @param value to be assigned to isActive
	 */
	public void setIsActive(boolean value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of isActive
	 */
	public boolean getIsActive(){
		return super.getBoolValue(7);
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
