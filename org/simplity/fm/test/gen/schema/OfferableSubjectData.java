package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of offerableSubject
 */ 
public class OfferableSubjectData extends SchemaData {

	protected OfferableSubjectData(final OfferableSubjectSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected OfferableSubjectData newInstance(final Object[] arr) {
		return new OfferableSubjectData((OfferableSubjectSchema) this.schema, arr);
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

	/**
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(2);
	}

	/**
	 * set value for code
	 * @param value to be assigned to code
	 */
	public void setCode(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of code
	 */
	public String getCode(){
		return super.getStringValue(3);
	}

	/**
	 * set value for departmentName
	 * @param value to be assigned to departmentName
	 */
	public void setDepartmentName(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of departmentName
	 */
	public String getDepartmentName(){
		return super.getStringValue(4);
	}

	/**
	 * set value for offeredSections
	 * @param value to be assigned to offeredSections
	 */
	public void setOfferedSections(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of offeredSections
	 */
	public String getOfferedSections(){
		return super.getStringValue(5);
	}
}
