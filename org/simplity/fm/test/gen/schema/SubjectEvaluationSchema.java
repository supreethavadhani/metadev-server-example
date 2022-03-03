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
 * class that represents structure of subjectEvaluation
 */ 
public class SubjectEvaluationSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectEvaluationId", 0, DefinedDataTypes.id, null, null, null, "subject_evaluation_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectRegisterId", 2, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.RequiredData), 
			new DbField("testNameId", 3, DefinedDataTypes.id, null, null, null, "test_name_id", ColumnType.RequiredData), 
			new DbField("evaluationTypeId", 4, DefinedDataTypes.id, null, null, null, "evalution_type_id", ColumnType.RequiredData), 
			new DbField("createdAt", 5, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 6, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT subject_evaluation_id, institute_id, subject_register_id, test_name_id, evalution_type_id, created_at, updated_at FROM subject_evaluations";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final  String INSERT = "INSERT INTO subject_evaluations(institute_id, subject_register_id, test_name_id, evalution_type_id, created_at, updated_at) values (?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4};
	private static final String WHERE = " WHERE subject_evaluation_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE subject_evaluations SET subject_register_id= ? , test_name_id= ? , evalution_type_id= ? , updated_at= CURRENT_TIMESTAMP  WHERE subject_evaluation_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 0, 1};
	private static final String DELETE = "DELETE FROM subject_evaluations";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public SubjectEvaluationSchema() {
		this.name = "subjectEvaluation";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "subject_evaluations";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(7, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "subject_evaluation_id", 0, null);
		this.initialize();
	}

	@Override
	public SubjectEvaluationData newSchemaData() {
		return new SubjectEvaluationData(this, null);
	}

	@Override
	protected SubjectEvaluationData newSchemaData(final Object[] data) {
		return new SubjectEvaluationData(this, data);
	}

	@Override
	public SubjectEvaluationData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (SubjectEvaluationData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public SubjectEvaluationData parseKeys(JsonObject json, IServiceContext ctx) {
		return (SubjectEvaluationData) super.parseKeys(json, ctx);
	}

	@Override
	public SubjectEvaluationDataTable newSchemaDataTable() {
		return new SubjectEvaluationDataTable(this, null);
	}

	@Override
	protected SubjectEvaluationDataTable newSchemaDataTable(final Object[][] data) {
		return new SubjectEvaluationDataTable(this, data);
	}

	@Override
	public SubjectEvaluationDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (SubjectEvaluationDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
