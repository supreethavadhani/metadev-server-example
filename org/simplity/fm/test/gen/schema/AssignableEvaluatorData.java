package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of assignableEvaluator
 */ 
public class AssignableEvaluatorData extends SchemaData {

	protected AssignableEvaluatorData(final AssignableEvaluatorSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected AssignableEvaluatorData newInstance(final Object[] arr) {
		return new AssignableEvaluatorData((AssignableEvaluatorSchema) this.schema, arr);
	}

	/**
	 * set value for evaluatorId
	 * @param value to be assigned to evaluatorId
	 */
	public void setEvaluatorId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of evaluatorId
	 */
	public long getEvaluatorId(){
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
	 * set value for isExternal
	 * @param value to be assigned to isExternal
	 */
	public void setIsExternal(boolean value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of isExternal
	 */
	public boolean getIsExternal(){
		return super.getBoolValue(2);
	}

	/**
	 * set value for evaluatorType
	 * @param value to be assigned to evaluatorType
	 */
	public void setEvaluatorType(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of evaluatorType
	 */
	public String getEvaluatorType(){
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
	 * set value for email
	 * @param value to be assigned to email
	 */
	public void setEmail(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of email
	 */
	public String getEmail(){
		return super.getStringValue(5);
	}

	/**
	 * set value for phoneNumber
	 * @param value to be assigned to phoneNumber
	 */
	public void setPhoneNumber(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of phoneNumber
	 */
	public String getPhoneNumber(){
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
	 * set value for isAssigned
	 * @param value to be assigned to isAssigned
	 */
	public void setIsAssigned(boolean value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of isAssigned
	 */
	public boolean getIsAssigned(){
		return super.getBoolValue(8);
	}
}
