package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of subjectList
 */ 
public class SubjectListData extends SchemaData {

	protected SubjectListData(final SubjectListSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected SubjectListData newInstance(final Object[] arr) {
		return new SubjectListData((SubjectListSchema) this.schema, arr);
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
	 * set value for department
	 * @param value to be assigned to department
	 */
	public void setDepartment(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of department
	 */
	public String getDepartment(){
		return super.getStringValue(4);
	}

	/**
	 * set value for lectureCredits
	 * @param value to be assigned to lectureCredits
	 */
	public void setLectureCredits(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of lectureCredits
	 */
	public long getLectureCredits(){
		return super.getLongValue(5);
	}

	/**
	 * set value for practicalCredits
	 * @param value to be assigned to practicalCredits
	 */
	public void setPracticalCredits(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of practicalCredits
	 */
	public long getPracticalCredits(){
		return super.getLongValue(6);
	}

	/**
	 * set value for tutorialCredits
	 * @param value to be assigned to tutorialCredits
	 */
	public void setTutorialCredits(long value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of tutorialCredits
	 */
	public long getTutorialCredits(){
		return super.getLongValue(7);
	}

	/**
	 * set value for totalCredits
	 * @param value to be assigned to totalCredits
	 */
	public void setTotalCredits(long value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of totalCredits
	 */
	public long getTotalCredits(){
		return super.getLongValue(8);
	}

	/**
	 * set value for isActive
	 * @param value to be assigned to isActive
	 */
	public void setIsActive(boolean value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of isActive
	 */
	public boolean getIsActive(){
		return super.getBoolValue(9);
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
}
