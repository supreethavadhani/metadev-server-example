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
import org.simplity.fm.test.gen.schema.ExamAttendanceData;
import org.simplity.fm.test.gen.schema.ExamAttendanceDataTable;
/** class for form examAttendance  */
public class ExamAttendanceForm extends Form {
	protected static final String NAME = "examAttendance";
	protected static final String SCHEMA = "examAttendance";
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("students", "examRegister", 0, 0, null,null ,null, true)};
/** constructor */
public ExamAttendanceForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public ExamAttendanceFd newFormData() {
		return new ExamAttendanceFd(this, null, null, null);
	}

	@Override
	public ExamAttendanceFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ExamAttendanceFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ExamAttendanceFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ExamAttendanceFd)super.parseKeys(json, ctx);
	}

	@Override
	public ExamAttendanceFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ExamAttendanceFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ExamAttendanceFdt newFormDataTable() {
		return new ExamAttendanceFdt(this, null, null, null);
	}

	@Override
	public ExamAttendanceFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ExamAttendanceFd(this, (ExamAttendanceData) schemaData, values, data);
	}

	@Override
	public ExamAttendanceFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ExamAttendanceFdt(this, (ExamAttendanceDataTable) table, values, linkedData);
	}
}
