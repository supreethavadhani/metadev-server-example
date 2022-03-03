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
import org.simplity.fm.test.gen.schema.ExamRegisterData;
import org.simplity.fm.test.gen.schema.ExamRegisterDataTable;
/** class for form examRegister  */
public class ExamRegisterForm extends Form {
	protected static final String NAME = "examRegister";
	protected static final String SCHEMA = "examRegister";
	protected static final  boolean[] OPS = {true, false, true, false, true, false};
/** constructor */
public ExamRegisterForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public ExamRegisterFd newFormData() {
		return new ExamRegisterFd(this, null, null, null);
	}

	@Override
	public ExamRegisterFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ExamRegisterFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ExamRegisterFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ExamRegisterFd)super.parseKeys(json, ctx);
	}

	@Override
	public ExamRegisterFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ExamRegisterFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ExamRegisterFdt newFormDataTable() {
		return new ExamRegisterFdt(this, null, null, null);
	}

	@Override
	public ExamRegisterFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ExamRegisterFd(this, (ExamRegisterData) schemaData, values, data);
	}

	@Override
	public ExamRegisterFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ExamRegisterFdt(this, (ExamRegisterDataTable) table, values, linkedData);
	}
}
