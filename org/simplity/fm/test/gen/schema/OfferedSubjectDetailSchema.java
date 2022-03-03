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
 * class that represents structure of offeredSubjectDetail
 */ 
public class OfferedSubjectDetailSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectId", 0, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.PrimaryKey), 
			new DbField("seasonId", 1, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.PrimaryKey), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("code", 3, DefinedDataTypes.text, null, null, null, "code", ColumnType.OptionalData), 
			new DbField("isIntegrated", 4, DefinedDataTypes.bool, "false", null, null, "is_integrated", ColumnType.OptionalData), 
			new DbField("isChild", 5, DefinedDataTypes.bool, "false", null, null, "is_child", ColumnType.OptionalData), 
			new DbField("offeredSubjectId", 6, DefinedDataTypes.id, "0", null, null, "offered_subject_id", ColumnType.OptionalData), 
			new DbField("degreeId", 7, DefinedDataTypes.id, "0", null, "degreeList", "degree_id", ColumnType.RequiredData), 
			new DbField("levelId", 8, DefinedDataTypes.id, "0", null, null, "level_id", ColumnType.RequiredData), 
			new DbField("nbrEnrolled", 9, DefinedDataTypes.integer, "0", null, null, "nbr_enrolled", ColumnType.OptionalData), 
			new DbField("cieFrozen", 10, DefinedDataTypes.bool, "false", null, null, "cie_frozen", ColumnType.OptionalData), 
			new DbField("attendanceFrozen", 11, DefinedDataTypes.bool, "false", null, null, "attendance_frozen", ColumnType.OptionalData), 
			new DbField("canBeWithdrawn", 12, DefinedDataTypes.bool, "true", null, null, "can_be_withdrawn", ColumnType.OptionalData), 
			new DbField("isOffered", 13, DefinedDataTypes.bool, "false", null, null, "is_offered", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, false, false, true, false};
	private static final String SELECT = "SELECT subject_id, season_id, name, code, is_integrated, is_child, offered_subject_id, degree_id, level_id, nbr_enrolled, cie_frozen, attendance_frozen, can_be_withdrawn, is_offered FROM offered_subject_details";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private static final  String INSERT = "INSERT INTO offered_subject_details(subject_id, season_id, name, code, is_integrated, is_child, offered_subject_id, degree_id, level_id, nbr_enrolled, cie_frozen, attendance_frozen, can_be_withdrawn, is_offered) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private static final String WHERE = " WHERE subject_id=? AND season_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE offered_subject_details SET name= ? , code= ? , is_integrated= ? , is_child= ? , offered_subject_id= ? , degree_id= ? , level_id= ? , nbr_enrolled= ? , cie_frozen= ? , attendance_frozen= ? , can_be_withdrawn= ? , is_offered= ?  WHERE subject_id=? AND season_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 1};
	private static final String DELETE = "DELETE FROM offered_subject_details";
	private static final IValidation[] VALIDS = {new DependentListValidation(8, 7, "levelList", "levelId", null)
	};

	/**
	 *
	 */
	public OfferedSubjectDetailSchema() {
		this.name = "offeredSubjectDetail";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "offered_subject_details";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(14, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public OfferedSubjectDetailData newSchemaData() {
		return new OfferedSubjectDetailData(this, null);
	}

	@Override
	protected OfferedSubjectDetailData newSchemaData(final Object[] data) {
		return new OfferedSubjectDetailData(this, data);
	}

	@Override
	public OfferedSubjectDetailData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (OfferedSubjectDetailData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public OfferedSubjectDetailData parseKeys(JsonObject json, IServiceContext ctx) {
		return (OfferedSubjectDetailData) super.parseKeys(json, ctx);
	}

	@Override
	public OfferedSubjectDetailDataTable newSchemaDataTable() {
		return new OfferedSubjectDetailDataTable(this, null);
	}

	@Override
	protected OfferedSubjectDetailDataTable newSchemaDataTable(final Object[][] data) {
		return new OfferedSubjectDetailDataTable(this, data);
	}

	@Override
	public OfferedSubjectDetailDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (OfferedSubjectDetailDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
