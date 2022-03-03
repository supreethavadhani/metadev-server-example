package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ExternalData;
/** class for form data external  */
public class ExternalFd extends FormData {
	public ExternalFd(final ExternalForm form, final ExternalData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public ExternalData getSchemaData() {
		return (ExternalData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(ExternalData data) {
		this.dataObject = data;
	}
}
