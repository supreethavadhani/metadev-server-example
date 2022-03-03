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
 * class that represents structure of evaluationType
 */ 
public class EvaluationTypeSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("evlutionTypeId", 0, DefinedDataTypes.id, null, null, null, "evalution_type_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("code", 3, DefinedDataTypes.code, null, null, null, "code", ColumnType.OptionalData), 
			new DbField("createdAt", 4, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 5, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT evalution_type_id, institute_id, name, code, created_at, updated_at FROM evalution_types";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5};
	private static final  String INSERT = "INSERT INTO evalution_types(institute_id, name, code, created_at, updated_at) values (?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3};
	private static final String WHERE = " WHERE evalution_type_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE evalution_types SET name= ? , code= ? , updated_at= CURRENT_TIMESTAMP  WHERE evalution_type_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 0, 1};
	private static final String DELETE = "DELETE FROM evalution_types";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public EvaluationTypeSchema() {
		this.name = "evaluationType";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "evalution_types";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(6, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "evalution_type_id", 0, null);
		this.initialize();
	}

	@Override
	public EvaluationTypeData newSchemaData() {
		return new EvaluationTypeData(this, null);
	}

	@Override
	protected EvaluationTypeData newSchemaData(final Object[] data) {
		return new EvaluationTypeData(this, data);
	}

	@Override
	public EvaluationTypeData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (EvaluationTypeData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public EvaluationTypeData parseKeys(JsonObject json, IServiceContext ctx) {
		return (EvaluationTypeData) super.parseKeys(json, ctx);
	}

	@Override
	public EvaluationTypeDataTable newSchemaDataTable() {
		return new EvaluationTypeDataTable(this, null);
	}

	@Override
	protected EvaluationTypeDataTable newSchemaDataTable(final Object[][] data) {
		return new EvaluationTypeDataTable(this, data);
	}

	@Override
	public EvaluationTypeDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (EvaluationTypeDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
