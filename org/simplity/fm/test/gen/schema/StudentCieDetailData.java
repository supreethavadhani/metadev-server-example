package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of studentCieDetail
 */ 
public class StudentCieDetailData extends SchemaData {

	protected StudentCieDetailData(final StudentCieDetailSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected StudentCieDetailData newInstance(final Object[] arr) {
		return new StudentCieDetailData((StudentCieDetailSchema) this.schema, arr);
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
	 * set value for subjectSectionId
	 * @param value to be assigned to subjectSectionId
	 */
	public void setSubjectSectionId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of subjectSectionId
	 */
	public long getSubjectSectionId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for departmentName
	 * @param value to be assigned to departmentName
	 */
	public void setDepartmentName(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of departmentName
	 */
	public String getDepartmentName(){
		return super.getStringValue(2);
	}

	/**
	 * set value for usn
	 * @param value to be assigned to usn
	 */
	public void setUsn(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of usn
	 */
	public String getUsn(){
		return super.getStringValue(3);
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
	 * set value for eligibility
	 * @param value to be assigned to eligibility
	 */
	public void setEligibility(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of eligibility
	 */
	public String getEligibility(){
		return super.getStringValue(5);
	}

	/**
	 * set value for test1
	 * @param value to be assigned to test1
	 */
	public void setTest1(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of test1
	 */
	public String getTest1(){
		return super.getStringValue(6);
	}

	/**
	 * set value for test2
	 * @param value to be assigned to test2
	 */
	public void setTest2(String value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of test2
	 */
	public String getTest2(){
		return super.getStringValue(7);
	}

	/**
	 * set value for test3
	 * @param value to be assigned to test3
	 */
	public void setTest3(String value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of test3
	 */
	public String getTest3(){
		return super.getStringValue(8);
	}

	/**
	 * set value for quiz1
	 * @param value to be assigned to quiz1
	 */
	public void setQuiz1(String value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of quiz1
	 */
	public String getQuiz1(){
		return super.getStringValue(9);
	}

	/**
	 * set value for quiz2
	 * @param value to be assigned to quiz2
	 */
	public void setQuiz2(String value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of quiz2
	 */
	public String getQuiz2(){
		return super.getStringValue(10);
	}

	/**
	 * set value for theoryCie
	 * @param value to be assigned to theoryCie
	 */
	public void setTheoryCie(String value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of theoryCie
	 */
	public String getTheoryCie(){
		return super.getStringValue(11);
	}

	/**
	 * set value for theoryClassesHeld
	 * @param value to be assigned to theoryClassesHeld
	 */
	public void setTheoryClassesHeld(String value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of theoryClassesHeld
	 */
	public String getTheoryClassesHeld(){
		return super.getStringValue(12);
	}

	/**
	 * set value for theoryClassesAttended
	 * @param value to be assigned to theoryClassesAttended
	 */
	public void setTheoryClassesAttended(String value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of theoryClassesAttended
	 */
	public String getTheoryClassesAttended(){
		return super.getStringValue(13);
	}

	/**
	 * set value for theoryClassesPercentage
	 * @param value to be assigned to theoryClassesPercentage
	 */
	public void setTheoryClassesPercentage(String value){
		this.fieldValues[14] = value;
	}

	/**
	 * @return value of theoryClassesPercentage
	 */
	public String getTheoryClassesPercentage(){
		return super.getStringValue(14);
	}

	/**
	 * set value for practicalCie
	 * @param value to be assigned to practicalCie
	 */
	public void setPracticalCie(String value){
		this.fieldValues[15] = value;
	}

	/**
	 * @return value of practicalCie
	 */
	public String getPracticalCie(){
		return super.getStringValue(15);
	}

	/**
	 * set value for practicalClassesHeld
	 * @param value to be assigned to practicalClassesHeld
	 */
	public void setPracticalClassesHeld(String value){
		this.fieldValues[16] = value;
	}

	/**
	 * @return value of practicalClassesHeld
	 */
	public String getPracticalClassesHeld(){
		return super.getStringValue(16);
	}

	/**
	 * set value for practicalClassesAttended
	 * @param value to be assigned to practicalClassesAttended
	 */
	public void setPracticalClassesAttended(String value){
		this.fieldValues[17] = value;
	}

	/**
	 * @return value of practicalClassesAttended
	 */
	public String getPracticalClassesAttended(){
		return super.getStringValue(17);
	}

	/**
	 * set value for practicalClassesPercentage
	 * @param value to be assigned to practicalClassesPercentage
	 */
	public void setPracticalClassesPercentage(String value){
		this.fieldValues[18] = value;
	}

	/**
	 * @return value of practicalClassesPercentage
	 */
	public String getPracticalClassesPercentage(){
		return super.getStringValue(18);
	}

	/**
	 * set value for selfStudy
	 * @param value to be assigned to selfStudy
	 */
	public void setSelfStudy(String value){
		this.fieldValues[19] = value;
	}

	/**
	 * @return value of selfStudy
	 */
	public String getSelfStudy(){
		return super.getStringValue(19);
	}

	/**
	 * set value for practicalMarks
	 * @param value to be assigned to practicalMarks
	 */
	public void setPracticalMarks(String value){
		this.fieldValues[20] = value;
	}

	/**
	 * @return value of practicalMarks
	 */
	public String getPracticalMarks(){
		return super.getStringValue(20);
	}

	/**
	 * set value for totalCie
	 * @param value to be assigned to totalCie
	 */
	public void setTotalCie(String value){
		this.fieldValues[21] = value;
	}

	/**
	 * @return value of totalCie
	 */
	public String getTotalCie(){
		return super.getStringValue(21);
	}
}
