package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StaffRegistrationData;
import java.time.LocalDate;
import java.time.Instant;
/** class for form data staffRegistration  */
public class StaffRegistrationFd extends FormData {
	public StaffRegistrationFd(final StaffRegistrationForm form, final StaffRegistrationData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public StaffRegistrationData getSchemaData() {
		return (StaffRegistrationData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(StaffRegistrationData data) {
		this.dataObject = data;
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
	 * set value for email
	 * @param value to be assigned to email
	 */
	public void setEmail(String value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of email
	 */
	public String getEmail(){
		return super.getStringValue(1);
	}

	/**
	 * set value for newPassword
	 * @param value to be assigned to newPassword
	 */
	public void setNewPassword(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of newPassword
	 */
	public String getNewPassword(){
		return super.getStringValue(2);
	}

	/**
	 * set value for confirmPassword
	 * @param value to be assigned to confirmPassword
	 */
	public void setConfirmPassword(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of confirmPassword
	 */
	public String getConfirmPassword(){
		return super.getStringValue(3);
	}
}
