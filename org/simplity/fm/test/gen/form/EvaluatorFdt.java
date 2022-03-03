package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.EvaluatorDataTable;
/** class for form data table evaluator  */
public class EvaluatorFdt extends FormDataTable {
	public EvaluatorFdt(final EvaluatorForm form, final EvaluatorDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public EvaluatorDataTable getDataTable() {
		 return (EvaluatorDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(EvaluatorDataTable table) {
		this.dataTable = table;
	}
}
