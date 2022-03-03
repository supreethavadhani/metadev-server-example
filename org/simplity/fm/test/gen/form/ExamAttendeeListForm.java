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
/** class for form examAttendeeList  */
public class ExamAttendeeListForm extends Form {
	protected static final String NAME = "examAttendeeList";
	protected static final  Field[] FIELDS = {
			new Field("departmentId", 0, DefinedDataTypes.id, null, null, "departmentList", true), 
			new Field("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, true), 
			new Field("isMakeup", 2, DefinedDataTypes.bool, null, null, null, false)};
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("students", "examAttendeeName", 0, 0, null,null ,null, true)};
/** constructor */
public ExamAttendeeListForm() {
		this.name = NAME;
		this.operations = OPS;
		this.localFields = FIELDS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public ExamAttendeeListFd newFormData() {
		return new ExamAttendeeListFd(this, null, null, null);
	}

	@Override
	public ExamAttendeeListFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ExamAttendeeListFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ExamAttendeeListFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ExamAttendeeListFd)super.parseKeys(json, ctx);
	}

	@Override
	public ExamAttendeeListFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ExamAttendeeListFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ExamAttendeeListFdt newFormDataTable() {
		return new ExamAttendeeListFdt(this, null, null, null);
	}

	@Override
	public ExamAttendeeListFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ExamAttendeeListFd(this, null, values, data);
	}

	@Override
	public ExamAttendeeListFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ExamAttendeeListFdt(this, null, values, linkedData);
	}
}
