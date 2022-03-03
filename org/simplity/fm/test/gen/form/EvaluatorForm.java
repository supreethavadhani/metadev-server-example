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
import org.simplity.fm.test.gen.schema.EvaluatorData;
import org.simplity.fm.test.gen.schema.EvaluatorDataTable;
/** class for form evaluator  */
public class EvaluatorForm extends Form {
	protected static final String NAME = "evaluator";
	protected static final String SCHEMA = "evaluator";
	protected static final  boolean[] OPS = {true, false, false, false, true, false};
/** constructor */
public EvaluatorForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public EvaluatorFd newFormData() {
		return new EvaluatorFd(this, null, null, null);
	}

	@Override
	public EvaluatorFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (EvaluatorFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public EvaluatorFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (EvaluatorFd)super.parseKeys(json, ctx);
	}

	@Override
	public EvaluatorFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (EvaluatorFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public EvaluatorFdt newFormDataTable() {
		return new EvaluatorFdt(this, null, null, null);
	}

	@Override
	public EvaluatorFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new EvaluatorFd(this, (EvaluatorData) schemaData, values, data);
	}

	@Override
	public EvaluatorFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new EvaluatorFdt(this, (EvaluatorDataTable) table, values, linkedData);
	}
}
