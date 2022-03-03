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
import org.simplity.fm.test.gen.schema.OfferedSubjectData;
import org.simplity.fm.test.gen.schema.OfferedSubjectDataTable;
/** class for form selectSubjectTest  */
public class SelectSubjectTestForm extends Form {
	protected static final String NAME = "selectSubjectTest";
	protected static final String SCHEMA = "offeredSubject";
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("tests", "selectableTest", 1, 0, null,null ,null, true)};
/** constructor */
public SelectSubjectTestForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public SelectSubjectTestFd newFormData() {
		return new SelectSubjectTestFd(this, null, null, null);
	}

	@Override
	public SelectSubjectTestFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (SelectSubjectTestFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public SelectSubjectTestFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (SelectSubjectTestFd)super.parseKeys(json, ctx);
	}

	@Override
	public SelectSubjectTestFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (SelectSubjectTestFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public SelectSubjectTestFdt newFormDataTable() {
		return new SelectSubjectTestFdt(this, null, null, null);
	}

	@Override
	public SelectSubjectTestFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new SelectSubjectTestFd(this, (OfferedSubjectData) schemaData, values, data);
	}

	@Override
	public SelectSubjectTestFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new SelectSubjectTestFdt(this, (OfferedSubjectDataTable) table, values, linkedData);
	}
}
