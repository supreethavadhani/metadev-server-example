package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailData;
import java.time.LocalDate;
import java.time.Instant;
/** class for form data marksForIntegratedSection  */
public class MarksForIntegratedSectionFd extends FormData {
	public MarksForIntegratedSectionFd(final MarksForIntegratedSectionForm form, final SubjectSectionDetailData dataObject, final Object[] values, final FormDataTable[] data) {
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
	 * set value for isIntegrated
	 * @param value to be assigned to isIntegrated
	 */
	public void setIsIntegrated(boolean value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of isIntegrated
	 */
	public boolean getIsIntegrated(){
		return super.getBoolValue(0);
	}

	/** get form table for this linked form IntegratedCie **/
	public IntegratedCieFdt getIntegratedCieFdt() {
		return (IntegratedCieFdt)this.linkedData[0];
	}

	/** set form table for this linked form IntegratedCie **/
	public void setIntegratedCieFdt(IntegratedCieFdt fdt) {
		 this.linkedData[0] = (IntegratedCieFdt) fdt;
	}
}
