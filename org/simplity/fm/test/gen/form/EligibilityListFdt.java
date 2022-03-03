package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.EligibilityListDataTable;
/** class for form data table eligibilityList  */
public class EligibilityListFdt extends FormDataTable {
	public EligibilityListFdt(final EligibilityListForm form, final EligibilityListDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public EligibilityListDataTable getDataTable() {
		 return (EligibilityListDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(EligibilityListDataTable table) {
		this.dataTable = table;
	}
}
