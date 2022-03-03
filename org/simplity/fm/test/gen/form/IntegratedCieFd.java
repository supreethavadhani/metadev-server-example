package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.IntegratedCieData;
/** class for form data integratedCie  */
public class IntegratedCieFd extends FormData {
	public IntegratedCieFd(final IntegratedCieForm form, final IntegratedCieData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public IntegratedCieData getSchemaData() {
		return (IntegratedCieData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(IntegratedCieData data) {
		this.dataObject = data;
	}
}
