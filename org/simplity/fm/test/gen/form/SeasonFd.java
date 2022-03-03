package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SeasonData;
/** class for form data season  */
public class SeasonFd extends FormData {
	public SeasonFd(final SeasonForm form, final SeasonData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public SeasonData getSchemaData() {
		return (SeasonData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(SeasonData data) {
		this.dataObject = data;
	}
}
