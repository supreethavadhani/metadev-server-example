package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of season
 */ 
public class SeasonData extends SchemaData {

	protected SeasonData(final SeasonSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected SeasonData newInstance(final Object[] arr) {
		return new SeasonData((SeasonSchema) this.schema, arr);
	}

	/**
	 * set value for seasonId
	 * @param value to be assigned to seasonId
	 */
	public void setSeasonId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of seasonId
	 */
	public long getSeasonId(){
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
	 * set value for courseRegStartDate
	 * @param value to be assigned to courseRegStartDate
	 */
	public void setCourseRegStartDate(LocalDate value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of courseRegStartDate
	 */
	public LocalDate getCourseRegStartDate(){
		return super.getDateValue(4);
	}

	/**
	 * set value for courseRegEndDate
	 * @param value to be assigned to courseRegEndDate
	 */
	public void setCourseRegEndDate(LocalDate value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of courseRegEndDate
	 */
	public LocalDate getCourseRegEndDate(){
		return super.getDateValue(5);
	}

	/**
	 * set value for seasonStartDate
	 * @param value to be assigned to seasonStartDate
	 */
	public void setSeasonStartDate(LocalDate value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of seasonStartDate
	 */
	public LocalDate getSeasonStartDate(){
		return super.getDateValue(6);
	}

	/**
	 * set value for seasonEndDate
	 * @param value to be assigned to seasonEndDate
	 */
	public void setSeasonEndDate(LocalDate value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of seasonEndDate
	 */
	public LocalDate getSeasonEndDate(){
		return super.getDateValue(7);
	}

	/**
	 * set value for attendanceEntryFrozen
	 * @param value to be assigned to attendanceEntryFrozen
	 */
	public void setAttendanceEntryFrozen(boolean value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of attendanceEntryFrozen
	 */
	public boolean getAttendanceEntryFrozen(){
		return super.getBoolValue(8);
	}

	/**
	 * set value for cieEntryFrozen
	 * @param value to be assigned to cieEntryFrozen
	 */
	public void setCieEntryFrozen(boolean value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of cieEntryFrozen
	 */
	public boolean getCieEntryFrozen(){
		return super.getBoolValue(9);
	}

	/**
	 * set value for answerPacketPrefix
	 * @param value to be assigned to answerPacketPrefix
	 */
	public void setAnswerPacketPrefix(String value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of answerPacketPrefix
	 */
	public String getAnswerPacketPrefix(){
		return super.getStringValue(10);
	}

	/**
	 * set value for makeupExamInitiated
	 * @param value to be assigned to makeupExamInitiated
	 */
	public void setMakeupExamInitiated(boolean value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of makeupExamInitiated
	 */
	public boolean getMakeupExamInitiated(){
		return super.getBoolValue(11);
	}

	/**
	 * set value for currentValuationRound
	 * @param value to be assigned to currentValuationRound
	 */
	public void setCurrentValuationRound(long value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of currentValuationRound
	 */
	public long getCurrentValuationRound(){
		return super.getLongValue(12);
	}

	/**
	 * set value for isActive
	 * @param value to be assigned to isActive
	 */
	public void setIsActive(boolean value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of isActive
	 */
	public boolean getIsActive(){
		return super.getBoolValue(13);
	}

	/**
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[14] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(14);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[15] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(15);
	}
}
