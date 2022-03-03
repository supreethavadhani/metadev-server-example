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
import org.simplity.fm.test.gen.schema.AssignableEvaluatorData;
import org.simplity.fm.test.gen.schema.AssignableEvaluatorDataTable;
/** class for form assignableEvaluator  */
public class AssignableEvaluatorForm extends Form {
	protected static final String NAME = "assignableEvaluator";
	protected static final String SCHEMA = "assignableEvaluator";
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public AssignableEvaluatorForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public AssignableEvaluatorFd newFormData() {
		return new AssignableEvaluatorFd(this, null, null, null);
	}

	@Override
	public AssignableEvaluatorFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (AssignableEvaluatorFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public AssignableEvaluatorFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (AssignableEvaluatorFd)super.parseKeys(json, ctx);
	}

	@Override
	public AssignableEvaluatorFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (AssignableEvaluatorFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public AssignableEvaluatorFdt newFormDataTable() {
		return new AssignableEvaluatorFdt(this, null, null, null);
	}

	@Override
	public AssignableEvaluatorFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new AssignableEvaluatorFd(this, (AssignableEvaluatorData) schemaData, values, data);
	}

	@Override
	public AssignableEvaluatorFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new AssignableEvaluatorFdt(this, (AssignableEvaluatorDataTable) table, values, linkedData);
	}
}
