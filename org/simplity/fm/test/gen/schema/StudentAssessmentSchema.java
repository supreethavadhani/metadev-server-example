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
 * class that represents structure of studentAssessment
 */ 
public class StudentAssessmentSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("studentAssessmentId", 0, DefinedDataTypes.id, null, null, null, "student_assessment_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("seasonId", 2, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.RequiredData), 
			new DbField("offeredSubjectId", 3, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("subjectSectionId", 4, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.RequiredData), 
			new DbField("subjectRegisterId", 5, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.RequiredData), 
			new DbField("assessmentSchemeId", 6, DefinedDataTypes.id, null, null, null, "assessment_scheme_id", ColumnType.RequiredData), 
			new DbField("assessmentSeqNo", 7, DefinedDataTypes.integer, null, null, null, "assessment_seq_no", ColumnType.RequiredData), 
			new DbField("studentId", 8, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData), 
			new DbField("sectionId", 9, DefinedDataTypes.id, null, null, null, "section_id", ColumnType.RequiredData), 
			new DbField("hasAttended", 10, DefinedDataTypes.bool, "false", null, null, "has_attended", ColumnType.OptionalData), 
			new DbField("marksScored", 11, DefinedDataTypes.integer, "0", null, null, "marks_scored", ColumnType.OptionalData), 
			new DbField("enteredByUserId", 12, DefinedDataTypes.id, "0", null, null, "entered_by_user_id", ColumnType.OptionalData), 
			new DbField("createdAt", 13, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 14, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT student_assessment_id, institute_id, season_id, offered_subject_id, subject_section_id, subject_register_id, assessment_scheme_id, assessment_seq_no, student_id, section_id, has_attended, marks_scored, entered_by_user_id, created_at, updated_at FROM student_assessments";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	private static final  String INSERT = "INSERT INTO student_assessments(institute_id, season_id, offered_subject_id, subject_section_id, subject_register_id, assessment_scheme_id, assessment_seq_no, student_id, section_id, has_attended, marks_scored, entered_by_user_id, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	private static final String WHERE = " WHERE student_assessment_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE student_assessments SET season_id= ? , offered_subject_id= ? , subject_section_id= ? , subject_register_id= ? , assessment_scheme_id= ? , assessment_seq_no= ? , student_id= ? , section_id= ? , has_attended= ? , marks_scored= ? , entered_by_user_id= ? , updated_at= CURRENT_TIMESTAMP  WHERE student_assessment_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 1};
	private static final String DELETE = "DELETE FROM student_assessments";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public StudentAssessmentSchema() {
		this.name = "studentAssessment";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "student_assessments";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(15, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "student_assessment_id", 0, null);
		this.initialize();
	}

	@Override
	public StudentAssessmentData newSchemaData() {
		return new StudentAssessmentData(this, null);
	}

	@Override
	protected StudentAssessmentData newSchemaData(final Object[] data) {
		return new StudentAssessmentData(this, data);
	}

	@Override
	public StudentAssessmentData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (StudentAssessmentData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public StudentAssessmentData parseKeys(JsonObject json, IServiceContext ctx) {
		return (StudentAssessmentData) super.parseKeys(json, ctx);
	}

	@Override
	public StudentAssessmentDataTable newSchemaDataTable() {
		return new StudentAssessmentDataTable(this, null);
	}

	@Override
	protected StudentAssessmentDataTable newSchemaDataTable(final Object[][] data) {
		return new StudentAssessmentDataTable(this, data);
	}

	@Override
	public StudentAssessmentDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (StudentAssessmentDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
