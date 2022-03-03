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
 * class that represents structure of season
 */ 
public class SeasonSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("seasonId", 0, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("code", 3, DefinedDataTypes.code, null, null, null, "code", ColumnType.OptionalData), 
			new DbField("courseRegStartDate", 4, DefinedDataTypes.date, null, null, null, "course_reg_start_date", ColumnType.OptionalData), 
			new DbField("courseRegEndDate", 5, DefinedDataTypes.date, null, null, null, "course_reg_end_date", ColumnType.OptionalData), 
			new DbField("seasonStartDate", 6, DefinedDataTypes.date, null, null, null, "season_start_date", ColumnType.OptionalData), 
			new DbField("seasonEndDate", 7, DefinedDataTypes.date, null, null, null, "season_end_date", ColumnType.OptionalData), 
			new DbField("attendanceEntryFrozen", 8, DefinedDataTypes.bool, "false", null, null, "attendance_entry_frozen", ColumnType.OptionalData), 
			new DbField("cieEntryFrozen", 9, DefinedDataTypes.bool, "false", null, null, "cie_entry_frozen", ColumnType.OptionalData), 
			new DbField("answerPacketPrefix", 10, DefinedDataTypes.text, "-", null, null, "answer_packet_prefix", ColumnType.RequiredData), 
			new DbField("makeupExamInitiated", 11, DefinedDataTypes.bool, "false", null, null, "makeup_exam_initiated", ColumnType.OptionalData), 
			new DbField("currentValuationRound", 12, DefinedDataTypes.integer, "0", null, null, "current_valuation_round", ColumnType.OptionalData), 
			new DbField("isActive", 13, DefinedDataTypes.bool, "true", null, null, "is_active", ColumnType.OptionalData), 
			new DbField("createdAt", 14, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 15, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, false, false, false, false, false};
	private static final String SELECT = "SELECT season_id, institute_id, name, code, course_reg_start_date, course_reg_end_date, season_start_date, season_end_date, attendance_entry_frozen, cie_entry_frozen, answer_packet_prefix, makeup_exam_initiated, current_valuation_round, is_active, created_at, updated_at FROM seasons";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	private static final  String INSERT = "INSERT INTO seasons(institute_id, name, code, course_reg_start_date, course_reg_end_date, season_start_date, season_end_date, attendance_entry_frozen, cie_entry_frozen, answer_packet_prefix, makeup_exam_initiated, current_valuation_round, is_active, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private static final String WHERE = " WHERE season_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE seasons SET name= ? , code= ? , course_reg_start_date= ? , course_reg_end_date= ? , season_start_date= ? , season_end_date= ? , attendance_entry_frozen= ? , cie_entry_frozen= ? , answer_packet_prefix= ? , makeup_exam_initiated= ? , current_valuation_round= ? , is_active= ? , updated_at= CURRENT_TIMESTAMP  WHERE season_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 1};
	private static final String DELETE = "DELETE FROM seasons";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public SeasonSchema() {
		this.name = "season";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "seasons";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(16, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "season_id", 0, null);
		this.initialize();
	}

	@Override
	public SeasonData newSchemaData() {
		return new SeasonData(this, null);
	}

	@Override
	protected SeasonData newSchemaData(final Object[] data) {
		return new SeasonData(this, data);
	}

	@Override
	public SeasonData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (SeasonData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public SeasonData parseKeys(JsonObject json, IServiceContext ctx) {
		return (SeasonData) super.parseKeys(json, ctx);
	}

	@Override
	public SeasonDataTable newSchemaDataTable() {
		return new SeasonDataTable(this, null);
	}

	@Override
	protected SeasonDataTable newSchemaDataTable(final Object[][] data) {
		return new SeasonDataTable(this, data);
	}

	@Override
	public SeasonDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (SeasonDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
