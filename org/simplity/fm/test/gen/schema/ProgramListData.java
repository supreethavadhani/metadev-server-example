package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of programList
 */ 
public class ProgramListData extends SchemaData {

	protected ProgramListData(final ProgramListSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected ProgramListData newInstance(final Object[] arr) {
		return new ProgramListData((ProgramListSchema) this.schema, arr);
	}

	/**
	 * set value for programId
	 * @param value to be assigned to programId
	 */
	public void setProgramId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of programId
	 */
	public long getProgramId(){
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
	 * set value for programName
	 * @param value to be assigned to programName
	 */
	public void setProgramName(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of programName
	 */
	public String getProgramName(){
		return super.getStringValue(3);
	}

	/**
	 * set value for programCode
	 * @param value to be assigned to programCode
	 */
	public void setProgramCode(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of programCode
	 */
	public String getProgramCode(){
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
	 * set value for departmentCode
	 * @param value to be assigned to departmentCode
	 */
	public void setDepartmentCode(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of departmentCode
	 */
	public String getDepartmentCode(){
		return super.getStringValue(6);
	}
}
