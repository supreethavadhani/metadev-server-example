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
import org.simplity.fm.test.gen.schema.StudentDetailData;
import org.simplity.fm.test.gen.schema.StudentDetailDataTable;
/** class for form studentDetail  */
public class StudentDetailForm extends Form {
	protected static final String NAME = "studentDetail";
	protected static final String SCHEMA = "studentDetail";
	protected static final  boolean[] OPS = {true, true, true, false, true, false};
/** constructor */
public StudentDetailForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public StudentDetailFd newFormData() {
		return new StudentDetailFd(this, null, null, null);
	}

	@Override
	public StudentDetailFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (StudentDetailFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public StudentDetailFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (StudentDetailFd)super.parseKeys(json, ctx);
	}

	@Override
	public StudentDetailFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (StudentDetailFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public StudentDetailFdt newFormDataTable() {
		return new StudentDetailFdt(this, null, null, null);
	}

	@Override
	public StudentDetailFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new StudentDetailFd(this, (StudentDetailData) schemaData, values, data);
	}

	@Override
	public StudentDetailFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new StudentDetailFdt(this, (StudentDetailDataTable) table, values, linkedData);
	}
}
