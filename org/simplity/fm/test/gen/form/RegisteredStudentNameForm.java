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
import org.simplity.fm.test.gen.schema.RegisteredStudentNameData;
import org.simplity.fm.test.gen.schema.RegisteredStudentNameDataTable;
/** class for form registeredStudentName  */
public class RegisteredStudentNameForm extends Form {
	protected static final String NAME = "registeredStudentName";
	protected static final String SCHEMA = "registeredStudentName";
	protected static final  boolean[] OPS = {false, false, false, false, true, false};
/** constructor */
public RegisteredStudentNameForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public RegisteredStudentNameFd newFormData() {
		return new RegisteredStudentNameFd(this, null, null, null);
	}

	@Override
	public RegisteredStudentNameFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (RegisteredStudentNameFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public RegisteredStudentNameFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (RegisteredStudentNameFd)super.parseKeys(json, ctx);
	}

	@Override
	public RegisteredStudentNameFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (RegisteredStudentNameFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public RegisteredStudentNameFdt newFormDataTable() {
		return new RegisteredStudentNameFdt(this, null, null, null);
	}

	@Override
	public RegisteredStudentNameFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new RegisteredStudentNameFd(this, (RegisteredStudentNameData) schemaData, values, data);
	}

	@Override
	public RegisteredStudentNameFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new RegisteredStudentNameFdt(this, (RegisteredStudentNameDataTable) table, values, linkedData);
	}
}
