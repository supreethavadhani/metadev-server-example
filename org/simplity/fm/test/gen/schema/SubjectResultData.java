package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of subjectResult
 */ 
public class SubjectResultData extends SchemaData {

	protected SubjectResultData(final SubjectResultSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected SubjectResultData newInstance(final Object[] arr) {
		return new SubjectResultData((SubjectResultSchema) this.schema, arr);
	}

	/**
	 * set value for subjectResultId
	 * @param value to be assigned to subjectResultId
	 */
	public void setSubjectResultId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of subjectResultId
	 */
	public long getSubjectResultId(){
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
	 * set value for subjectId
	 * @param value to be assigned to subjectId
	 */
	public void setSubjectId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of subjectId
	 */
	public long getSubjectId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for resultTypeId
	 * @param value to be assigned to resultTypeId
	 */
	public void setResultTypeId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of resultTypeId
	 */
	public long getResultTypeId(){
		return super.getLongValue(3);
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
