package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.OfferableSectionData;
/** class for form data offerableSection  */
public class OfferableSectionFd extends FormData {
	public OfferableSectionFd(final OfferableSectionForm form, final OfferableSectionData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public OfferableSectionData getSchemaData() {
		return (OfferableSectionData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(OfferableSectionData data) {
		this.dataObject = data;
	}
}
