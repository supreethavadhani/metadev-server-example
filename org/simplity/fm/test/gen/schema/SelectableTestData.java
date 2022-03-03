package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of selectableTest
 */ 
public class SelectableTestData extends SchemaData {

	protected SelectableTestData(final SelectableTestSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected SelectableTestData newInstance(final Object[] arr) {
		return new SelectableTestData((SelectableTestSchema) this.schema, arr);
	}

	/**
	 * set value for testTypeId
	 * @param value to be assigned to testTypeId
	 */
	public void setTestTypeId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of testTypeId
	 */
	public long getTestTypeId(){
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
	 * set value for number
	 * @param value to be assigned to number
	 */
	public void setNumber(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of number
	 */
	public long getNumber(){
		return super.getLongValue(5);
	}

	/**
	 * set value for isSelected
	 * @param value to be assigned to isSelected
	 */
	public void setIsSelected(boolean value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of isSelected
	 */
	public boolean getIsSelected(){
		return super.getBoolValue(6);
	}

	/**
	 * set value for OkToUnselect
	 * @param value to be assigned to OkToUnselect
	 */
	public void setOkToUnselect(boolean value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of OkToUnselect
	 */
	public boolean getOkToUnselect(){
		return super.getBoolValue(7);
	}
}
