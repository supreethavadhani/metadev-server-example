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
 * class that represents structure of evaluator
 */ 
public class EvaluatorSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.PrimaryKey), 
			new DbField("evaluatorId", 1, DefinedDataTypes.id, null, null, null, "evaluator_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("isExternal", 3, DefinedDataTypes.bool, null, null, null, "is_external", ColumnType.OptionalData), 
			new DbField("name", 4, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("email", 5, DefinedDataTypes.text, null, null, null, "email", ColumnType.OptionalData), 
			new DbField("phoneNumber", 6, DefinedDataTypes.text, null, null, null, "phone_number", ColumnType.OptionalData), 
			new DbField("subjectId", 7, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.RequiredData), 
			new DbField("seasonId", 8, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT offered_subject_id, evaluator_id, institute_id, is_external, name, email, phone_number, subject_id, season_id FROM evaluators";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8};
	private static final  String INSERT = "INSERT INTO evaluators(offered_subject_id, evaluator_id, institute_id, is_external, name, email, phone_number, subject_id, season_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8};
	private static final String WHERE = " WHERE offered_subject_id=? AND evaluator_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1, 2};
	private static final  String UPDATE = "UPDATE evaluators SET is_external= ? , name= ? , email= ? , phone_number= ? , subject_id= ? , season_id= ?  WHERE offered_subject_id=? AND evaluator_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {3, 4, 5, 6, 7, 8, 0, 1, 2};
	private static final String DELETE = "DELETE FROM evaluators";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public EvaluatorSchema() {
		this.name = "evaluator";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "evaluators";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(9, this.fields[2], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public EvaluatorData newSchemaData() {
		return new EvaluatorData(this, null);
	}

	@Override
	protected EvaluatorData newSchemaData(final Object[] data) {
		return new EvaluatorData(this, data);
	}

	@Override
	public EvaluatorData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (EvaluatorData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public EvaluatorData parseKeys(JsonObject json, IServiceContext ctx) {
		return (EvaluatorData) super.parseKeys(json, ctx);
	}

	@Override
	public EvaluatorDataTable newSchemaDataTable() {
		return new EvaluatorDataTable(this, null);
	}

	@Override
	protected EvaluatorDataTable newSchemaDataTable(final Object[][] data) {
		return new EvaluatorDataTable(this, data);
	}

	@Override
	public EvaluatorDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (EvaluatorDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
