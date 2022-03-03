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
import org.simplity.fm.test.gen.schema.StaffData;
import org.simplity.fm.test.gen.schema.StaffDataTable;
/** class for form staff  */
public class StaffForm extends Form {
	protected static final String NAME = "staff";
	protected static final String SCHEMA = "staff";
	protected static final  boolean[] OPS = {true, true, true, false, true, false};
/** constructor */
public StaffForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public StaffFd newFormData() {
		return new StaffFd(this, null, null, null);
	}

	@Override
	public StaffFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (StaffFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public StaffFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (StaffFd)super.parseKeys(json, ctx);
	}

	@Override
	public StaffFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (StaffFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public StaffFdt newFormDataTable() {
		return new StaffFdt(this, null, null, null);
	}

	@Override
	public StaffFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new StaffFd(this, (StaffData) schemaData, values, data);
	}

	@Override
	public StaffFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new StaffFdt(this, (StaffDataTable) table, values, linkedData);
	}
}
