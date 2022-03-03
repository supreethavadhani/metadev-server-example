package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of currentOfferedSubject
 */ 
public class CurrentOfferedSubjectData extends SchemaData {

	protected CurrentOfferedSubjectData(final CurrentOfferedSubjectSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected CurrentOfferedSubjectData newInstance(final Object[] arr) {
		return new CurrentOfferedSubjectData((CurrentOfferedSubjectSchema) this.schema, arr);
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
	 * set value for subjectId
	 * @param value to be assigned to subjectId
	 */
	public void setSubjectId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of subjectId
	 */
	public long getSubjectId(){
		return super.getLongValue(1);
	}
}
