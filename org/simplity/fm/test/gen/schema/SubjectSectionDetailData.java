package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of subjectSectionDetail
 */ 
public class SubjectSectionDetailData extends SchemaData {

	protected SubjectSectionDetailData(final SubjectSectionDetailSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected SubjectSectionDetailData newInstance(final Object[] arr) {
		return new SubjectSectionDetailData((SubjectSectionDetailSchema) this.schema, arr);
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
	 * set value for departmentId
	 * @param value to be assigned to departmentId
	 */
	public void setDepartmentId(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of departmentId
	 */
	public long getDepartmentId(){
		return super.getLongValue(5);
	}

	/**
	 * set value for sectionId
	 * @param value to be assigned to sectionId
	 */
	public void setSectionId(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of sectionId
	 */
	public long getSectionId(){
		return super.getLongValue(6);
	}

	/**
	 * set value for subjectName
	 * @param value to be assigned to subjectName
	 */
	public void setSubjectName(String value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of subjectName
	 */
	public String getSubjectName(){
		return super.getStringValue(7);
	}

	/**
	 * set value for sectionName
	 * @param value to be assigned to sectionName
	 */
	public void setSectionName(String value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of sectionName
	 */
	public String getSectionName(){
		return super.getStringValue(8);
	}

	/**
	 * set value for totalClasses
	 * @param value to be assigned to totalClasses
	 */
	public void setTotalClasses(long value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of totalClasses
	 */
	public long getTotalClasses(){
		return super.getLongValue(9);
	}

	/**
	 * set value for attendanceFrozen
	 * @param value to be assigned to attendanceFrozen
	 */
	public void setAttendanceFrozen(boolean value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of attendanceFrozen
	 */
	public boolean getAttendanceFrozen(){
		return super.getBoolValue(10);
	}

	/**
	 * set value for cieFrozen
	 * @param value to be assigned to cieFrozen
	 */
	public void setCieFrozen(boolean value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of cieFrozen
	 */
	public boolean getCieFrozen(){
		return super.getBoolValue(11);
	}

	/**
	 * set value for isOffered
	 * @param value to be assigned to isOffered
	 */
	public void setIsOffered(boolean value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of isOffered
	 */
	public boolean getIsOffered(){
		return super.getBoolValue(12);
	}
}
