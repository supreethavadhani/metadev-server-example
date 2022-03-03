package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SectionData;
/** class for form data section  */
public class SectionFd extends FormData {
	public SectionFd(final SectionForm form, final SectionData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public SectionData getSchemaData() {
		return (SectionData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(SectionData data) {
		this.dataObject = data;
	}
}
