package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of condoneAttendance
 */ 
public class CondoneAttendanceData extends SchemaData {

	protected CondoneAttendanceData(final CondoneAttendanceSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected CondoneAttendanceData newInstance(final Object[] arr) {
		return new CondoneAttendanceData((CondoneAttendanceSchema) this.schema, arr);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
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
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of studentId
	 */
	public long getStudentId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for studentName
	 * @param value to be assigned to studentName
	 */
	public void setStudentName(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of studentName
	 */
	public String getStudentName(){
		return super.getStringValue(3);
	}

	/**
	 * set value for usn
	 * @param value to be assigned to usn
	 */
	public void setUsn(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of usn
	 */
	public String getUsn(){
		return super.getStringValue(4);
	}

	/**
	 * set value for departmentName
	 * @param value to be assigned to departmentName
	 */
	public void setDepartmentName(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of departmentName
	 */
	public String getDepartmentName(){
		return super.getStringValue(5);
	}

	/**
	 * set value for overallAttendance
	 * @param value to be assigned to overallAttendance
	 */
	public void setOverallAttendance(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of overallAttendance
	 */
	public String getOverallAttendance(){
		return super.getStringValue(6);
	}
}
