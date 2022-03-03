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
 * class that represents structure of eligibilityList
 */ 
public class EligibilityListSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectSectionId", 2, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.OptionalData), 
			new DbField("studentId", 3, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData), 
			new DbField("name", 4, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("usn", 5, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("cieMarks", 6, DefinedDataTypes.integer, "0", null, null, "cie_marks", ColumnType.OptionalData), 
			new DbField("overallAttendance", 7, DefinedDataTypes.text, null, null, null, "overall_attendance", ColumnType.OptionalData), 
			new DbField("hasAttendanceShortage", 8, DefinedDataTypes.bool, "true", null, null, "has_attendance_shortage", ColumnType.OptionalData), 
			new DbField("isCondoned", 9, DefinedDataTypes.bool, "false", null, null, "is_condoned", ColumnType.OptionalData), 
			new DbField("isCondonable", 10, DefinedDataTypes.bool, "false", null, null, "is_condonable", ColumnType.OptionalData), 
			new DbField("isEligibleForExam", 11, DefinedDataTypes.bool, "false", null, null, "is_eligible_for_exam", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, false, false, true, false};
	private static final String SELECT = "SELECT subject_register_id, institute_id, subject_section_id, student_id, name, usn, cie_marks, overall_attendance, has_attendance_shortage, is_condoned, is_condonable, is_eligible_for_exam FROM eligibility_list";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	private static final  String INSERT = "INSERT INTO eligibility_list(subject_register_id, institute_id, subject_section_id, student_id, name, usn, cie_marks, overall_attendance, has_attendance_shortage, is_condoned, is_condonable, is_eligible_for_exam) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	private static final String WHERE = " WHERE subject_register_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE eligibility_list SET subject_section_id= ? , student_id= ? , name= ? , usn= ? , cie_marks= ? , overall_attendance= ? , has_attendance_shortage= ? , is_condoned= ? , is_condonable= ? , is_eligible_for_exam= ?  WHERE subject_register_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 1};
	private static final String DELETE = "DELETE FROM eligibility_list";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public EligibilityListSchema() {
		this.name = "eligibilityList";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "eligibility_list";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(12, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public EligibilityListData newSchemaData() {
		return new EligibilityListData(this, null);
	}

	@Override
	protected EligibilityListData newSchemaData(final Object[] data) {
		return new EligibilityListData(this, data);
	}

	@Override
	public EligibilityListData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (EligibilityListData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public EligibilityListData parseKeys(JsonObject json, IServiceContext ctx) {
		return (EligibilityListData) super.parseKeys(json, ctx);
	}

	@Override
	public EligibilityListDataTable newSchemaDataTable() {
		return new EligibilityListDataTable(this, null);
	}

	@Override
	protected EligibilityListDataTable newSchemaDataTable(final Object[][] data) {
		return new EligibilityListDataTable(this, data);
	}

	@Override
	public EligibilityListDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (EligibilityListDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
