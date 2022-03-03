package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectSectionData;
/** class for form data subjectSection  */
public class SubjectSectionFd extends FormData {
	public SubjectSectionFd(final SubjectSectionForm form, final SubjectSectionData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public SubjectSectionData getSchemaData() {
		return (SubjectSectionData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(SubjectSectionData data) {
		this.dataObject = data;
	}
}
