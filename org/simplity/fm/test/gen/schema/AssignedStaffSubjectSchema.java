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
 * class that represents structure of assignedStaffSubject
 */ 
public class AssignedStaffSubjectSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("staffId", 1, DefinedDataTypes.id, null, null, null, "staff_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectId", 3, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.RequiredData), 
			new DbField("seasonId", 4, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.RequiredData), 
			new DbField("createdAt", 5, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 6, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT offered_subject_id, staff_id, institute_id, subject_id, season_id, created_at, updated_at FROM assigned_staff_subjects";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final  String INSERT = "INSERT INTO assigned_staff_subjects(offered_subject_id, staff_id, institute_id, subject_id, season_id, created_at, updated_at) values (?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4};
	private static final String WHERE = " WHERE staff_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {1, 2};
	private static final  String UPDATE = "UPDATE assigned_staff_subjects SET offered_subject_id= ? , subject_id= ? , season_id= ? , updated_at= CURRENT_TIMESTAMP  WHERE staff_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {0, 3, 4, 1, 2};
	private static final String DELETE = "DELETE FROM assigned_staff_subjects";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AssignedStaffSubjectSchema() {
		this.name = "assignedStaffSubject";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "assigned_staff_subjects";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(7, this.fields[2], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public AssignedStaffSubjectData newSchemaData() {
		return new AssignedStaffSubjectData(this, null);
	}

	@Override
	protected AssignedStaffSubjectData newSchemaData(final Object[] data) {
		return new AssignedStaffSubjectData(this, data);
	}

	@Override
	public AssignedStaffSubjectData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AssignedStaffSubjectData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AssignedStaffSubjectData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AssignedStaffSubjectData) super.parseKeys(json, ctx);
	}

	@Override
	public AssignedStaffSubjectDataTable newSchemaDataTable() {
		return new AssignedStaffSubjectDataTable(this, null);
	}

	@Override
	protected AssignedStaffSubjectDataTable newSchemaDataTable(final Object[][] data) {
		return new AssignedStaffSubjectDataTable(this, data);
	}

	@Override
	public AssignedStaffSubjectDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AssignedStaffSubjectDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
