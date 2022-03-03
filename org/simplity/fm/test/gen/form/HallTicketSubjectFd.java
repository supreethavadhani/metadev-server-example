package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.HallTicketSubjectData;
/** class for form data hallTicketSubject  */
public class HallTicketSubjectFd extends FormData {
	public HallTicketSubjectFd(final HallTicketSubjectForm form, final HallTicketSubjectData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public HallTicketSubjectData getSchemaData() {
		return (HallTicketSubjectData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(HallTicketSubjectData data) {
		this.dataObject = data;
	}
}
