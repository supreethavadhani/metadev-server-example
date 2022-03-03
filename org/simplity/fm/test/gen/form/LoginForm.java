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
/** class for form login  */
public class LoginForm extends Form {
	protected static final String NAME = "login";
	protected static final  Field[] FIELDS = {
			new Field("userName", 0, DefinedDataTypes.text, null, null, null, false), 
			new Field("password", 1, DefinedDataTypes.text, null, null, null, false)};
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public LoginForm() {
		this.name = NAME;
		this.operations = OPS;
		this.localFields = FIELDS;
	}

	@Override
	public LoginFd newFormData() {
		return new LoginFd(this, null, null, null);
	}

	@Override
	public LoginFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (LoginFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public LoginFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (LoginFd)super.parseKeys(json, ctx);
	}

	@Override
	public LoginFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (LoginFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public LoginFdt newFormDataTable() {
		return new LoginFdt(this, null, null, null);
	}

	@Override
	public LoginFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new LoginFd(this, null, values, data);
	}

	@Override
	public LoginFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new LoginFdt(this, null, values, linkedData);
	}
}
