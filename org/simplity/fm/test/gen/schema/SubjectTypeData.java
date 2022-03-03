package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of subjectType
 */ 
public class SubjectTypeData extends SchemaData {

	protected SubjectTypeData(final SubjectTypeSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected SubjectTypeData newInstance(final Object[] arr) {
		return new SubjectTypeData((SubjectTypeSchema) this.schema, arr);
	}

	/**
	 * set value for subjectTypeId
	 * @param value to be assigned to subjectTypeId
	 */
	public void setSubjectTypeId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of subjectTypeId
	 */
	public long getSubjectTypeId(){
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
	 * set value for isIntegrated
	 * @param value to be assigned to isIntegrated
	 */
	public void setIsIntegrated(boolean value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of isIntegrated
	 */
	public boolean getIsIntegrated(){
		return super.getBoolValue(3);
	}

	/**
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(4);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(5);
	}
}
