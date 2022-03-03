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
import org.simplity.fm.test.gen.schema.DepartmentData;
import org.simplity.fm.test.gen.schema.DepartmentDataTable;
/** class for form department  */
public class DepartmentForm extends Form {
	protected static final String NAME = "department";
	protected static final String SCHEMA = "department";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
/** constructor */
public DepartmentForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public DepartmentFd newFormData() {
		return new DepartmentFd(this, null, null, null);
	}

	@Override
	public DepartmentFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (DepartmentFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public DepartmentFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (DepartmentFd)super.parseKeys(json, ctx);
	}

	@Override
	public DepartmentFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (DepartmentFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public DepartmentFdt newFormDataTable() {
		return new DepartmentFdt(this, null, null, null);
	}

	@Override
	public DepartmentFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new DepartmentFd(this, (DepartmentData) schemaData, values, data);
	}

	@Override
	public DepartmentFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new DepartmentFdt(this, (DepartmentDataTable) table, values, linkedData);
	}
}
