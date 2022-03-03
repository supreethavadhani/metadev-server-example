package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailData;
import java.time.LocalDate;
import java.time.Instant;
/** class for form data marksEntry  */
public class MarksEntryFd extends FormData {
	public MarksEntryFd(final MarksEntryForm form, final SubjectSectionDetailData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public SubjectSectionDetailData getSchemaData() {
		return (SubjectSectionDetailData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(SubjectSectionDetailData data) {
		this.dataObject = data;
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
	 * set value for assessmentName
	 * @param value to be assigned to assessmentName
	 */
	public void setAssessmentName(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of assessmentName
	 */
	public String getAssessmentName(){
		return super.getStringValue(2);
	}

	/**
	 * set value for maxMarks
	 * @param value to be assigned to maxMarks
	 */
	public void setMaxMarks(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of maxMarks
	 */
	public long getMaxMarks(){
		return super.getLongValue(3);
	}

	/** get form table for this linked form MarksForAssessment **/
	public MarksForAssessmentFdt getMarksForAssessmentFdt() {
		return (MarksForAssessmentFdt)this.linkedData[0];
	}

	/** set form table for this linked form MarksForAssessment **/
	public void setMarksForAssessmentFdt(MarksForAssessmentFdt fdt) {
		 this.linkedData[0] = (MarksForAssessmentFdt) fdt;
	}
}
