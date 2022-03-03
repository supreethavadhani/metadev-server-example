package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of offeredSubject
 */ 
public class OfferedSubjectData extends SchemaData {

	protected OfferedSubjectData(final OfferedSubjectSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected OfferedSubjectData newInstance(final Object[] arr) {
		return new OfferedSubjectData((OfferedSubjectSchema) this.schema, arr);
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
	 * set value for seasonId
	 * @param value to be assigned to seasonId
	 */
	public void setSeasonId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of seasonId
	 */
	public long getSeasonId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for departmentId
	 * @param value to be assigned to departmentId
	 */
	public void setDepartmentId(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of departmentId
	 */
	public long getDepartmentId(){
		return super.getLongValue(4);
	}

	/**
	 * set value for degreeId
	 * @param value to be assigned to degreeId
	 */
	public void setDegreeId(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of degreeId
	 */
	public long getDegreeId(){
		return super.getLongValue(5);
	}

	/**
	 * set value for levelId
	 * @param value to be assigned to levelId
	 */
	public void setLevelId(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of levelId
	 */
	public long getLevelId(){
		return super.getLongValue(6);
	}

	/**
	 * set value for isIntegrated
	 * @param value to be assigned to isIntegrated
	 */
	public void setIsIntegrated(boolean value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of isIntegrated
	 */
	public boolean getIsIntegrated(){
		return super.getBoolValue(7);
	}

	/**
	 * set value for isChild
	 * @param value to be assigned to isChild
	 */
	public void setIsChild(boolean value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of isChild
	 */
	public boolean getIsChild(){
		return super.getBoolValue(8);
	}

	/**
	 * set value for assessmentSchemeId
	 * @param value to be assigned to assessmentSchemeId
	 */
	public void setAssessmentSchemeId(long value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of assessmentSchemeId
	 */
	public long getAssessmentSchemeId(){
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
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(12);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(13);
	}
}
