package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailData;
/** class for form data registerStudent  */
public class RegisterStudentFd extends FormData {
	public RegisterStudentFd(final RegisterStudentForm form, final SubjectSectionDetailData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public SubjectSectionDetailData getSchemaData() {
		return (SubjectSectionDetailData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(SubjectSectionDetailData data) {
		this.dataObject = data;
	}

	/** get form table for this linked form RegisterableStudent **/
	public RegisterableStudentFdt getRegisterableStudentFdt() {
		return (RegisterableStudentFdt)this.linkedData[0];
	}

	/** set form table for this linked form RegisterableStudent **/
	public void setRegisterableStudentFdt(RegisterableStudentFdt fdt) {
		 this.linkedData[0] = (RegisterableStudentFdt) fdt;
	}
}
