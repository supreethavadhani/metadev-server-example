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
/** class for form assignEvaluator  */
public class AssignEvaluatorForm extends Form {
	protected static final String NAME = "assignEvaluator";
	protected static final  Field[] FIELDS = {
			new Field("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, true), 
			new Field("departmentId", 1, DefinedDataTypes.id, null, null, null, true), 
			new Field("subjectName", 2, DefinedDataTypes.text, null, null, null, false)};
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("evaluators", "assignableEvaluator", 0, 0, null,null ,null, true)};
/** constructor */
public AssignEvaluatorForm() {
		this.name = NAME;
		this.operations = OPS;
		this.localFields = FIELDS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public AssignEvaluatorFd newFormData() {
		return new AssignEvaluatorFd(this, null, null, null);
	}

	@Override
	public AssignEvaluatorFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (AssignEvaluatorFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public AssignEvaluatorFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (AssignEvaluatorFd)super.parseKeys(json, ctx);
	}

	@Override
	public AssignEvaluatorFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (AssignEvaluatorFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public AssignEvaluatorFdt newFormDataTable() {
		return new AssignEvaluatorFdt(this, null, null, null);
	}

	@Override
	public AssignEvaluatorFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new AssignEvaluatorFd(this, null, values, data);
	}

	@Override
	public AssignEvaluatorFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new AssignEvaluatorFdt(this, null, values, linkedData);
	}
}
