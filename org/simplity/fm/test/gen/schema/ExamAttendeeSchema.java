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
 * class that represents structure of examAttendee
 */ 
public class ExamAttendeeSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.PrimaryKey), 
			new DbField("isMakeup", 1, DefinedDataTypes.bool, null, null, null, "is_makeup", ColumnType.PrimaryKey), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.PrimaryKey), 
			new DbField("offeredSubjectId", 3, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("studentId", 4, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData), 
			new DbField("eligibleForReval", 5, DefinedDataTypes.bool, "false", null, null, "eligible_for_reval", ColumnType.OptionalData), 
			new DbField("optedForReval", 6, DefinedDataTypes.bool, "false", null, null, "opted_for_reval", ColumnType.OptionalData), 
			new DbField("optedToChallenge", 7, DefinedDataTypes.bool, "false", null, null, "opted_to_challenge", ColumnType.OptionalData), 
			new DbField("finalMarks", 8, DefinedDataTypes.integer, "0", null, null, "final_marks", ColumnType.OptionalData), 
			new DbField("listedMarks", 9, DefinedDataTypes.integer, "0", null, null, "listed_marks", ColumnType.OptionalData), 
			new DbField("grade", 10, DefinedDataTypes.text, null, null, null, "grade", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT subject_register_id, is_makeup, institute_id, offered_subject_id, student_id, eligible_for_reval, opted_for_reval, opted_to_challenge, final_marks, listed_marks, grade FROM exam_attendees";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static final  String INSERT = "INSERT INTO exam_attendees(subject_register_id, is_makeup, institute_id, offered_subject_id, student_id, eligible_for_reval, opted_for_reval, opted_to_challenge, final_marks, listed_marks, grade) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static final String WHERE = " WHERE subject_register_id=? AND is_makeup=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1, 2};
	private static final  String UPDATE = "UPDATE exam_attendees SET offered_subject_id= ? , student_id= ? , eligible_for_reval= ? , opted_for_reval= ? , opted_to_challenge= ? , final_marks= ? , listed_marks= ? , grade= ?  WHERE subject_register_id=? AND is_makeup=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 2};
	private static final String DELETE = "DELETE FROM exam_attendees";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public ExamAttendeeSchema() {
		this.name = "examAttendee";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "exam_attendees";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(11, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public ExamAttendeeData newSchemaData() {
		return new ExamAttendeeData(this, null);
	}

	@Override
	protected ExamAttendeeData newSchemaData(final Object[] data) {
		return new ExamAttendeeData(this, data);
	}

	@Override
	public ExamAttendeeData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ExamAttendeeData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ExamAttendeeData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ExamAttendeeData) super.parseKeys(json, ctx);
	}

	@Override
	public ExamAttendeeDataTable newSchemaDataTable() {
		return new ExamAttendeeDataTable(this, null);
	}

	@Override
	protected ExamAttendeeDataTable newSchemaDataTable(final Object[][] data) {
		return new ExamAttendeeDataTable(this, data);
	}

	@Override
	public ExamAttendeeDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ExamAttendeeDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
