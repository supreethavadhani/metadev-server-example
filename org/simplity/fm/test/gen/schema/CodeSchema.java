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
 * class that represents structure of code
 */ 
public class CodeSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("codeId", 0, DefinedDataTypes.id, null, null, null, "code_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectRegisterId", 2, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.RequiredData), 
			new DbField("testNameId", 3, DefinedDataTypes.id, null, null, null, "test_name_id", ColumnType.RequiredData), 
			new DbField("studentId", 4, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData), 
			new DbField("createdAt", 5, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 6, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT code_id, institute_id, subject_register_id, test_name_id, student_id, created_at, updated_at FROM codes";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final  String INSERT = "INSERT INTO codes(institute_id, subject_register_id, test_name_id, student_id, created_at, updated_at) values (?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4};
	private static final String WHERE = " WHERE code_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE codes SET subject_register_id= ? , test_name_id= ? , student_id= ? , updated_at= CURRENT_TIMESTAMP  WHERE code_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 0, 1};
	private static final String DELETE = "DELETE FROM codes";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public CodeSchema() {
		this.name = "code";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "codes";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(7, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "code_id", 0, null);
		this.initialize();
	}

	@Override
	public CodeData newSchemaData() {
		return new CodeData(this, null);
	}

	@Override
	protected CodeData newSchemaData(final Object[] data) {
		return new CodeData(this, data);
	}

	@Override
	public CodeData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (CodeData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public CodeData parseKeys(JsonObject json, IServiceContext ctx) {
		return (CodeData) super.parseKeys(json, ctx);
	}

	@Override
	public CodeDataTable newSchemaDataTable() {
		return new CodeDataTable(this, null);
	}

	@Override
	protected CodeDataTable newSchemaDataTable(final Object[][] data) {
		return new CodeDataTable(this, data);
	}

	@Override
	public CodeDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (CodeDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
