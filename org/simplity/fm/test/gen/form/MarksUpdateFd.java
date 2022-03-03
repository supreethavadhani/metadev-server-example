package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.MarksUpdateData;
/** class for form data marksUpdate  */
public class MarksUpdateFd extends FormData {
	public MarksUpdateFd(final MarksUpdateForm form, final MarksUpdateData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public MarksUpdateData getSchemaData() {
		return (MarksUpdateData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(MarksUpdateData data) {
		this.dataObject = data;
	}
}
