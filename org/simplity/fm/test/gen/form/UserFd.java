package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.UserData;
/** class for form data user  */
public class UserFd extends FormData {
	public UserFd(final UserForm form, final UserData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public UserData getSchemaData() {
		return (UserData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(UserData data) {
		this.dataObject = data;
	}
}
