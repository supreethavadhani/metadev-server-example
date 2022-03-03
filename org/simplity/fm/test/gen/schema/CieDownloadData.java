package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of cieDownload
 */ 
public class CieDownloadData extends SchemaData {

	protected CieDownloadData(final CieDownloadSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected CieDownloadData newInstance(final Object[] arr) {
		return new CieDownloadData((CieDownloadSchema) this.schema, arr);
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
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of offeredSubjectId
	 */
	public long getOfferedSubjectId(){
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
	 * set value for levelName
	 * @param value to be assigned to levelName
	 */
	public void setLevelName(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of levelName
	 */
	public String getLevelName(){
		return super.getStringValue(3);
	}

	/**
	 * set value for subjectName
	 * @param value to be assigned to subjectName
	 */
	public void setSubjectName(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of subjectName
	 */
	public String getSubjectName(){
		return super.getStringValue(4);
	}

	/**
	 * set value for subjectCode
	 * @param value to be assigned to subjectCode
	 */
	public void setSubjectCode(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of subjectCode
	 */
	public String getSubjectCode(){
		return super.getStringValue(5);
	}

	/**
	 * set value for sectionName
	 * @param value to be assigned to sectionName
	 */
	public void setSectionName(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of sectionName
	 */
	public String getSectionName(){
		return super.getStringValue(6);
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
	 * set value for date
	 * @param value to be assigned to date
	 */
	public void setDate(LocalDate value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of date
	 */
	public LocalDate getDate(){
		return super.getDateValue(8);
	}

	/**
	 * set value for finalExam
	 * @param value to be assigned to finalExam
	 */
	public void setFinalExam(LocalDate value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of finalExam
	 */
	public LocalDate getFinalExam(){
		return super.getDateValue(9);
	}

	/**
	 * set value for assignedStaff
	 * @param value to be assigned to assignedStaff
	 */
	public void setAssignedStaff(String value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of assignedStaff
	 */
	public String getAssignedStaff(){
		return super.getStringValue(10);
	}
}
