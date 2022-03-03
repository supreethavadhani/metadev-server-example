package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.PacketRecieveData;
/** class for form data packetRecieve  */
public class PacketRecieveFd extends FormData {
	public PacketRecieveFd(final PacketRecieveForm form, final PacketRecieveData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public PacketRecieveData getSchemaData() {
		return (PacketRecieveData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(PacketRecieveData data) {
		this.dataObject = data;
	}
}
