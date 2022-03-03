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
import org.simplity.fm.test.gen.schema.StaffRegistrationData;
import org.simplity.fm.test.gen.schema.StaffRegistrationDataTable;
/** class for form staffRegistration  */
public class StaffRegistrationForm extends Form {
	protected static final String NAME = "staffRegistration";
	protected static final String SCHEMA = "staffRegistration";
	protected static final  Field[] FIELDS = {
			new Field("userName", 0, DefinedDataTypes.text, null, null, null, true), 
			new Field("email", 1, DefinedDataTypes.email, null, null, null, true), 
			new Field("newPassword", 2, DefinedDataTypes.text, null, null, null, true), 
			new Field("confirmPassword", 3, DefinedDataTypes.text, null, null, null, true)};
	protected static final  boolean[] OPS = {true, true, true, false, true, false};
/** constructor */
public StaffRegistrationForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.localFields = FIELDS;
	}

	@Override
	public StaffRegistrationFd newFormData() {
		return new StaffRegistrationFd(this, null, null, null);
	}

	@Override
	public StaffRegistrationFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (StaffRegistrationFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public StaffRegistrationFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (StaffRegistrationFd)super.parseKeys(json, ctx);
	}

	@Override
	public StaffRegistrationFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (StaffRegistrationFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public StaffRegistrationFdt newFormDataTable() {
		return new StaffRegistrationFdt(this, null, null, null);
	}

	@Override
	public StaffRegistrationFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new StaffRegistrationFd(this, (StaffRegistrationData) schemaData, values, data);
	}

	@Override
	public StaffRegistrationFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new StaffRegistrationFdt(this, (StaffRegistrationDataTable) table, values, linkedData);
	}
}
