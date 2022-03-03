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
import org.simplity.fm.test.gen.schema.UserData;
import org.simplity.fm.test.gen.schema.UserDataTable;
/** class for form user  */
public class UserForm extends Form {
	protected static final String NAME = "user";
	protected static final String SCHEMA = "user";
	protected static final  boolean[] OPS = {true, false, false, false, true, false};
/** constructor */
public UserForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public UserFd newFormData() {
		return new UserFd(this, null, null, null);
	}

	@Override
	public UserFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (UserFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public UserFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (UserFd)super.parseKeys(json, ctx);
	}

	@Override
	public UserFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (UserFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public UserFdt newFormDataTable() {
		return new UserFdt(this, null, null, null);
	}

	@Override
	public UserFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new UserFd(this, (UserData) schemaData, values, data);
	}

	@Override
	public UserFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new UserFdt(this, (UserDataTable) table, values, linkedData);
	}
}
