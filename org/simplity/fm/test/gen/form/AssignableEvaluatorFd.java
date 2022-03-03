package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.AssignableEvaluatorData;
/** class for form data assignableEvaluator  */
public class AssignableEvaluatorFd extends FormData {
	public AssignableEvaluatorFd(final AssignableEvaluatorForm form, final AssignableEvaluatorData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public AssignableEvaluatorData getSchemaData() {
		return (AssignableEvaluatorData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(AssignableEvaluatorData data) {
		this.dataObject = data;
	}
}
