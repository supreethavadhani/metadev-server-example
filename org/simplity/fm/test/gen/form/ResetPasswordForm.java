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
/** class for form resetPassword  */
public class ResetPasswordForm extends Form {
	protected static final String NAME = "resetPassword";
	protected static final  Field[] FIELDS = {
			new Field("currentPassword", 0, DefinedDataTypes.text, null, null, null, true), 
			new Field("newPassword", 1, DefinedDataTypes.text, null, null, null, true), 
			new Field("confirmPassword", 2, DefinedDataTypes.text, null, null, null, true)};
	protected static final  boolean[] OPS = {true, false, true, false, true, false};
/** constructor */
public ResetPasswordForm() {
		this.name = NAME;
		this.operations = OPS;
		this.localFields = FIELDS;
	}

	@Override
	public ResetPasswordFd newFormData() {
		return new ResetPasswordFd(this, null, null, null);
	}

	@Override
	public ResetPasswordFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ResetPasswordFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ResetPasswordFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ResetPasswordFd)super.parseKeys(json, ctx);
	}

	@Override
	public ResetPasswordFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ResetPasswordFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ResetPasswordFdt newFormDataTable() {
		return new ResetPasswordFdt(this, null, null, null);
	}

	@Override
	public ResetPasswordFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ResetPasswordFd(this, null, values, data);
	}

	@Override
	public ResetPasswordFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ResetPasswordFdt(this, null, values, linkedData);
	}
}
