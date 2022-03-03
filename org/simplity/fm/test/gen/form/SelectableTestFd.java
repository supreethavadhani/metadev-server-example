package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SelectableTestData;
/** class for form data selectableTest  */
public class SelectableTestFd extends FormData {
	public SelectableTestFd(final SelectableTestForm form, final SelectableTestData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public SelectableTestData getSchemaData() {
		return (SelectableTestData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(SelectableTestData data) {
		this.dataObject = data;
	}
}
