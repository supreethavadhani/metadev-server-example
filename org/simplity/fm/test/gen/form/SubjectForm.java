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
import org.simplity.fm.test.gen.schema.SubjectData;
import org.simplity.fm.test.gen.schema.SubjectDataTable;
/** class for form subject  */
public class SubjectForm extends Form {
	protected static final String NAME = "subject";
	protected static final String SCHEMA = "subject";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("childSubjects", "childSubject", 0, 0, null, new String[]{"subjectId"}, new String[]{"parentId"}, true)};
/** constructor */
public SubjectForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public SubjectFd newFormData() {
		return new SubjectFd(this, null, null, null);
	}

	@Override
	public SubjectFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (SubjectFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public SubjectFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (SubjectFd)super.parseKeys(json, ctx);
	}

	@Override
	public SubjectFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (SubjectFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public SubjectFdt newFormDataTable() {
		return new SubjectFdt(this, null, null, null);
	}

	@Override
	public SubjectFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new SubjectFd(this, (SubjectData) schemaData, values, data);
	}

	@Override
	public SubjectFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new SubjectFdt(this, (SubjectDataTable) table, values, linkedData);
	}
}
