package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailData;
import java.time.LocalDate;
import java.time.Instant;
/** class for form data consolidatedAttendance  */
public class ConsolidatedAttendanceFd extends FormData {
	public ConsolidatedAttendanceFd(final ConsolidatedAttendanceForm form, final SubjectSectionDetailData dataObject, final Object[] values, final FormDataTable[] data) {
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

	/**
	 * set value for freezeAt
	 * @param value to be assigned to freezeAt
	 */
	public void setFreezeAt(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of freezeAt
	 */
	public long getFreezeAt(){
		return super.getLongValue(0);
	}

	/** get form table for this linked form SectionAttendance **/
	public SectionAttendanceFdt getSectionAttendanceFdt() {
		return (SectionAttendanceFdt)this.linkedData[0];
	}

	/** set form table for this linked form SectionAttendance **/
	public void setSectionAttendanceFdt(SectionAttendanceFdt fdt) {
		 this.linkedData[0] = (SectionAttendanceFdt) fdt;
	}
}
