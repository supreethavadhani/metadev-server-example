package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.InstituteData;
/** class for form data institute  */
public class InstituteFd extends FormData {
	public InstituteFd(final InstituteForm form, final InstituteData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public InstituteData getSchemaData() {
		return (InstituteData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(InstituteData data) {
		this.dataObject = data;
	}
}
