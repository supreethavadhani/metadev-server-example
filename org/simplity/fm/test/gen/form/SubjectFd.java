package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.SubjectData;
/** class for form data subject  */
public class SubjectFd extends FormData {
	public SubjectFd(final SubjectForm form, final SubjectData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public SubjectData getSchemaData() {
		return (SubjectData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(SubjectData data) {
		this.dataObject = data;
	}

	/** get form table for this linked form ChildSubject **/
	public ChildSubjectFdt getChildSubjectFdt() {
		return (ChildSubjectFdt)this.linkedData[0];
	}

	/** set form table for this linked form ChildSubject **/
	public void setChildSubjectFdt(ChildSubjectFdt fdt) {
		 this.linkedData[0] = (ChildSubjectFdt) fdt;
	}
}
