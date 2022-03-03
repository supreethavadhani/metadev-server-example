package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.CodedPaperNameData;
/** class for form data codedPaperName  */
public class CodedPaperNameFd extends FormData {
	public CodedPaperNameFd(final CodedPaperNameForm form, final CodedPaperNameData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public CodedPaperNameData getSchemaData() {
		return (CodedPaperNameData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(CodedPaperNameData data) {
		this.dataObject = data;
	}
}
