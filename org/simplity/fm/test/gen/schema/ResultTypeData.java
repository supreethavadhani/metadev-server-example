package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of resultType
 */ 
public class ResultTypeData extends SchemaData {

	protected ResultTypeData(final ResultTypeSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected ResultTypeData newInstance(final Object[] arr) {
		return new ResultTypeData((ResultTypeSchema) this.schema, arr);
	}

	/**
	 * set value for resultTypeId
	 * @param value to be assigned to resultTypeId
	 */
	public void setResultTypeId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of resultTypeId
	 */
	public long getResultTypeId(){
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
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(2);
	}

	/**
	 * set value for code
	 * @param value to be assigned to code
	 */
	public void setCode(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of code
	 */
	public String getCode(){
		return super.getStringValue(3);
	}

	/**
	 * set value for maxMarks
	 * @param value to be assigned to maxMarks
	 */
	public void setMaxMarks(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of maxMarks
	 */
	public long getMaxMarks(){
		return super.getLongValue(4);
	}

	/**
	 * set value for requiresOtherResults
	 * @param value to be assigned to requiresOtherResults
	 */
	public void setRequiresOtherResults(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of requiresOtherResults
	 */
	public String getRequiresOtherResults(){
		return super.getStringValue(5);
	}

	/**
	 * set value for eligibilityMeasure
	 * @param value to be assigned to eligibilityMeasure
	 */
	public void setEligibilityMeasure(boolean value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of eligibilityMeasure
	 */
	public boolean getEligibilityMeasure(){
		return super.getBoolValue(6);
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
