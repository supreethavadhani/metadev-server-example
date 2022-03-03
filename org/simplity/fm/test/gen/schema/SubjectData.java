package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of subject
 */ 
public class SubjectData extends SchemaData {

	protected SubjectData(final SubjectSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected SubjectData newInstance(final Object[] arr) {
		return new SubjectData((SubjectSchema) this.schema, arr);
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
	 * set value for departmentId
	 * @param value to be assigned to departmentId
	 */
	public void setDepartmentId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of departmentId
	 */
	public long getDepartmentId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for subjectTypeId
	 * @param value to be assigned to subjectTypeId
	 */
	public void setSubjectTypeId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of subjectTypeId
	 */
	public long getSubjectTypeId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(4);
	}

	/**
	 * set value for code
	 * @param value to be assigned to code
	 */
	public void setCode(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of code
	 */
	public String getCode(){
		return super.getStringValue(5);
	}

	/**
	 * set value for lectureCredits
	 * @param value to be assigned to lectureCredits
	 */
	public void setLectureCredits(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of lectureCredits
	 */
	public long getLectureCredits(){
		return super.getLongValue(6);
	}

	/**
	 * set value for practicalCredits
	 * @param value to be assigned to practicalCredits
	 */
	public void setPracticalCredits(long value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of practicalCredits
	 */
	public long getPracticalCredits(){
		return super.getLongValue(7);
	}

	/**
	 * set value for tutorialCredits
	 * @param value to be assigned to tutorialCredits
	 */
	public void setTutorialCredits(long value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of tutorialCredits
	 */
	public long getTutorialCredits(){
		return super.getLongValue(8);
	}

	/**
	 * set value for totalCredits
	 * @param value to be assigned to totalCredits
	 */
	public void setTotalCredits(long value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of totalCredits
	 */
	public long getTotalCredits(){
		return super.getLongValue(9);
	}

	/**
	 * set value for parentId
	 * @param value to be assigned to parentId
	 */
	public void setParentId(long value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of parentId
	 */
	public long getParentId(){
		return super.getLongValue(10);
	}

	/**
	 * set value for isElective
	 * @param value to be assigned to isElective
	 */
	public void setIsElective(boolean value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of isElective
	 */
	public boolean getIsElective(){
		return super.getBoolValue(11);
	}

	/**
	 * set value for isIntegrated
	 * @param value to be assigned to isIntegrated
	 */
	public void setIsIntegrated(boolean value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of isIntegrated
	 */
	public boolean getIsIntegrated(){
		return super.getBoolValue(12);
	}

	/**
	 * set value for packetPrefix
	 * @param value to be assigned to packetPrefix
	 */
	public void setPacketPrefix(String value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of packetPrefix
	 */
	public String getPacketPrefix(){
		return super.getStringValue(13);
	}

	/**
	 * set value for isActive
	 * @param value to be assigned to isActive
	 */
	public void setIsActive(boolean value){
		this.fieldValues[14] = value;
	}

	/**
	 * @return value of isActive
	 */
	public boolean getIsActive(){
		return super.getBoolValue(14);
	}

	/**
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[15] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(15);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[16] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(16);
	}
}
