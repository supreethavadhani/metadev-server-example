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
 * class that represents structure of program
 */ 
public class ProgramSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("programId", 0, DefinedDataTypes.id, null, null, null, "program_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("degreeId", 2, DefinedDataTypes.id, null, null, "degreeList", "degree_id", ColumnType.RequiredData), 
			new DbField("departmentId", 3, DefinedDataTypes.id, null, null, "departmentList", "department_id", ColumnType.RequiredData), 
			new DbField("name", 4, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("code", 5, DefinedDataTypes.code, null, null, null, "code", ColumnType.OptionalData), 
			new DbField("createdAt", 6, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 7, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT program_id, institute_id, degree_id, department_id, name, code, created_at, updated_at FROM programs";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final  String INSERT = "INSERT INTO programs(institute_id, degree_id, department_id, name, code, created_at, updated_at) values (?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5};
	private static final String WHERE = " WHERE program_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE programs SET degree_id= ? , department_id= ? , name= ? , code= ? , updated_at= CURRENT_TIMESTAMP  WHERE program_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 0, 1};
	private static final String DELETE = "DELETE FROM programs";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public ProgramSchema() {
		this.name = "program";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "programs";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(8, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "program_id", 0, null);
		this.initialize();
	}

	@Override
	public ProgramData newSchemaData() {
		return new ProgramData(this, null);
	}

	@Override
	protected ProgramData newSchemaData(final Object[] data) {
		return new ProgramData(this, data);
	}

	@Override
	public ProgramData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ProgramData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ProgramData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ProgramData) super.parseKeys(json, ctx);
	}

	@Override
	public ProgramDataTable newSchemaDataTable() {
		return new ProgramDataTable(this, null);
	}

	@Override
	protected ProgramDataTable newSchemaDataTable(final Object[][] data) {
		return new ProgramDataTable(this, data);
	}

	@Override
	public ProgramDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ProgramDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
