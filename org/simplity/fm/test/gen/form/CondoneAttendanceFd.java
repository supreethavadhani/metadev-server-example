package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailData;
/** class for form data condoneAttendance  */
public class CondoneAttendanceFd extends FormData {
	public CondoneAttendanceFd(final CondoneAttendanceForm form, final SubjectSectionDetailData dataObject, final Object[] values, final FormDataTable[] data) {
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

	/** get form table for this linked form EligibilityList **/
	public EligibilityListFdt getEligibilityListFdt() {
		return (EligibilityListFdt)this.linkedData[0];
	}

	/** set form table for this linked form EligibilityList **/
	public void setEligibilityListFdt(EligibilityListFdt fdt) {
		 this.linkedData[0] = (EligibilityListFdt) fdt;
	}
}
