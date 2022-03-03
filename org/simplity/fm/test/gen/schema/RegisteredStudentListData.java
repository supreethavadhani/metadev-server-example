package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of registeredStudentList
 */ 
public class RegisteredStudentListData extends SchemaData {

	protected RegisteredStudentListData(final RegisteredStudentListSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected RegisteredStudentListData newInstance(final Object[] arr) {
		return new RegisteredStudentListData((RegisteredStudentListSchema) this.schema, arr);
	}

	/**
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of subjectRegisterId
	 */
	public long getSubjectRegisterId(){
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
}
