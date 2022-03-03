package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailData;
/** class for form data assignStaffToSection  */
public class AssignStaffToSectionFd extends FormData {
	public AssignStaffToSectionFd(final AssignStaffToSectionForm form, final SubjectSectionDetailData dataObject, final Object[] values, final FormDataTable[] data) {
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

	/** get form table for this linked form AssignableStaff **/
	public AssignableStaffFdt getAssignableStaffFdt() {
		return (AssignableStaffFdt)this.linkedData[0];
	}

	/** set form table for this linked form AssignableStaff **/
	public void setAssignableStaffFdt(AssignableStaffFdt fdt) {
		 this.linkedData[0] = (AssignableStaffFdt) fdt;
	}
}
