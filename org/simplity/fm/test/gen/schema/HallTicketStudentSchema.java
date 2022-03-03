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
 * class that represents structure of hallTicketStudent
 */ 
public class HallTicketStudentSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("studentId", 0, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("seasonId", 2, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.RequiredData), 
			new DbField("programId", 3, DefinedDataTypes.id, null, null, null, "program_id", ColumnType.RequiredData), 
			new DbField("levelId", 4, DefinedDataTypes.id, null, null, null, "level_id", ColumnType.RequiredData), 
			new DbField("levelName", 5, DefinedDataTypes.text, null, null, null, "level_name", ColumnType.RequiredData), 
			new DbField("studentName", 6, DefinedDataTypes.text, null, null, null, "student_name", ColumnType.RequiredData), 
			new DbField("usn", 7, DefinedDataTypes.text, null, null, null, "usn", ColumnType.RequiredData), 
			new DbField("programName", 8, DefinedDataTypes.text, null, null, null, "program_name", ColumnType.RequiredData), 
			new DbField("departmentName", 9, DefinedDataTypes.text, null, null, null, "department_name", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT student_id, institute_id, season_id, program_id, level_id, level_name, student_name, usn, program_name, department_name FROM current_enrolled_students";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final  String INSERT = "INSERT INTO current_enrolled_students(student_id, institute_id, season_id, program_id, level_id, level_name, student_name, usn, program_name, department_name) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final String WHERE = " WHERE student_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE current_enrolled_students SET season_id= ? , program_id= ? , level_id= ? , level_name= ? , student_name= ? , usn= ? , program_name= ? , department_name= ?  WHERE student_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
	private static final String DELETE = "DELETE FROM current_enrolled_students";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public HallTicketStudentSchema() {
		this.name = "hallTicketStudent";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "current_enrolled_students";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(10, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public HallTicketStudentData newSchemaData() {
		return new HallTicketStudentData(this, null);
	}

	@Override
	protected HallTicketStudentData newSchemaData(final Object[] data) {
		return new HallTicketStudentData(this, data);
	}

	@Override
	public HallTicketStudentData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (HallTicketStudentData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public HallTicketStudentData parseKeys(JsonObject json, IServiceContext ctx) {
		return (HallTicketStudentData) super.parseKeys(json, ctx);
	}

	@Override
	public HallTicketStudentDataTable newSchemaDataTable() {
		return new HallTicketStudentDataTable(this, null);
	}

	@Override
	protected HallTicketStudentDataTable newSchemaDataTable(final Object[][] data) {
		return new HallTicketStudentDataTable(this, data);
	}

	@Override
	public HallTicketStudentDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (HallTicketStudentDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
