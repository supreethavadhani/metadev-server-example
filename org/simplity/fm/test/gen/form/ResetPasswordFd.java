package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.SchemaData;
import java.time.LocalDate;
import java.time.Instant;
/** class for form data resetPassword  */
public class ResetPasswordFd extends FormData {
	public ResetPasswordFd(final ResetPasswordForm form, final SchemaData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	/**
	 * set value for currentPassword
	 * @param value to be assigned to currentPassword
	 */
	public void setCurrentPassword(String value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of currentPassword
	 */
	public String getCurrentPassword(){
		return super.getStringValue(0);
	}

	/**
	 * set value for newPassword
	 * @param value to be assigned to newPassword
	 */
	public void setNewPassword(String value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of newPassword
	 */
	public String getNewPassword(){
		return super.getStringValue(1);
	}

	/**
	 * set value for confirmPassword
	 * @param value to be assigned to confirmPassword
	 */
	public void setConfirmPassword(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of confirmPassword
	 */
	public String getConfirmPassword(){
		return super.getStringValue(2);
	}
}
