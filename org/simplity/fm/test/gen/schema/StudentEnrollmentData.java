package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of studentEnrollment
 */ 
public class StudentEnrollmentData extends SchemaData {

	protected StudentEnrollmentData(final StudentEnrollmentSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected StudentEnrollmentData newInstance(final Object[] arr) {
		return new StudentEnrollmentData((StudentEnrollmentSchema) this.schema, arr);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of studentId
	 */
	public long getStudentId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for seasonId
	 * @param value to be assigned to seasonId
	 */
	public void setSeasonId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of seasonId
	 */
	public long getSeasonId(){
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
	 * set value for programId
	 * @param value to be assigned to programId
	 */
	public void setProgramId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of programId
	 */
	public long getProgramId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for levelSectionId
	 * @param value to be assigned to levelSectionId
	 */
	public void setLevelSectionId(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of levelSectionId
	 */
	public long getLevelSectionId(){
		return super.getLongValue(4);
	}

	/**
	 * set value for hallTicketPrinted
	 * @param value to be assigned to hallTicketPrinted
	 */
	public void setHallTicketPrinted(boolean value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of hallTicketPrinted
	 */
	public boolean getHallTicketPrinted(){
		return super.getBoolValue(5);
	}

	/**
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(6);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(7);
	}
}
