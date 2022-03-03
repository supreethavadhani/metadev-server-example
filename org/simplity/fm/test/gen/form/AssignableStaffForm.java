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
import org.simplity.fm.test.gen.schema.AssignableStaffData;
import org.simplity.fm.test.gen.schema.AssignableStaffDataTable;
/** class for form assignableStaff  */
public class AssignableStaffForm extends Form {
	protected static final String NAME = "assignableStaff";
	protected static final String SCHEMA = "assignableStaff";
	protected static final  boolean[] OPS = {false, false, false, false, true, false};
/** constructor */
public AssignableStaffForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public AssignableStaffFd newFormData() {
		return new AssignableStaffFd(this, null, null, null);
	}

	@Override
	public AssignableStaffFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (AssignableStaffFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public AssignableStaffFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (AssignableStaffFd)super.parseKeys(json, ctx);
	}

	@Override
	public AssignableStaffFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (AssignableStaffFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public AssignableStaffFdt newFormDataTable() {
		return new AssignableStaffFdt(this, null, null, null);
	}

	@Override
	public AssignableStaffFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new AssignableStaffFd(this, (AssignableStaffData) schemaData, values, data);
	}

	@Override
	public AssignableStaffFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new AssignableStaffFdt(this, (AssignableStaffDataTable) table, values, linkedData);
	}
}
