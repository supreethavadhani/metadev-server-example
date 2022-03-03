package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.DbField;
import org.simplity.fm.core.data.Schema;
import org.simplity.fm.core.validn.IValidation;
import org.simplity.fm.core.data.DbAssistant;
import org.simplity.fm.core.service.IServiceContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.data.ColumnType;
import org.simplity.fm.core.validn.DependentListValidation;
import org.simplity.fm.test.gen.DefinedDataTypes;

/**
 * class that represents structure of assignableEvaluator
 */ 
public class AssignableEvaluatorSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("evaluatorId", 0, DefinedDataTypes.id, null, null, null, "evaluator_id", ColumnType.RequiredData), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("isExternal", 2, DefinedDataTypes.bool, null, null, null, "is_external", ColumnType.OptionalData), 
			new DbField("evaluatorType", 3, DefinedDataTypes.name, null, null, null, "evaluator_type", ColumnType.OptionalData), 
			new DbField("name", 4, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("email", 5, DefinedDataTypes.text, null, null, null, "email", ColumnType.OptionalData), 
			new DbField("phoneNumber", 6, DefinedDataTypes.text, null, null, null, "phone_number", ColumnType.OptionalData), 
			new DbField("department", 7, DefinedDataTypes.text, null, null, null, "department", ColumnType.OptionalData), 
			new DbField("isAssigned", 8, DefinedDataTypes.bool, "false", null, null, null, ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT evaluator_id, institute_id, is_external, evaluator_type, name, email, phone_number, department, null FROM assignable_evaluators";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AssignableEvaluatorSchema() {
		this.name = "assignableEvaluator";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "assignable_evaluators";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(9, this.fields[1], SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public AssignableEvaluatorData newSchemaData() {
		return new AssignableEvaluatorData(this, null);
	}

	@Override
	protected AssignableEvaluatorData newSchemaData(final Object[] data) {
		return new AssignableEvaluatorData(this, data);
	}

	@Override
	public AssignableEvaluatorData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AssignableEvaluatorData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AssignableEvaluatorData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AssignableEvaluatorData) super.parseKeys(json, ctx);
	}

	@Override
	public AssignableEvaluatorDataTable newSchemaDataTable() {
		return new AssignableEvaluatorDataTable(this, null);
	}

	@Override
	protected AssignableEvaluatorDataTable newSchemaDataTable(final Object[][] data) {
		return new AssignableEvaluatorDataTable(this, data);
	}

	@Override
	public AssignableEvaluatorDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AssignableEvaluatorDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
