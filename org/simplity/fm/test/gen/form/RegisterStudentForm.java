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
import org.simplity.fm.test.gen.schema.SubjectSectionDetailData;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailDataTable;
/** class for form registerStudent  */
public class RegisterStudentForm extends Form {
	protected static final String NAME = "registerStudent";
	protected static final String SCHEMA = "subjectSectionDetail";
	protected static final  boolean[] OPS = {true, false, true, false, true, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("students", "registerableStudent", 1, 10000, null,null ,null, true)};
/** constructor */
public RegisterStudentForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public RegisterStudentFd newFormData() {
		return new RegisterStudentFd(this, null, null, null);
	}

	@Override
	public RegisterStudentFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (RegisterStudentFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public RegisterStudentFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (RegisterStudentFd)super.parseKeys(json, ctx);
	}

	@Override
	public RegisterStudentFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (RegisterStudentFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public RegisterStudentFdt newFormDataTable() {
		return new RegisterStudentFdt(this, null, null, null);
	}

	@Override
	public RegisterStudentFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new RegisterStudentFd(this, (SubjectSectionDetailData) schemaData, values, data);
	}

	@Override
	public RegisterStudentFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new RegisterStudentFdt(this, (SubjectSectionDetailDataTable) table, values, linkedData);
	}
}
