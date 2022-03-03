package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.AssignableEvaluatorDataTable;
/** class for form data table assignableEvaluator  */
public class AssignableEvaluatorFdt extends FormDataTable {
	public AssignableEvaluatorFdt(final AssignableEvaluatorForm form, final AssignableEvaluatorDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public AssignableEvaluatorDataTable getDataTable() {
		 return (AssignableEvaluatorDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(AssignableEvaluatorDataTable table) {
		this.dataTable = table;
	}
}
