package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ChildSubjectData;
/** class for form data childSubject  */
public class ChildSubjectFd extends FormData {
	public ChildSubjectFd(final ChildSubjectForm form, final ChildSubjectData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public ChildSubjectData getSchemaData() {
		return (ChildSubjectData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(ChildSubjectData data) {
		this.dataObject = data;
	}
}
