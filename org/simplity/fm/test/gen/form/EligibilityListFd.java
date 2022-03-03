package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.EligibilityListData;
/** class for form data eligibilityList  */
public class EligibilityListFd extends FormData {
	public EligibilityListFd(final EligibilityListForm form, final EligibilityListData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public EligibilityListData getSchemaData() {
		return (EligibilityListData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(EligibilityListData data) {
		this.dataObject = data;
	}
}
