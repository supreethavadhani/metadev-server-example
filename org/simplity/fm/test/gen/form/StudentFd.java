package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StudentData;
/** class for form data student  */
public class StudentFd extends FormData {
	public StudentFd(final StudentForm form, final StudentData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public StudentData getSchemaData() {
		return (StudentData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(StudentData data) {
		this.dataObject = data;
	}

	/** get form table for this linked form Guardian **/
	public GuardianFdt getGuardianFdt() {
		return (GuardianFdt)this.linkedData[0];
	}

	/** set form table for this linked form Guardian **/
	public void setGuardianFdt(GuardianFdt fdt) {
		 this.linkedData[0] = (GuardianFdt) fdt;
	}
}
