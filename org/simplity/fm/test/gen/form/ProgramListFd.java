package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ProgramListData;
/** class for form data programList  */
public class ProgramListFd extends FormData {
	public ProgramListFd(final ProgramListForm form, final ProgramListData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public ProgramListData getSchemaData() {
		return (ProgramListData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(ProgramListData data) {
		this.dataObject = data;
	}
}
