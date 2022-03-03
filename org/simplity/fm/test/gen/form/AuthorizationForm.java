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
/** class for form authorization  */
public class AuthorizationForm extends Form {
	protected static final String NAME = "authorization";
	protected static final  Field[] FIELDS = {
			new Field("departmentId", 0, DefinedDataTypes.id, null, null, "departmentList", true), 
			new Field("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, true)};
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public AuthorizationForm() {
		this.name = NAME;
		this.operations = OPS;
		this.localFields = FIELDS;
	}

	@Override
	public AuthorizationFd newFormData() {
		return new AuthorizationFd(this, null, null, null);
	}

	@Override
	public AuthorizationFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (AuthorizationFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public AuthorizationFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (AuthorizationFd)super.parseKeys(json, ctx);
	}

	@Override
	public AuthorizationFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (AuthorizationFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public AuthorizationFdt newFormDataTable() {
		return new AuthorizationFdt(this, null, null, null);
	}

	@Override
	public AuthorizationFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new AuthorizationFd(this, null, values, data);
	}

	@Override
	public AuthorizationFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new AuthorizationFdt(this, null, values, linkedData);
	}
}
