package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.OfferableSubjectData;
/** class for form data offerableSubject  */
public class OfferableSubjectFd extends FormData {
	public OfferableSubjectFd(final OfferableSubjectForm form, final OfferableSubjectData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public OfferableSubjectData getSchemaData() {
		return (OfferableSubjectData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(OfferableSubjectData data) {
		this.dataObject = data;
	}
}
