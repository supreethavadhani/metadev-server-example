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
 * class that represents structure of resultType
 */ 
public class ResultTypeSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("resultTypeId", 0, DefinedDataTypes.id, null, null, null, "result_type_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("code", 3, DefinedDataTypes.code, null, null, null, "code", ColumnType.OptionalData), 
			new DbField("maxMarks", 4, DefinedDataTypes.integer, null, null, null, "max_marks", ColumnType.RequiredData), 
			new DbField("requiresOtherResults", 5, DefinedDataTypes.name, "false", null, null, "requires_other_results", ColumnType.OptionalData), 
			new DbField("eligibilityMeasure", 6, DefinedDataTypes.bool, "false", null, null, "eligibility_measure", ColumnType.OptionalData), 
			new DbField("isActive", 7, DefinedDataTypes.bool, "true", null, null, "is_active", ColumnType.OptionalData), 
			new DbField("createdAt", 8, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 9, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT result_type_id, institute_id, name, code, max_marks, requires_other_results, eligibility_measure, is_active, created_at, updated_at FROM result_types";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final  String INSERT = "INSERT INTO result_types(institute_id, name, code, max_marks, requires_other_results, eligibility_measure, is_active, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6, 7};
	private static final String WHERE = " WHERE result_type_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE result_types SET name= ? , code= ? , max_marks= ? , requires_other_results= ? , eligibility_measure= ? , is_active= ? , updated_at= CURRENT_TIMESTAMP  WHERE result_type_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 0, 1};
	private static final String DELETE = "DELETE FROM result_types";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public ResultTypeSchema() {
		this.name = "resultType";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "result_types";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(10, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "result_type_id", 0, null);
		this.initialize();
	}

	@Override
	public ResultTypeData newSchemaData() {
		return new ResultTypeData(this, null);
	}

	@Override
	protected ResultTypeData newSchemaData(final Object[] data) {
		return new ResultTypeData(this, data);
	}

	@Override
	public ResultTypeData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ResultTypeData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ResultTypeData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ResultTypeData) super.parseKeys(json, ctx);
	}

	@Override
	public ResultTypeDataTable newSchemaDataTable() {
		return new ResultTypeDataTable(this, null);
	}

	@Override
	protected ResultTypeDataTable newSchemaDataTable(final Object[][] data) {
		return new ResultTypeDataTable(this, data);
	}

	@Override
	public ResultTypeDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ResultTypeDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
