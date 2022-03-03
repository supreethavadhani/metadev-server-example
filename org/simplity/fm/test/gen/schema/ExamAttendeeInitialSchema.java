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
 * class that represents structure of examAttendeeInitial
 */ 
public class ExamAttendeeInitialSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.PrimaryKey), 
			new DbField("isMakeup", 1, DefinedDataTypes.bool, null, null, null, "is_makeup", ColumnType.PrimaryKey), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.PrimaryKey), 
			new DbField("offeredSubjectId", 3, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("studentId", 4, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {false, true, false, false, false, false};
	private static final String SELECT = "SELECT subject_register_id, is_makeup, institute_id, offered_subject_id, student_id FROM exam_attendees";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4};
	private static final  String INSERT = "INSERT INTO exam_attendees(subject_register_id, is_makeup, institute_id, offered_subject_id, student_id) values (?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4};
	private static final String WHERE = " WHERE subject_register_id=? AND is_makeup=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1, 2};
	private static final  String UPDATE = "UPDATE exam_attendees SET offered_subject_id= ? , student_id= ?  WHERE subject_register_id=? AND is_makeup=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {3, 4, 0, 1, 2};
	private static final String DELETE = "DELETE FROM exam_attendees";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public ExamAttendeeInitialSchema() {
		this.name = "examAttendeeInitial";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "exam_attendees";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(5, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public ExamAttendeeInitialData newSchemaData() {
		return new ExamAttendeeInitialData(this, null);
	}

	@Override
	protected ExamAttendeeInitialData newSchemaData(final Object[] data) {
		return new ExamAttendeeInitialData(this, data);
	}

	@Override
	public ExamAttendeeInitialData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ExamAttendeeInitialData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ExamAttendeeInitialData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ExamAttendeeInitialData) super.parseKeys(json, ctx);
	}

	@Override
	public ExamAttendeeInitialDataTable newSchemaDataTable() {
		return new ExamAttendeeInitialDataTable(this, null);
	}

	@Override
	protected ExamAttendeeInitialDataTable newSchemaDataTable(final Object[][] data) {
		return new ExamAttendeeInitialDataTable(this, data);
	}

	@Override
	public ExamAttendeeInitialDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ExamAttendeeInitialDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
