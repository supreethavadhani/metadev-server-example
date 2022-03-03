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
import org.simplity.fm.test.gen.schema.ForgotPasswordData;
import org.simplity.fm.test.gen.schema.ForgotPasswordDataTable;
/** class for form forgotPassword  */
public class ForgotPasswordForm extends Form {
	protected static final String NAME = "forgotPassword";
	protected static final String SCHEMA = "forgotPassword";
	protected static final  Field[] FIELDS = {
			new Field("userName", 0, DefinedDataTypes.email, null, null, null, true), 
			new Field("otp", 1, DefinedDataTypes.text, null, null, null, true), 
			new Field("newPassword", 2, DefinedDataTypes.text, null, null, null, true), 
			new Field("confirmPassword", 3, DefinedDataTypes.text, null, null, null, true)};
	protected static final  boolean[] OPS = {true, false, true, false, true, false};
/** constructor */
public ForgotPasswordForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.localFields = FIELDS;
	}

	@Override
	public ForgotPasswordFd newFormData() {
		return new ForgotPasswordFd(this, null, null, null);
	}

	@Override
	public ForgotPasswordFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ForgotPasswordFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ForgotPasswordFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ForgotPasswordFd)super.parseKeys(json, ctx);
	}

	@Override
	public ForgotPasswordFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ForgotPasswordFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ForgotPasswordFdt newFormDataTable() {
		return new ForgotPasswordFdt(this, null, null, null);
	}

	@Override
	public ForgotPasswordFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ForgotPasswordFd(this, (ForgotPasswordData) schemaData, values, data);
	}

	@Override
	public ForgotPasswordFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ForgotPasswordFdt(this, (ForgotPasswordDataTable) table, values, linkedData);
	}
}
