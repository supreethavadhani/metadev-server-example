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
 * class that represents structure of level
 */ 
public class LevelSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("levelId", 0, DefinedDataTypes.id, null, null, null, "level_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("degreeId", 2, DefinedDataTypes.id, null, null, null, "degree_id", ColumnType.RequiredData), 
			new DbField("levelSeq", 3, DefinedDataTypes.integer, null, null, null, "level_seq", ColumnType.RequiredData), 
			new DbField("name", 4, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("code", 5, DefinedDataTypes.code, null, null, null, "code", ColumnType.OptionalData), 
			new DbField("createdAt", 6, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 7, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {false, true, true, true, true, true};
	private static final String SELECT = "SELECT level_id, institute_id, degree_id, level_seq, name, code, created_at, updated_at FROM levels";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final  String INSERT = "INSERT INTO levels(institute_id, degree_id, level_seq, name, code, created_at, updated_at) values (?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5};
	private static final String WHERE = " WHERE level_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE levels SET degree_id= ? , level_seq= ? , name= ? , code= ? , updated_at= CURRENT_TIMESTAMP  WHERE level_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 0, 1};
	private static final String DELETE = "DELETE FROM levels";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public LevelSchema() {
		this.name = "level";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "levels";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(8, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "level_id", 0, null);
		this.initialize();
	}

	@Override
	public LevelData newSchemaData() {
		return new LevelData(this, null);
	}

	@Override
	protected LevelData newSchemaData(final Object[] data) {
		return new LevelData(this, data);
	}

	@Override
	public LevelData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (LevelData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public LevelData parseKeys(JsonObject json, IServiceContext ctx) {
		return (LevelData) super.parseKeys(json, ctx);
	}

	@Override
	public LevelDataTable newSchemaDataTable() {
		return new LevelDataTable(this, null);
	}

	@Override
	protected LevelDataTable newSchemaDataTable(final Object[][] data) {
		return new LevelDataTable(this, data);
	}

	@Override
	public LevelDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (LevelDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
