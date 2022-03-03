package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.CieMarksData;
/** class for form data cieMarks  */
public class CieMarksFd extends FormData {
	public CieMarksFd(final CieMarksForm form, final CieMarksData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public CieMarksData getSchemaData() {
		return (CieMarksData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(CieMarksData data) {
		this.dataObject = data;
	}
}
