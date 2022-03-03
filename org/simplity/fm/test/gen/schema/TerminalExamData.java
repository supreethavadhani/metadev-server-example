package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of terminalExam
 */ 
public class TerminalExamData extends SchemaData {

	protected TerminalExamData(final TerminalExamSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected TerminalExamData newInstance(final Object[] arr) {
		return new TerminalExamData((TerminalExamSchema) this.schema, arr);
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of offeredSubjectId
	 */
	public long getOfferedSubjectId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for isMakeup
	 * @param value to be assigned to isMakeup
	 */
	public void setIsMakeup(boolean value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of isMakeup
	 */
	public boolean getIsMakeup(){
		return super.getBoolValue(1);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for examDate
	 * @param value to be assigned to examDate
	 */
	public void setExamDate(LocalDate value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of examDate
	 */
	public LocalDate getExamDate(){
		return super.getDateValue(3);
	}
}
