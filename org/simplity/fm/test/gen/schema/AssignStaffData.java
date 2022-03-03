package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of assignStaff
 */ 
public class AssignStaffData extends SchemaData {

	protected AssignStaffData(final AssignStaffSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected AssignStaffData newInstance(final Object[] arr) {
		return new AssignStaffData((AssignStaffSchema) this.schema, arr);
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
	 * set value for subjectSectionId
	 * @param value to be assigned to subjectSectionId
	 */
	public void setSubjectSectionId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of subjectSectionId
	 */
	public long getSubjectSectionId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for staffName
	 * @param value to be assigned to staffName
	 */
	public void setStaffName(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of staffName
	 */
	public String getStaffName(){
		return super.getStringValue(2);
	}

	/**
	 * set value for staffId
	 * @param value to be assigned to staffId
	 */
	public void setStaffId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of staffId
	 */
	public long getStaffId(){
		return super.getLongValue(3);
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

	/**
	 * set value for departmentName
	 * @param value to be assigned to departmentName
	 */
	public void setDepartmentName(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of departmentName
	 */
	public String getDepartmentName(){
		return super.getStringValue(5);
	}

	/**
	 * set value for isAssigned
	 * @param value to be assigned to isAssigned
	 */
	public void setIsAssigned(boolean value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of isAssigned
	 */
	public boolean getIsAssigned(){
		return super.getBoolValue(6);
	}
}
