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
import org.simplity.fm.test.gen.schema.AssignedStaffNameData;
import org.simplity.fm.test.gen.schema.AssignedStaffNameDataTable;
/** class for form assignedStaffName  */
public class AssignedStaffNameForm extends Form {
	protected static final String NAME = "assignedStaffName";
	protected static final String SCHEMA = "assignedStaffName";
	protected static final  boolean[] OPS = {false, false, false, false, true, false};
/** constructor */
public AssignedStaffNameForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public AssignedStaffNameFd newFormData() {
		return new AssignedStaffNameFd(this, null, null, null);
	}

	@Override
	public AssignedStaffNameFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (AssignedStaffNameFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public AssignedStaffNameFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (AssignedStaffNameFd)super.parseKeys(json, ctx);
	}

	@Override
	public AssignedStaffNameFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (AssignedStaffNameFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public AssignedStaffNameFdt newFormDataTable() {
		return new AssignedStaffNameFdt(this, null, null, null);
	}

	@Override
	public AssignedStaffNameFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new AssignedStaffNameFd(this, (AssignedStaffNameData) schemaData, values, data);
	}

	@Override
	public AssignedStaffNameFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new AssignedStaffNameFdt(this, (AssignedStaffNameDataTable) table, values, linkedData);
	}
}
