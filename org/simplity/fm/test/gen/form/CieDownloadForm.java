package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.ComponentProvider;
import org.simplity.fm.core.data.Form;
import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.LinkedForm;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.SchemaData;
import org.simplity.fm.core.data.SchemaDataTable;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.service.IServiceContext;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.test.gen.schema.CieDownloadData;
import org.simplity.fm.test.gen.schema.CieDownloadDataTable;
/** class for form cieDownload  */
public class CieDownloadForm extends Form {
	protected static final String NAME = "cieDownload";
	protected static final String SCHEMA = "cieDownload";
	protected static final  boolean[] OPS = {true, false, true, false, true, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("studentCieDetails", "studentCieDetail", 0, 0, null, new String[]{"subjectSectionId"}, new String[]{"subjectSectionId"}, true)};
/** constructor */
public CieDownloadForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public CieDownloadFd newFormData() {
		return new CieDownloadFd(this, null, null, null);
	}

	@Override
	public CieDownloadFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (CieDownloadFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public CieDownloadFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (CieDownloadFd)super.parseKeys(json, ctx);
	}

	@Override
	public CieDownloadFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (CieDownloadFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public CieDownloadFdt newFormDataTable() {
		return new CieDownloadFdt(this, null, null, null);
	}

	@Override
	public CieDownloadFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new CieDownloadFd(this, (CieDownloadData) schemaData, values, data);
	}

	@Override
	public CieDownloadFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new CieDownloadFdt(this, (CieDownloadDataTable) table, values, linkedData);
	}
}
