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
import org.simplity.fm.test.gen.schema.SeasonData;
import org.simplity.fm.test.gen.schema.SeasonDataTable;
/** class for form season  */
public class SeasonForm extends Form {
	protected static final String NAME = "season";
	protected static final String SCHEMA = "season";
	protected static final  boolean[] OPS = {true, false, false, false, false, false};
/** constructor */
public SeasonForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public SeasonFd newFormData() {
		return new SeasonFd(this, null, null, null);
	}

	@Override
	public SeasonFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (SeasonFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public SeasonFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (SeasonFd)super.parseKeys(json, ctx);
	}

	@Override
	public SeasonFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (SeasonFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public SeasonFdt newFormDataTable() {
		return new SeasonFdt(this, null, null, null);
	}

	@Override
	public SeasonFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new SeasonFd(this, (SeasonData) schemaData, values, data);
	}

	@Override
	public SeasonFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new SeasonFdt(this, (SeasonDataTable) table, values, linkedData);
	}
}
