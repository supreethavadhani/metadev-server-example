package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.GuardianData;
/** class for form data guardian  */
public class GuardianFd extends FormData {
	public GuardianFd(final GuardianForm form, final GuardianData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public GuardianData getSchemaData() {
		return (GuardianData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(GuardianData data) {
		this.dataObject = data;
	}
}
