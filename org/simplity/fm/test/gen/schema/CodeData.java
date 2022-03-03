package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of code
 */ 
public class CodeData extends SchemaData {

	protected CodeData(final CodeSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected CodeData newInstance(final Object[] arr) {
		return new CodeData((CodeSchema) this.schema, arr);
	}

	/**
	 * set value for codeId
	 * @param value to be assigned to codeId
	 */
	public void setCodeId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of codeId
	 */
	public long getCodeId(){
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
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of subjectRegisterId
	 */
	public long getSubjectRegisterId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for testNameId
	 * @param value to be assigned to testNameId
	 */
	public void setTestNameId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of testNameId
	 */
	public long getTestNameId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of studentId
	 */
	public long getStudentId(){
		return super.getLongValue(4);
	}

	/**
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(5);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(6);
	}
}
