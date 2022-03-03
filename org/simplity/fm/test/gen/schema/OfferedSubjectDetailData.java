package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of offeredSubjectDetail
 */ 
public class OfferedSubjectDetailData extends SchemaData {

	protected OfferedSubjectDetailData(final OfferedSubjectDetailSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected OfferedSubjectDetailData newInstance(final Object[] arr) {
		return new OfferedSubjectDetailData((OfferedSubjectDetailSchema) this.schema, arr);
	}

	/**
	 * set value for subjectId
	 * @param value to be assigned to subjectId
	 */
	public void setSubjectId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of subjectId
	 */
	public long getSubjectId(){
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
	 * set value for isIntegrated
	 * @param value to be assigned to isIntegrated
	 */
	public void setIsIntegrated(boolean value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of isIntegrated
	 */
	public boolean getIsIntegrated(){
		return super.getBoolValue(4);
	}

	/**
	 * set value for isChild
	 * @param value to be assigned to isChild
	 */
	public void setIsChild(boolean value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of isChild
	 */
	public boolean getIsChild(){
		return super.getBoolValue(5);
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of offeredSubjectId
	 */
	public long getOfferedSubjectId(){
		return super.getLongValue(6);
	}

	/**
	 * set value for degreeId
	 * @param value to be assigned to degreeId
	 */
	public void setDegreeId(long value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of degreeId
	 */
	public long getDegreeId(){
		return super.getLongValue(7);
	}

	/**
	 * set value for levelId
	 * @param value to be assigned to levelId
	 */
	public void setLevelId(long value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of levelId
	 */
	public long getLevelId(){
		return super.getLongValue(8);
	}

	/**
	 * set value for nbrEnrolled
	 * @param value to be assigned to nbrEnrolled
	 */
	public void setNbrEnrolled(long value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of nbrEnrolled
	 */
	public long getNbrEnrolled(){
		return super.getLongValue(9);
	}

	/**
	 * set value for cieFrozen
	 * @param value to be assigned to cieFrozen
	 */
	public void setCieFrozen(boolean value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of cieFrozen
	 */
	public boolean getCieFrozen(){
		return super.getBoolValue(10);
	}

	/**
	 * set value for attendanceFrozen
	 * @param value to be assigned to attendanceFrozen
	 */
	public void setAttendanceFrozen(boolean value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of attendanceFrozen
	 */
	public boolean getAttendanceFrozen(){
		return super.getBoolValue(11);
	}

	/**
	 * set value for canBeWithdrawn
	 * @param value to be assigned to canBeWithdrawn
	 */
	public void setCanBeWithdrawn(boolean value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of canBeWithdrawn
	 */
	public boolean getCanBeWithdrawn(){
		return super.getBoolValue(12);
	}

	/**
	 * set value for isOffered
	 * @param value to be assigned to isOffered
	 */
	public void setIsOffered(boolean value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of isOffered
	 */
	public boolean getIsOffered(){
		return super.getBoolValue(13);
	}
}
