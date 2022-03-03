package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.SchemaData;
import java.time.LocalDate;
import java.time.Instant;
/** class for form data login  */
public class LoginFd extends FormData {
	public LoginFd(final LoginForm form, final SchemaData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	/**
	 * set value for userName
	 * @param value to be assigned to userName
	 */
	public void setUserName(String value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of userName
	 */
	public String getUserName(){
		return super.getStringValue(0);
	}

	/**
	 * set value for password
	 * @param value to be assigned to password
	 */
	public void setPassword(String value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of password
	 */
	public String getPassword(){
		return super.getStringValue(1);
	}
}
