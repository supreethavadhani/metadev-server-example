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
 * class that represents structure of examAttendeeName
 */ 
public class ExamAttendeeNameSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.PrimaryKey), 
			new DbField("isMakeup", 1, DefinedDataTypes.bool, null, null, null, "is_makeup", ColumnType.PrimaryKey), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.PrimaryKey), 
			new DbField("offeredSubjectId", 3, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("studentId", 4, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData), 
			new DbField("name", 5, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("usn", 6, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("department", 7, DefinedDataTypes.text, null, null, null, "department", ColumnType.OptionalData), 
			new DbField("level", 8, DefinedDataTypes.text, null, null, null, "level", ColumnType.OptionalData), 
			new DbField("section", 9, DefinedDataTypes.text, null, null, null, "section", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT subject_register_id, is_makeup, institute_id, offered_subject_id, student_id, name, usn, department, level, section FROM exam_attendee_names";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final  String INSERT = "INSERT INTO exam_attendee_names(subject_register_id, is_makeup, institute_id, offered_subject_id, student_id, name, usn, department, level, section) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final String WHERE = " WHERE subject_register_id=? AND is_makeup=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1, 2};
	private static final  String UPDATE = "UPDATE exam_attendee_names SET offered_subject_id= ? , student_id= ? , name= ? , usn= ? , department= ? , level= ? , section= ?  WHERE subject_register_id=? AND is_makeup=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {3, 4, 5, 6, 7, 8, 9, 0, 1, 2};
	private static final String DELETE = "DELETE FROM exam_attendee_names";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public ExamAttendeeNameSchema() {
		this.name = "examAttendeeName";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "exam_attendee_names";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(10, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public ExamAttendeeNameData newSchemaData() {
		return new ExamAttendeeNameData(this, null);
	}

	@Override
	protected ExamAttendeeNameData newSchemaData(final Object[] data) {
		return new ExamAttendeeNameData(this, data);
	}

	@Override
	public ExamAttendeeNameData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ExamAttendeeNameData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ExamAttendeeNameData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ExamAttendeeNameData) super.parseKeys(json, ctx);
	}

	@Override
	public ExamAttendeeNameDataTable newSchemaDataTable() {
		return new ExamAttendeeNameDataTable(this, null);
	}

	@Override
	protected ExamAttendeeNameDataTable newSchemaDataTable(final Object[][] data) {
		return new ExamAttendeeNameDataTable(this, data);
	}

	@Override
	public ExamAttendeeNameDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ExamAttendeeNameDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
