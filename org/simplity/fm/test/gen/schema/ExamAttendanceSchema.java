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
 * class that represents structure of examAttendance
 */ 
public class ExamAttendanceSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.PrimaryKey), 
			new DbField("subjectId", 1, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.RequiredData), 
			new DbField("name", 2, DefinedDataTypes.text, null, null, null, "name", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, true, false, false, false};
	private static final String SELECT = "SELECT offered_subject_id, subject_id, name FROM offered_subject_details";
	private static final int[] SELECT_IDX = {0, 1, 2};
	private static final  String INSERT = "INSERT INTO offered_subject_details(offered_subject_id, subject_id, name) values (?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2};
	private static final String WHERE = " WHERE offered_subject_id=?";
	private static final int[] WHERE_IDX = {0};
	private static final  String UPDATE = "UPDATE offered_subject_details SET subject_id= ? , name= ?  WHERE offered_subject_id=?";
	private static final  int[] UPDATE_IDX = {1, 2, 0};
	private static final String DELETE = "DELETE FROM offered_subject_details";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public ExamAttendanceSchema() {
		this.name = "examAttendance";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "offered_subject_details";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(3, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public ExamAttendanceData newSchemaData() {
		return new ExamAttendanceData(this, null);
	}

	@Override
	protected ExamAttendanceData newSchemaData(final Object[] data) {
		return new ExamAttendanceData(this, data);
	}

	@Override
	public ExamAttendanceData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ExamAttendanceData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ExamAttendanceData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ExamAttendanceData) super.parseKeys(json, ctx);
	}

	@Override
	public ExamAttendanceDataTable newSchemaDataTable() {
		return new ExamAttendanceDataTable(this, null);
	}

	@Override
	protected ExamAttendanceDataTable newSchemaDataTable(final Object[][] data) {
		return new ExamAttendanceDataTable(this, data);
	}

	@Override
	public ExamAttendanceDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ExamAttendanceDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
