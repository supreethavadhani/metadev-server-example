package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.EvaluatorData;
/** class for form data evaluator  */
public class EvaluatorFd extends FormData {
	public EvaluatorFd(final EvaluatorForm form, final EvaluatorData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public EvaluatorData getSchemaData() {
		return (EvaluatorData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(EvaluatorData data) {
		this.dataObject = data;
	}
}
