package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.CodedPaperData;
/** class for form data codedPaper  */
public class CodedPaperFd extends FormData {
	public CodedPaperFd(final CodedPaperForm form, final CodedPaperData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public CodedPaperData getSchemaData() {
		return (CodedPaperData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(CodedPaperData data) {
		this.dataObject = data;
	}
}
