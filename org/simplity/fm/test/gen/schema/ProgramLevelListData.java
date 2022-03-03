package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of programLevelList
 */ 
public class ProgramLevelListData extends SchemaData {

	protected ProgramLevelListData(final ProgramLevelListSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected ProgramLevelListData newInstance(final Object[] arr) {
		return new ProgramLevelListData((ProgramLevelListSchema) this.schema, arr);
	}

	/**
	 * set value for departmentId
	 * @param value to be assigned to departmentId
	 */
	public void setDepartmentId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of departmentId
	 */
	public long getDepartmentId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for programId
	 * @param value to be assigned to programId
	 */
	public void setProgramId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of programId
	 */
	public long getProgramId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for programLevelId
	 * @param value to be assigned to programLevelId
	 */
	public void setProgramLevelId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of programLevelId
	 */
	public long getProgramLevelId(){
		return super.getLongValue(2);
	}
}
