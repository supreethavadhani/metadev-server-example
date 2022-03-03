package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.PacketListDataTable;
/** class for form data table packetList  */
public class PacketListFdt extends FormDataTable {
	public PacketListFdt(final PacketListForm form, final PacketListDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public PacketListDataTable getDataTable() {
		 return (PacketListDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(PacketListDataTable table) {
		this.dataTable = table;
	}
}
