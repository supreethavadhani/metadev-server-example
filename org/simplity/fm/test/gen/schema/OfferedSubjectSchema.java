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
 * class that represents structure of offeredSubject
 */ 
public class OfferedSubjectSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectId", 2, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.RequiredData), 
			new DbField("seasonId", 3, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.RequiredData), 
			new DbField("departmentId", 4, DefinedDataTypes.id, null, null, null, "department_id", ColumnType.RequiredData), 
			new DbField("degreeId", 5, DefinedDataTypes.id, null, null, "degreeList", "degree_id", ColumnType.RequiredData), 
			new DbField("levelId", 6, DefinedDataTypes.id, null, null, null, "level_id", ColumnType.RequiredData), 
			new DbField("isIntegrated", 7, DefinedDataTypes.bool, "false", null, null, "is_integrated", ColumnType.OptionalData), 
			new DbField("isChild", 8, DefinedDataTypes.bool, "false", null, null, "is_child", ColumnType.OptionalData), 
			new DbField("assessmentSchemeId", 9, DefinedDataTypes.id, null, null, null, "assessment_scheme_id", ColumnType.RequiredData), 
			new DbField("cieFrozen", 10, DefinedDataTypes.bool, "false", null, null, "cie_frozen", ColumnType.OptionalData), 
			new DbField("attendanceFrozen", 11, DefinedDataTypes.bool, "false", null, null, "attendance_frozen", ColumnType.OptionalData), 
			new DbField("createdAt", 12, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 13, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT offered_subject_id, institute_id, subject_id, season_id, department_id, degree_id, level_id, is_integrated, is_child, assessment_scheme_id, cie_frozen, attendance_frozen, created_at, updated_at FROM offered_subjects";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private static final  String INSERT = "INSERT INTO offered_subjects(institute_id, subject_id, season_id, department_id, degree_id, level_id, is_integrated, is_child, assessment_scheme_id, cie_frozen, attendance_frozen, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	private static final String WHERE = " WHERE offered_subject_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE offered_subjects SET subject_id= ? , season_id= ? , department_id= ? , degree_id= ? , level_id= ? , is_integrated= ? , is_child= ? , assessment_scheme_id= ? , cie_frozen= ? , attendance_frozen= ? , updated_at= CURRENT_TIMESTAMP  WHERE offered_subject_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 1};
	private static final String DELETE = "DELETE FROM offered_subjects";
	private static final IValidation[] VALIDS = {new DependentListValidation(6, 5, "levelList", "levelId", null),
		new DependentListValidation(9, 5, "levelList", "assessmentSchemeId", null)
	};

	/**
	 *
	 */
	public OfferedSubjectSchema() {
		this.name = "offeredSubject";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "offered_subjects";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(14, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "offered_subject_id", 0, null);
		this.initialize();
	}

	@Override
	public OfferedSubjectData newSchemaData() {
		return new OfferedSubjectData(this, null);
	}

	@Override
	protected OfferedSubjectData newSchemaData(final Object[] data) {
		return new OfferedSubjectData(this, data);
	}

	@Override
	public OfferedSubjectData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (OfferedSubjectData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public OfferedSubjectData parseKeys(JsonObject json, IServiceContext ctx) {
		return (OfferedSubjectData) super.parseKeys(json, ctx);
	}

	@Override
	public OfferedSubjectDataTable newSchemaDataTable() {
		return new OfferedSubjectDataTable(this, null);
	}

	@Override
	protected OfferedSubjectDataTable newSchemaDataTable(final Object[][] data) {
		return new OfferedSubjectDataTable(this, data);
	}

	@Override
	public OfferedSubjectDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (OfferedSubjectDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
