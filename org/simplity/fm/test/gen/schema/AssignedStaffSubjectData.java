package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of assignedStaffSubject
 */ 
public class AssignedStaffSubjectData extends SchemaData {

	protected AssignedStaffSubjectData(final AssignedStaffSubjectSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected AssignedStaffSubjectData newInstance(final Object[] arr) {
		return new AssignedStaffSubjectData((AssignedStaffSubjectSchema) this.schema, arr);
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of offeredSubjectId
	 */
	public long getOfferedSubjectId(){
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
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for subjectId
	 * @param value to be assigned to subjectId
	 */
	public void setSubjectId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of subjectId
	 */
	public long getSubjectId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for seasonId
	 * @param value to be assigned to seasonId
	 */
	public void setSeasonId(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of seasonId
	 */
	public long getSeasonId(){
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
