package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.OfferedSubjectListData;
/** class for form data offeredSubjectList  */
public class OfferedSubjectListFd extends FormData {
	public OfferedSubjectListFd(final OfferedSubjectListForm form, final OfferedSubjectListData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public OfferedSubjectListData getSchemaData() {
		return (OfferedSubjectListData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(OfferedSubjectListData data) {
		this.dataObject = data;
	}
}
