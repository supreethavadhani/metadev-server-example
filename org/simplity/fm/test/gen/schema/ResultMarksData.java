package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of resultMarks
 */ 
public class ResultMarksData extends SchemaData {

	protected ResultMarksData(final ResultMarksSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected ResultMarksData newInstance(final Object[] arr) {
		return new ResultMarksData((ResultMarksSchema) this.schema, arr);
	}

	/**
	 * set value for resultMarksId
	 * @param value to be assigned to resultMarksId
	 */
	public void setResultMarksId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of resultMarksId
	 */
	public long getResultMarksId(){
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
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of subjectRegisterId
	 */
	public long getSubjectRegisterId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for subjectResultId
	 * @param value to be assigned to subjectResultId
	 */
	public void setSubjectResultId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of subjectResultId
	 */
	public long getSubjectResultId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for userId
	 * @param value to be assigned to userId
	 */
	public void setUserId(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of userId
	 */
	public long getUserId(){
		return super.getLongValue(4);
	}

	/**
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(5);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(6);
	}
}
