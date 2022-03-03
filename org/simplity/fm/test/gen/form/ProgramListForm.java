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
import org.simplity.fm.test.gen.schema.ProgramListData;
import org.simplity.fm.test.gen.schema.ProgramListDataTable;
/** class for form programList  */
public class ProgramListForm extends Form {
	protected static final String NAME = "programList";
	protected static final String SCHEMA = "programList";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
/** constructor */
public ProgramListForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public ProgramListFd newFormData() {
		return new ProgramListFd(this, null, null, null);
	}

	@Override
	public ProgramListFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ProgramListFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ProgramListFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ProgramListFd)super.parseKeys(json, ctx);
	}

	@Override
	public ProgramListFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ProgramListFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ProgramListFdt newFormDataTable() {
		return new ProgramListFdt(this, null, null, null);
	}

	@Override
	public ProgramListFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ProgramListFd(this, (ProgramListData) schemaData, values, data);
	}

	@Override
	public ProgramListFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ProgramListFdt(this, (ProgramListDataTable) table, values, linkedData);
	}
}
