package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.PacketAssignDataTable;
/** class for form data table packetAssign  */
public class PacketAssignFdt extends FormDataTable {
	public PacketAssignFdt(final PacketAssignForm form, final PacketAssignDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public PacketAssignDataTable getDataTable() {
		 return (PacketAssignDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(PacketAssignDataTable table) {
		this.dataTable = table;
	}
}
