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
import org.simplity.fm.test.gen.schema.StudentCieDetailData;
import org.simplity.fm.test.gen.schema.StudentCieDetailDataTable;
/** class for form studentCieDetail  */
public class StudentCieDetailForm extends Form {
	protected static final String NAME = "studentCieDetail";
	protected static final String SCHEMA = "studentCieDetail";
	protected static final  boolean[] OPS = {true, true, true, false, true, false};
/** constructor */
public StudentCieDetailForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public StudentCieDetailFd newFormData() {
		return new StudentCieDetailFd(this, null, null, null);
	}

	@Override
	public StudentCieDetailFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (StudentCieDetailFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public StudentCieDetailFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (StudentCieDetailFd)super.parseKeys(json, ctx);
	}

	@Override
	public StudentCieDetailFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (StudentCieDetailFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public StudentCieDetailFdt newFormDataTable() {
		return new StudentCieDetailFdt(this, null, null, null);
	}

	@Override
	public StudentCieDetailFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new StudentCieDetailFd(this, (StudentCieDetailData) schemaData, values, data);
	}

	@Override
	public StudentCieDetailFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new StudentCieDetailFdt(this, (StudentCieDetailDataTable) table, values, linkedData);
	}
}
