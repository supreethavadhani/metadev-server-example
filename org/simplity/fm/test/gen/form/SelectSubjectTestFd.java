package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.OfferedSubjectData;
/** class for form data selectSubjectTest  */
public class SelectSubjectTestFd extends FormData {
	public SelectSubjectTestFd(final SelectSubjectTestForm form, final OfferedSubjectData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public OfferedSubjectData getSchemaData() {
		return (OfferedSubjectData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(OfferedSubjectData data) {
		this.dataObject = data;
	}

	/** get form table for this linked form SelectableTest **/
	public SelectableTestFdt getSelectableTestFdt() {
		return (SelectableTestFdt)this.linkedData[0];
	}

	/** set form table for this linked form SelectableTest **/
	public void setSelectableTestFdt(SelectableTestFdt fdt) {
		 this.linkedData[0] = (SelectableTestFdt) fdt;
	}
}
