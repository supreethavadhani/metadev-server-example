package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.CieDownloadData;
/** class for form data cieDownload  */
public class CieDownloadFd extends FormData {
	public CieDownloadFd(final CieDownloadForm form, final CieDownloadData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public CieDownloadData getSchemaData() {
		return (CieDownloadData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(CieDownloadData data) {
		this.dataObject = data;
	}

	/** get form table for this linked form StudentCieDetail **/
	public StudentCieDetailFdt getStudentCieDetailFdt() {
		return (StudentCieDetailFdt)this.linkedData[0];
	}

	/** set form table for this linked form StudentCieDetail **/
	public void setStudentCieDetailFdt(StudentCieDetailFdt fdt) {
		 this.linkedData[0] = (StudentCieDetailFdt) fdt;
	}
}
