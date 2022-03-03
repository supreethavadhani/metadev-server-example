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
 * class that represents structure of studentAssessmentUpdate
 */ 
public class StudentAssessmentUpdateSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("studentAssessmentId", 0, DefinedDataTypes.id, null, null, null, "student_assessment_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectSectionId", 2, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.PrimaryKey), 
			new DbField("assessmentSeqNo", 3, DefinedDataTypes.integer, null, null, null, "assessment_seq_no", ColumnType.PrimaryKey), 
			new DbField("studentId", 4, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.PrimaryKey), 
			new DbField("hasAttended", 5, DefinedDataTypes.bool, null, null, null, "has_attended", ColumnType.RequiredData), 
			new DbField("marksScored", 6, DefinedDataTypes.integer, null, null, null, "marks_scored", ColumnType.RequiredData), 
			new DbField("enteredByUserId", 7, DefinedDataTypes.id, null, null, null, "entered_by_user_id", ColumnType.RequiredData), 
			new DbField("createdAt", 8, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 9, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {false, false, true, false, false, false};
	private static final String SELECT = "SELECT student_assessment_id, institute_id, subject_section_id, assessment_seq_no, student_id, has_attended, marks_scored, entered_by_user_id, created_at, updated_at FROM student_assessments";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final  String INSERT = "INSERT INTO student_assessments(student_assessment_id, institute_id, subject_section_id, assessment_seq_no, student_id, has_attended, marks_scored, entered_by_user_id, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final String WHERE = " WHERE student_assessment_id=? AND subject_section_id=? AND assessment_seq_no=? AND student_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 2, 3, 4, 1};
	private static final  String UPDATE = "UPDATE student_assessments SET has_attended= ? , marks_scored= ? , entered_by_user_id= ? , updated_at= CURRENT_TIMESTAMP  WHERE student_assessment_id=? AND subject_section_id=? AND assessment_seq_no=? AND student_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {5, 6, 7, 0, 2, 3, 4, 1};
	private static final String DELETE = "DELETE FROM student_assessments";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public StudentAssessmentUpdateSchema() {
		this.name = "studentAssessmentUpdate";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "student_assessments";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(10, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public StudentAssessmentUpdateData newSchemaData() {
		return new StudentAssessmentUpdateData(this, null);
	}

	@Override
	protected StudentAssessmentUpdateData newSchemaData(final Object[] data) {
		return new StudentAssessmentUpdateData(this, data);
	}

	@Override
	public StudentAssessmentUpdateData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (StudentAssessmentUpdateData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public StudentAssessmentUpdateData parseKeys(JsonObject json, IServiceContext ctx) {
		return (StudentAssessmentUpdateData) super.parseKeys(json, ctx);
	}

	@Override
	public StudentAssessmentUpdateDataTable newSchemaDataTable() {
		return new StudentAssessmentUpdateDataTable(this, null);
	}

	@Override
	protected StudentAssessmentUpdateDataTable newSchemaDataTable(final Object[][] data) {
		return new StudentAssessmentUpdateDataTable(this, data);
	}

	@Override
	public StudentAssessmentUpdateDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (StudentAssessmentUpdateDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
