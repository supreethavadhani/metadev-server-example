package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.OfferedSubjectDetailData;
/** class for form data offeredSubjectDetail  */
public class OfferedSubjectDetailFd extends FormData {
	public OfferedSubjectDetailFd(final OfferedSubjectDetailForm form, final OfferedSubjectDetailData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public OfferedSubjectDetailData getSchemaData() {
		return (OfferedSubjectDetailData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(OfferedSubjectDetailData data) {
		this.dataObject = data;
	}

	/** get form table for this linked form OfferableSection **/
	public OfferableSectionFdt getOfferableSectionFdt() {
		return (OfferableSectionFdt)this.linkedData[0];
	}

	/** set form table for this linked form OfferableSection **/
	public void setOfferableSectionFdt(OfferableSectionFdt fdt) {
		 this.linkedData[0] = (OfferableSectionFdt) fdt;
	}
}
