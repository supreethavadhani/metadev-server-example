package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.StudentInRegisterData;
/** class for form data marksForStudent  */
public class MarksForStudentFd extends FormData {
	public MarksForStudentFd(final MarksForStudentForm form, final StudentInRegisterData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public StudentInRegisterData getSchemaData() {
		return (StudentInRegisterData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(StudentInRegisterData data) {
		this.dataObject = data;
	}

	/** get form table for this linked form CieMarks **/
	public CieMarksFdt getCieMarksFdt() {
		return (CieMarksFdt)this.linkedData[0];
	}

	/** set form table for this linked form CieMarks **/
	public void setCieMarksFdt(CieMarksFdt fdt) {
		 this.linkedData[0] = (CieMarksFdt) fdt;
	}
}
