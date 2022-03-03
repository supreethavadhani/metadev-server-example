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
import org.simplity.fm.test.gen.schema.SubjectListData;
import org.simplity.fm.test.gen.schema.SubjectListDataTable;
/** class for form subjectList  */
public class SubjectListForm extends Form {
	protected static final String NAME = "subjectList";
	protected static final String SCHEMA = "subjectList";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
/** constructor */
public SubjectListForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public SubjectListFd newFormData() {
		return new SubjectListFd(this, null, null, null);
	}

	@Override
	public SubjectListFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (SubjectListFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public SubjectListFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (SubjectListFd)super.parseKeys(json, ctx);
	}

	@Override
	public SubjectListFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (SubjectListFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public SubjectListFdt newFormDataTable() {
		return new SubjectListFdt(this, null, null, null);
	}

	@Override
	public SubjectListFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new SubjectListFd(this, (SubjectListData) schemaData, values, data);
	}

	@Override
	public SubjectListFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new SubjectListFdt(this, (SubjectListDataTable) table, values, linkedData);
	}
}
