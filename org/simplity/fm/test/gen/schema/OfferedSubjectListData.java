package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of offeredSubjectList
 */ 
public class OfferedSubjectListData extends SchemaData {

	protected OfferedSubjectListData(final OfferedSubjectListSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected OfferedSubjectListData newInstance(final Object[] arr) {
		return new OfferedSubjectListData((OfferedSubjectListSchema) this.schema, arr);
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
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(1);
	}
}
