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
 * class that represents structure of studentEnrollment
 */ 
public class StudentEnrollmentSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("studentId", 0, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.PrimaryKey), 
			new DbField("seasonId", 1, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("programId", 3, DefinedDataTypes.id, null, null, null, "program_id", ColumnType.RequiredData), 
			new DbField("levelSectionId", 4, DefinedDataTypes.id, null, null, null, "level_section_id", ColumnType.RequiredData), 
			new DbField("hallTicketPrinted", 5, DefinedDataTypes.bool, "false", null, null, "hall_ticket_printed", ColumnType.OptionalData), 
			new DbField("createdAt", 6, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 7, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT student_id, season_id, institute_id, program_id, level_section_id, hall_ticket_printed, created_at, updated_at FROM student_enrollments";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final  String INSERT = "INSERT INTO student_enrollments(student_id, season_id, institute_id, program_id, level_section_id, hall_ticket_printed, created_at, updated_at) values (?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5};
	private static final String WHERE = " WHERE student_id=? AND season_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1, 2};
	private static final  String UPDATE = "UPDATE student_enrollments SET program_id= ? , level_section_id= ? , hall_ticket_printed= ? , updated_at= CURRENT_TIMESTAMP  WHERE student_id=? AND season_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {3, 4, 5, 0, 1, 2};
	private static final String DELETE = "DELETE FROM student_enrollments";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public StudentEnrollmentSchema() {
		this.name = "studentEnrollment";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "student_enrollments";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(8, this.fields[2], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public StudentEnrollmentData newSchemaData() {
		return new StudentEnrollmentData(this, null);
	}

	@Override
	protected StudentEnrollmentData newSchemaData(final Object[] data) {
		return new StudentEnrollmentData(this, data);
	}

	@Override
	public StudentEnrollmentData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (StudentEnrollmentData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public StudentEnrollmentData parseKeys(JsonObject json, IServiceContext ctx) {
		return (StudentEnrollmentData) super.parseKeys(json, ctx);
	}

	@Override
	public StudentEnrollmentDataTable newSchemaDataTable() {
		return new StudentEnrollmentDataTable(this, null);
	}

	@Override
	protected StudentEnrollmentDataTable newSchemaDataTable(final Object[][] data) {
		return new StudentEnrollmentDataTable(this, data);
	}

	@Override
	public StudentEnrollmentDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (StudentEnrollmentDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
