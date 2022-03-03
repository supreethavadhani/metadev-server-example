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
 * class that represents structure of subject
 */ 
public class SubjectSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectId", 0, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("departmentId", 2, DefinedDataTypes.id, null, null, "departmentList", "department_id", ColumnType.RequiredData), 
			new DbField("subjectTypeId", 3, DefinedDataTypes.id, null, null, "subjectTypeList", "subject_type_id", ColumnType.RequiredData), 
			new DbField("name", 4, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("code", 5, DefinedDataTypes.code, null, null, null, "code", ColumnType.RequiredData), 
			new DbField("lectureCredits", 6, DefinedDataTypes.integer, "0", null, null, "lecture_credits", ColumnType.RequiredData), 
			new DbField("practicalCredits", 7, DefinedDataTypes.integer, "0", null, null, "practical_credits", ColumnType.RequiredData), 
			new DbField("tutorialCredits", 8, DefinedDataTypes.integer, "0", null, null, "tutorial_credits", ColumnType.RequiredData), 
			new DbField("totalCredits", 9, DefinedDataTypes.integer, "0", null, null, "total_credits", ColumnType.RequiredData), 
			new DbField("parentId", 10, DefinedDataTypes.id, "0", null, null, "parent_id", ColumnType.OptionalData), 
			new DbField("isElective", 11, DefinedDataTypes.bool, "false", null, null, "is_elective", ColumnType.OptionalData), 
			new DbField("isIntegrated", 12, DefinedDataTypes.bool, "false", null, null, "is_integrated", ColumnType.OptionalData), 
			new DbField("packetPrefix", 13, DefinedDataTypes.text, null, null, null, "packet_prefix", ColumnType.OptionalData), 
			new DbField("isActive", 14, DefinedDataTypes.bool, "true", null, null, "is_active", ColumnType.OptionalData), 
			new DbField("createdAt", 15, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 16, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT subject_id, institute_id, department_id, subject_type_id, name, code, lecture_credits, practical_credits, tutorial_credits, total_credits, parent_id, is_elective, is_integrated, packet_prefix, is_active, created_at, updated_at FROM subjects";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
	private static final  String INSERT = "INSERT INTO subjects(institute_id, department_id, subject_type_id, name, code, lecture_credits, practical_credits, tutorial_credits, total_credits, parent_id, is_elective, is_integrated, packet_prefix, is_active, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	private static final String WHERE = " WHERE subject_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE subjects SET department_id= ? , subject_type_id= ? , name= ? , code= ? , lecture_credits= ? , practical_credits= ? , tutorial_credits= ? , total_credits= ? , parent_id= ? , is_elective= ? , is_integrated= ? , packet_prefix= ? , is_active= ? , updated_at= CURRENT_TIMESTAMP  WHERE subject_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 0, 1};
	private static final String DELETE = "DELETE FROM subjects";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public SubjectSchema() {
		this.name = "subject";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "subjects";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(17, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "subject_id", 0, null);
		this.initialize();
	}

	@Override
	public SubjectData newSchemaData() {
		return new SubjectData(this, null);
	}

	@Override
	protected SubjectData newSchemaData(final Object[] data) {
		return new SubjectData(this, data);
	}

	@Override
	public SubjectData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (SubjectData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public SubjectData parseKeys(JsonObject json, IServiceContext ctx) {
		return (SubjectData) super.parseKeys(json, ctx);
	}

	@Override
	public SubjectDataTable newSchemaDataTable() {
		return new SubjectDataTable(this, null);
	}

	@Override
	protected SubjectDataTable newSchemaDataTable(final Object[][] data) {
		return new SubjectDataTable(this, data);
	}

	@Override
	public SubjectDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (SubjectDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
