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
import org.simplity.fm.test.gen.schema.ProgramData;
import org.simplity.fm.test.gen.schema.ProgramDataTable;
/** class for form program  */
public class ProgramForm extends Form {
	protected static final String NAME = "program";
	protected static final String SCHEMA = "program";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
/** constructor */
public ProgramForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public ProgramFd newFormData() {
		return new ProgramFd(this, null, null, null);
	}

	@Override
	public ProgramFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ProgramFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ProgramFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ProgramFd)super.parseKeys(json, ctx);
	}

	@Override
	public ProgramFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ProgramFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ProgramFdt newFormDataTable() {
		return new ProgramFdt(this, null, null, null);
	}

	@Override
	public ProgramFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ProgramFd(this, (ProgramData) schemaData, values, data);
	}

	@Override
	public ProgramFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ProgramFdt(this, (ProgramDataTable) table, values, linkedData);
	}
}
