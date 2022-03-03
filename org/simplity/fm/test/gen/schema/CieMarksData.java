package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of cieMarks
 */ 
public class CieMarksData extends SchemaData {

	protected CieMarksData(final CieMarksSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected CieMarksData newInstance(final Object[] arr) {
		return new CieMarksData((CieMarksSchema) this.schema, arr);
	}

	/**
	 * set value for studentAssessmentId
	 * @param value to be assigned to studentAssessmentId
	 */
	public void setStudentAssessmentId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of studentAssessmentId
	 */
	public long getStudentAssessmentId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for assessmentSchemeId
	 * @param value to be assigned to assessmentSchemeId
	 */
	public void setAssessmentSchemeId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of assessmentSchemeId
	 */
	public long getAssessmentSchemeId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for assessmentSeqNo
	 * @param value to be assigned to assessmentSeqNo
	 */
	public void setAssessmentSeqNo(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of assessmentSeqNo
	 */
	public long getAssessmentSeqNo(){
		return super.getLongValue(2);
	}

	/**
	 * set value for marksScored
	 * @param value to be assigned to marksScored
	 */
	public void setMarksScored(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of marksScored
	 */
	public long getMarksScored(){
		return super.getLongValue(3);
	}

	/**
	 * set value for hasAttended
	 * @param value to be assigned to hasAttended
	 */
	public void setHasAttended(boolean value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of hasAttended
	 */
	public boolean getHasAttended(){
		return super.getBoolValue(4);
	}

	/**
	 * set value for marks
	 * @param value to be assigned to marks
	 */
	public void setMarks(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of marks
	 */
	public String getMarks(){
		return super.getStringValue(5);
	}
}
