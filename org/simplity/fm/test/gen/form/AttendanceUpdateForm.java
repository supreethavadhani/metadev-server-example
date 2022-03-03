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
import org.simplity.fm.test.gen.schema.AttendanceUpdateData;
import org.simplity.fm.test.gen.schema.AttendanceUpdateDataTable;
/** class for form attendanceUpdate  */
public class AttendanceUpdateForm extends Form {
	protected static final String NAME = "attendanceUpdate";
	protected static final String SCHEMA = "attendanceUpdate";
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
/** constructor */
public AttendanceUpdateForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public AttendanceUpdateFd newFormData() {
		return new AttendanceUpdateFd(this, null, null, null);
	}

	@Override
	public AttendanceUpdateFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (AttendanceUpdateFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public AttendanceUpdateFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (AttendanceUpdateFd)super.parseKeys(json, ctx);
	}

	@Override
	public AttendanceUpdateFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (AttendanceUpdateFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public AttendanceUpdateFdt newFormDataTable() {
		return new AttendanceUpdateFdt(this, null, null, null);
	}

	@Override
	public AttendanceUpdateFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new AttendanceUpdateFd(this, (AttendanceUpdateData) schemaData, values, data);
	}

	@Override
	public AttendanceUpdateFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new AttendanceUpdateFdt(this, (AttendanceUpdateDataTable) table, values, linkedData);
	}
}
