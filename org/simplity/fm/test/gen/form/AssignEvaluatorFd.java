package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.SchemaData;
import java.time.LocalDate;
import java.time.Instant;
/** class for form data assignEvaluator  */
public class AssignEvaluatorFd extends FormData {
	public AssignEvaluatorFd(final AssignEvaluatorForm form, final SchemaData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
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
	 * set value for departmentId
	 * @param value to be assigned to departmentId
	 */
	public void setDepartmentId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of departmentId
	 */
	public long getDepartmentId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for subjectName
	 * @param value to be assigned to subjectName
	 */
	public void setSubjectName(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of subjectName
	 */
	public String getSubjectName(){
		return super.getStringValue(2);
	}

	/** get form table for this linked form AssignableEvaluator **/
	public AssignableEvaluatorFdt getAssignableEvaluatorFdt() {
		return (AssignableEvaluatorFdt)this.linkedData[0];
	}

	/** set form table for this linked form AssignableEvaluator **/
	public void setAssignableEvaluatorFdt(AssignableEvaluatorFdt fdt) {
		 this.linkedData[0] = (AssignableEvaluatorFdt) fdt;
	}
}
