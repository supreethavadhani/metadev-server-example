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
 * class that represents structure of subjectResult
 */ 
public class SubjectResultSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectResultId", 0, DefinedDataTypes.id, null, null, null, "subject_result_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectId", 2, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.RequiredData), 
			new DbField("resultTypeId", 3, DefinedDataTypes.id, null, null, null, "result_type_id", ColumnType.RequiredData), 
			new DbField("createdAt", 4, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 5, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT subject_result_id, institute_id, subject_id, result_type_id, created_at, updated_at FROM subject_results";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5};
	private static final  String INSERT = "INSERT INTO subject_results(institute_id, subject_id, result_type_id, created_at, updated_at) values (?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3};
	private static final String WHERE = " WHERE subject_result_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE subject_results SET subject_id= ? , result_type_id= ? , updated_at= CURRENT_TIMESTAMP  WHERE subject_result_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 0, 1};
	private static final String DELETE = "DELETE FROM subject_results";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public SubjectResultSchema() {
		this.name = "subjectResult";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "subject_results";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(6, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "subject_result_id", 0, null);
		this.initialize();
	}

	@Override
	public SubjectResultData newSchemaData() {
		return new SubjectResultData(this, null);
	}

	@Override
	protected SubjectResultData newSchemaData(final Object[] data) {
		return new SubjectResultData(this, data);
	}

	@Override
	public SubjectResultData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (SubjectResultData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public SubjectResultData parseKeys(JsonObject json, IServiceContext ctx) {
		return (SubjectResultData) super.parseKeys(json, ctx);
	}

	@Override
	public SubjectResultDataTable newSchemaDataTable() {
		return new SubjectResultDataTable(this, null);
	}

	@Override
	protected SubjectResultDataTable newSchemaDataTable(final Object[][] data) {
		return new SubjectResultDataTable(this, data);
	}

	@Override
	public SubjectResultDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (SubjectResultDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
