package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of assignedStaffName
 */ 
public class AssignedStaffNameData extends SchemaData {

	protected AssignedStaffNameData(final AssignedStaffNameSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected AssignedStaffNameData newInstance(final Object[] arr) {
		return new AssignedStaffNameData((AssignedStaffNameSchema) this.schema, arr);
	}

	/**
	 * set value for subjectSectionId
	 * @param value to be assigned to subjectSectionId
	 */
	public void setSubjectSectionId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of subjectSectionId
	 */
	public long getSubjectSectionId(){
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
	 * set value for email
	 * @param value to be assigned to email
	 */
	public void setEmail(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of email
	 */
	public String getEmail(){
		return super.getStringValue(3);
	}
}
