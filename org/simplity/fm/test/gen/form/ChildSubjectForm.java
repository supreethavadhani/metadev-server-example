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
import org.simplity.fm.test.gen.schema.ChildSubjectData;
import org.simplity.fm.test.gen.schema.ChildSubjectDataTable;
/** class for form childSubject  */
public class ChildSubjectForm extends Form {
	protected static final String NAME = "childSubject";
	protected static final String SCHEMA = "childSubject";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
/** constructor */
public ChildSubjectForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public ChildSubjectFd newFormData() {
		return new ChildSubjectFd(this, null, null, null);
	}

	@Override
	public ChildSubjectFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ChildSubjectFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ChildSubjectFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ChildSubjectFd)super.parseKeys(json, ctx);
	}

	@Override
	public ChildSubjectFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ChildSubjectFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ChildSubjectFdt newFormDataTable() {
		return new ChildSubjectFdt(this, null, null, null);
	}

	@Override
	public ChildSubjectFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ChildSubjectFd(this, (ChildSubjectData) schemaData, values, data);
	}

	@Override
	public ChildSubjectFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ChildSubjectFdt(this, (ChildSubjectDataTable) table, values, linkedData);
	}
}
