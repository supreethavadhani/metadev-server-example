package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailData;
import java.time.LocalDate;
import java.time.Instant;
/** class for form data marksForSection  */
public class MarksForSectionFd extends FormData {
	public MarksForSectionFd(final MarksForSectionForm form, final SubjectSectionDetailData dataObject, final Object[] values, final FormDataTable[] data) {
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
	 * set value for isIntegrated
	 * @param value to be assigned to isIntegrated
	 */
	public void setIsIntegrated(boolean value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of isIntegrated
	 */
	public boolean getIsIntegrated(){
		return super.getBoolValue(2);
	}

	/**
	 * set value for freezeAt
	 * @param value to be assigned to freezeAt
	 */
	public void setFreezeAt(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of freezeAt
	 */
	public long getFreezeAt(){
		return super.getLongValue(3);
	}

	/** get form table for this linked form AssessmentItemName **/
	public AssessmentItemNameFdt getAssessmentItemNameFdt() {
		return (AssessmentItemNameFdt)this.linkedData[0];
	}

	/** set form table for this linked form AssessmentItemName **/
	public void setAssessmentItemNameFdt(AssessmentItemNameFdt fdt) {
		 this.linkedData[0] = (AssessmentItemNameFdt) fdt;
	}

	/** get form table for this linked form MarksForStudent **/
	public MarksForStudentFdt getMarksForStudentFdt() {
		return (MarksForStudentFdt)this.linkedData[1];
	}

	/** set form table for this linked form MarksForStudent **/
	public void setMarksForStudentFdt(MarksForStudentFdt fdt) {
		 this.linkedData[1] = (MarksForStudentFdt) fdt;
	}
}
