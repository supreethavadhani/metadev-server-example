package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of assessmentItem
 */ 
public class AssessmentItemData extends SchemaData {

	protected AssessmentItemData(final AssessmentItemSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected AssessmentItemData newInstance(final Object[] arr) {
		return new AssessmentItemData((AssessmentItemSchema) this.schema, arr);
	}

	/**
	 * set value for assessmentSchemeId
	 * @param value to be assigned to assessmentSchemeId
	 */
	public void setAssessmentSchemeId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of assessmentSchemeId
	 */
	public long getAssessmentSchemeId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for seqNo
	 * @param value to be assigned to seqNo
	 */
	public void setSeqNo(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of seqNo
	 */
	public long getSeqNo(){
		return super.getLongValue(1);
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
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(3);
	}

	/**
	 * set value for maxMarks
	 * @param value to be assigned to maxMarks
	 */
	public void setMaxMarks(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of maxMarks
	 */
	public long getMaxMarks(){
		return super.getLongValue(4);
	}
}
