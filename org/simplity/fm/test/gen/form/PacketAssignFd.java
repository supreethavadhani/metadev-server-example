package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.PacketAssignData;
/** class for form data packetAssign  */
public class PacketAssignFd extends FormData {
	public PacketAssignFd(final PacketAssignForm form, final PacketAssignData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public PacketAssignData getSchemaData() {
		return (PacketAssignData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(PacketAssignData data) {
		this.dataObject = data;
	}
}
