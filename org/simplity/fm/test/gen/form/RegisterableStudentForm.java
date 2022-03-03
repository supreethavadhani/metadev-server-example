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
import org.simplity.fm.test.gen.schema.RegisterableStudentData;
import org.simplity.fm.test.gen.schema.RegisterableStudentDataTable;
/** class for form registerableStudent  */
public class RegisterableStudentForm extends Form {
	protected static final String NAME = "registerableStudent";
	protected static final String SCHEMA = "registerableStudent";
	protected static final  boolean[] OPS = {false, false, false, false, true, false};
/** constructor */
public RegisterableStudentForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public RegisterableStudentFd newFormData() {
		return new RegisterableStudentFd(this, null, null, null);
	}

	@Override
	public RegisterableStudentFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (RegisterableStudentFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public RegisterableStudentFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (RegisterableStudentFd)super.parseKeys(json, ctx);
	}

	@Override
	public RegisterableStudentFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (RegisterableStudentFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public RegisterableStudentFdt newFormDataTable() {
		return new RegisterableStudentFdt(this, null, null, null);
	}

	@Override
	public RegisterableStudentFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new RegisterableStudentFd(this, (RegisterableStudentData) schemaData, values, data);
	}

	@Override
	public RegisterableStudentFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new RegisterableStudentFdt(this, (RegisterableStudentDataTable) table, values, linkedData);
	}
}
