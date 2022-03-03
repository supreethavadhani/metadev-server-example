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
import org.simplity.fm.test.gen.schema.GuardianData;
import org.simplity.fm.test.gen.schema.GuardianDataTable;
/** class for form guardian  */
public class GuardianForm extends Form {
	protected static final String NAME = "guardian";
	protected static final String SCHEMA = "guardian";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
/** constructor */
public GuardianForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public GuardianFd newFormData() {
		return new GuardianFd(this, null, null, null);
	}

	@Override
	public GuardianFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (GuardianFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public GuardianFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (GuardianFd)super.parseKeys(json, ctx);
	}

	@Override
	public GuardianFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (GuardianFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public GuardianFdt newFormDataTable() {
		return new GuardianFdt(this, null, null, null);
	}

	@Override
	public GuardianFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new GuardianFd(this, (GuardianData) schemaData, values, data);
	}

	@Override
	public GuardianFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new GuardianFdt(this, (GuardianDataTable) table, values, linkedData);
	}
}
