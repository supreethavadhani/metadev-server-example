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
import org.simplity.fm.test.gen.schema.StudentData;
import org.simplity.fm.test.gen.schema.StudentDataTable;
/** class for form student  */
public class StudentForm extends Form {
	protected static final String NAME = "student";
	protected static final String SCHEMA = "student";
	protected static final  boolean[] OPS = {true, true, true, false, true, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("guardians", "guardian", 1, 0, null, new String[]{"studentId"}, new String[]{"studentId"}, true)};
/** constructor */
public StudentForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public StudentFd newFormData() {
		return new StudentFd(this, null, null, null);
	}

	@Override
	public StudentFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (StudentFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public StudentFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (StudentFd)super.parseKeys(json, ctx);
	}

	@Override
	public StudentFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (StudentFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public StudentFdt newFormDataTable() {
		return new StudentFdt(this, null, null, null);
	}

	@Override
	public StudentFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new StudentFd(this, (StudentData) schemaData, values, data);
	}

	@Override
	public StudentFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new StudentFdt(this, (StudentDataTable) table, values, linkedData);
	}
}
