package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StudentCieDetailDataTable;
/** class for form data table studentCieDetail  */
public class StudentCieDetailFdt extends FormDataTable {
	public StudentCieDetailFdt(final StudentCieDetailForm form, final StudentCieDetailDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public StudentCieDetailDataTable getDataTable() {
		 return (StudentCieDetailDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(StudentCieDetailDataTable table) {
		this.dataTable = table;
	}
}
