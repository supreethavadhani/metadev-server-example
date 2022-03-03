package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectListData;
/** class for form data subjectList  */
public class SubjectListFd extends FormData {
	public SubjectListFd(final SubjectListForm form, final SubjectListData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public SubjectListData getSchemaData() {
		return (SubjectListData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(SubjectListData data) {
		this.dataObject = data;
	}
}
