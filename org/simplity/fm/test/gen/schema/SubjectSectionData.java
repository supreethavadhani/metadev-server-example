package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of subjectSection
 */ 
public class SubjectSectionData extends SchemaData {

	protected SubjectSectionData(final SubjectSectionSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected SubjectSectionData newInstance(final Object[] arr) {
		return new SubjectSectionData((SubjectSectionSchema) this.schema, arr);
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
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of offeredSubjectId
	 */
	public long getOfferedSubjectId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for sectionId
	 * @param value to be assigned to sectionId
	 */
	public void setSectionId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of sectionId
	 */
	public long getSectionId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for subjectId
	 * @param value to be assigned to subjectId
	 */
	public void setSubjectId(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of subjectId
	 */
	public long getSubjectId(){
		return super.getLongValue(4);
	}

	/**
	 * set value for levelSectionId
	 * @param value to be assigned to levelSectionId
	 */
	public void setLevelSectionId(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of levelSectionId
	 */
	public long getLevelSectionId(){
		return super.getLongValue(5);
	}

	/**
	 * set value for seasonId
	 * @param value to be assigned to seasonId
	 */
	public void setSeasonId(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of seasonId
	 */
	public long getSeasonId(){
		return super.getLongValue(6);
	}

	/**
	 * set value for totalClasses
	 * @param value to be assigned to totalClasses
	 */
	public void setTotalClasses(long value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of totalClasses
	 */
	public long getTotalClasses(){
		return super.getLongValue(7);
	}

	/**
	 * set value for attendanceFrozen
	 * @param value to be assigned to attendanceFrozen
	 */
	public void setAttendanceFrozen(boolean value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of attendanceFrozen
	 */
	public boolean getAttendanceFrozen(){
		return super.getBoolValue(8);
	}

	/**
	 * set value for cieFrozen
	 * @param value to be assigned to cieFrozen
	 */
	public void setCieFrozen(boolean value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of cieFrozen
	 */
	public boolean getCieFrozen(){
		return super.getBoolValue(9);
	}

	/**
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(10);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(11);
	}
}
