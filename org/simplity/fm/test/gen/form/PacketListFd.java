package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.PacketListData;
/** class for form data packetList  */
public class PacketListFd extends FormData {
	public PacketListFd(final PacketListForm form, final PacketListData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public PacketListData getSchemaData() {
		return (PacketListData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(PacketListData data) {
		this.dataObject = data;
	}
}
