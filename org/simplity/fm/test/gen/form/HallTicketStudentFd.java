package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.HallTicketStudentData;
/** class for form data hallTicketStudent  */
public class HallTicketStudentFd extends FormData {
	public HallTicketStudentFd(final HallTicketStudentForm form, final HallTicketStudentData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public HallTicketStudentData getSchemaData() {
		return (HallTicketStudentData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(HallTicketStudentData data) {
		this.dataObject = data;
	}

	/** get form table for this linked form HallTicketSubject **/
	public HallTicketSubjectFdt getHallTicketSubjectFdt() {
		return (HallTicketSubjectFdt)this.linkedData[0];
	}

	/** set form table for this linked form HallTicketSubject **/
	public void setHallTicketSubjectFdt(HallTicketSubjectFdt fdt) {
		 this.linkedData[0] = (HallTicketSubjectFdt) fdt;
	}
}
