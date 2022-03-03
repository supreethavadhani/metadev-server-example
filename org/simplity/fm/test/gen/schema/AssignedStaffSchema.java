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
 * class that represents structure of assignedStaff
 */ 
public class AssignedStaffSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectSectionId", 0, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.PrimaryKey), 
			new DbField("staffId", 1, DefinedDataTypes.id, null, null, null, "staff_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("offeredSubjectId", 3, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("subjectId", 4, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.RequiredData), 
			new DbField("sectionId", 5, DefinedDataTypes.id, null, null, null, "section_id", ColumnType.RequiredData), 
			new DbField("seasonId", 6, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.RequiredData), 
			new DbField("createdAt", 7, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 8, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT subject_section_id, staff_id, institute_id, offered_subject_id, subject_id, section_id, season_id, created_at, updated_at FROM assigned_staffs";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8};
	private static final  String INSERT = "INSERT INTO assigned_staffs(subject_section_id, staff_id, institute_id, offered_subject_id, subject_id, section_id, season_id, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final String WHERE = " WHERE subject_section_id=? AND staff_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1, 2};
	private static final  String UPDATE = "UPDATE assigned_staffs SET offered_subject_id= ? , subject_id= ? , section_id= ? , season_id= ? , updated_at= CURRENT_TIMESTAMP  WHERE subject_section_id=? AND staff_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {3, 4, 5, 6, 0, 1, 2};
	private static final String DELETE = "DELETE FROM assigned_staffs";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AssignedStaffSchema() {
		this.name = "assignedStaff";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "assigned_staffs";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(9, this.fields[2], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public AssignedStaffData newSchemaData() {
		return new AssignedStaffData(this, null);
	}

	@Override
	protected AssignedStaffData newSchemaData(final Object[] data) {
		return new AssignedStaffData(this, data);
	}

	@Override
	public AssignedStaffData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AssignedStaffData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AssignedStaffData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AssignedStaffData) super.parseKeys(json, ctx);
	}

	@Override
	public AssignedStaffDataTable newSchemaDataTable() {
		return new AssignedStaffDataTable(this, null);
	}

	@Override
	protected AssignedStaffDataTable newSchemaDataTable(final Object[][] data) {
		return new AssignedStaffDataTable(this, data);
	}

	@Override
	public AssignedStaffDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AssignedStaffDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
