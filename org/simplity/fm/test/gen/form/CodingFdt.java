package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.SchemaDataTable;
/** class for form data table coding  */
public class CodingFdt extends FormDataTable {
	public CodingFdt(final CodingForm form, final SchemaDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}
}
