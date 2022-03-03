package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ProgramLevelListData;
/** class for form data hallTicketLevel  */
public class HallTicketLevelFd extends FormData {
	public HallTicketLevelFd(final HallTicketLevelForm form, final ProgramLevelListData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public ProgramLevelListData getSchemaData() {
		return (ProgramLevelListData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(ProgramLevelListData data) {
		this.dataObject = data;
	}

	/** get form table for this linked form HallTicketStudent **/
	public HallTicketStudentFdt getHallTicketStudentFdt() {
		return (HallTicketStudentFdt)this.linkedData[0];
	}

	/** set form table for this linked form HallTicketStudent **/
	public void setHallTicketStudentFdt(HallTicketStudentFdt fdt) {
		 this.linkedData[0] = (HallTicketStudentFdt) fdt;
	}
}
