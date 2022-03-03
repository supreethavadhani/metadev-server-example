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
import org.simplity.fm.test.gen.schema.LevelData;
import org.simplity.fm.test.gen.schema.LevelDataTable;
/** class for form level  */
public class LevelForm extends Form {
	protected static final String NAME = "level";
	protected static final String SCHEMA = "level";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
/** constructor */
public LevelForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public LevelFd newFormData() {
		return new LevelFd(this, null, null, null);
	}

	@Override
	public LevelFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (LevelFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public LevelFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (LevelFd)super.parseKeys(json, ctx);
	}

	@Override
	public LevelFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (LevelFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public LevelFdt newFormDataTable() {
		return new LevelFdt(this, null, null, null);
	}

	@Override
	public LevelFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new LevelFd(this, (LevelData) schemaData, values, data);
	}

	@Override
	public LevelFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new LevelFdt(this, (LevelDataTable) table, values, linkedData);
	}
}
