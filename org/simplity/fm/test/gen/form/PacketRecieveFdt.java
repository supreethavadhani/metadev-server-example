package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.PacketRecieveDataTable;
/** class for form data table packetRecieve  */
public class PacketRecieveFdt extends FormDataTable {
	public PacketRecieveFdt(final PacketRecieveForm form, final PacketRecieveDataTable dataTable, final Object[][] values, FormDataTable[][] linkedData) {
		super(form, dataTable, values, linkedData);
	}

	@Override
	public PacketRecieveDataTable getDataTable() {
		 return (PacketRecieveDataTable) this.dataTable;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaDataTable(PacketRecieveDataTable table) {
		this.dataTable = table;
	}
}
