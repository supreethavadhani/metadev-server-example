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
 * class that represents structure of subjectRegister
 */ 
public class SubjectRegisterSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectId", 2, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.RequiredData), 
			new DbField("sectionId", 3, DefinedDataTypes.id, null, null, null, "section_id", ColumnType.RequiredData), 
			new DbField("studentId", 4, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData), 
			new DbField("seasonId", 5, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.RequiredData), 
			new DbField("offeredSubjectId", 6, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("subjectSectionId", 7, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.RequiredData), 
			new DbField("totalClasses", 8, DefinedDataTypes.integer, "0", null, null, "total_classes", ColumnType.OptionalData), 
			new DbField("totalAttendance", 9, DefinedDataTypes.integer, "0", null, null, "total_attendance", ColumnType.OptionalData), 
			new DbField("overallAttendance", 10, DefinedDataTypes.text, null, null, null, "overall_attendance", ColumnType.OptionalData), 
			new DbField("cieMarks", 11, DefinedDataTypes.integer, null, null, null, "cie_marks", ColumnType.OptionalData), 
			new DbField("hasAttendanceShortage", 12, DefinedDataTypes.bool, "true", null, null, "has_attendance_shortage", ColumnType.OptionalData), 
			new DbField("hasCieShortage", 13, DefinedDataTypes.bool, "true", null, null, "has_cie_shortage", ColumnType.OptionalData), 
			new DbField("isCondonable", 14, DefinedDataTypes.bool, "false", null, null, "is_condonable", ColumnType.OptionalData), 
			new DbField("isCondoned", 15, DefinedDataTypes.bool, "false", null, null, "is_condoned", ColumnType.OptionalData), 
			new DbField("condonedByUser", 16, DefinedDataTypes.id, "0", null, null, "condoned_by_user", ColumnType.OptionalData), 
			new DbField("isEligibleForExam", 17, DefinedDataTypes.bool, "false", null, null, "is_eligible_for_exam", ColumnType.OptionalData), 
			new DbField("createdAt", 18, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 19, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT subject_register_id, institute_id, subject_id, section_id, student_id, season_id, offered_subject_id, subject_section_id, total_classes, total_attendance, overall_attendance, cie_marks, has_attendance_shortage, has_cie_shortage, is_condonable, is_condoned, condoned_by_user, is_eligible_for_exam, created_at, updated_at FROM subject_registers";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
	private static final  String INSERT = "INSERT INTO subject_registers(institute_id, subject_id, section_id, student_id, season_id, offered_subject_id, subject_section_id, total_classes, total_attendance, overall_attendance, cie_marks, has_attendance_shortage, has_cie_shortage, is_condonable, is_condoned, condoned_by_user, is_eligible_for_exam, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
	private static final String WHERE = " WHERE subject_register_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE subject_registers SET subject_id= ? , section_id= ? , student_id= ? , season_id= ? , offered_subject_id= ? , subject_section_id= ? , total_classes= ? , total_attendance= ? , overall_attendance= ? , cie_marks= ? , has_attendance_shortage= ? , has_cie_shortage= ? , is_condonable= ? , is_condoned= ? , condoned_by_user= ? , is_eligible_for_exam= ? , updated_at= CURRENT_TIMESTAMP  WHERE subject_register_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 0, 1};
	private static final String DELETE = "DELETE FROM subject_registers";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public SubjectRegisterSchema() {
		this.name = "subjectRegister";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "subject_registers";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(20, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "subject_register_id", 0, null);
		this.initialize();
	}

	@Override
	public SubjectRegisterData newSchemaData() {
		return new SubjectRegisterData(this, null);
	}

	@Override
	protected SubjectRegisterData newSchemaData(final Object[] data) {
		return new SubjectRegisterData(this, data);
	}

	@Override
	public SubjectRegisterData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (SubjectRegisterData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public SubjectRegisterData parseKeys(JsonObject json, IServiceContext ctx) {
		return (SubjectRegisterData) super.parseKeys(json, ctx);
	}

	@Override
	public SubjectRegisterDataTable newSchemaDataTable() {
		return new SubjectRegisterDataTable(this, null);
	}

	@Override
	protected SubjectRegisterDataTable newSchemaDataTable(final Object[][] data) {
		return new SubjectRegisterDataTable(this, data);
	}

	@Override
	public SubjectRegisterDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (SubjectRegisterDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
