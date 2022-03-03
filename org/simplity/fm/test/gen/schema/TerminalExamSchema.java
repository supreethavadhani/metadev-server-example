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
 * class that represents structure of terminalExam
 */ 
public class TerminalExamSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.PrimaryKey), 
			new DbField("isMakeup", 1, DefinedDataTypes.bool, null, null, null, "is_makeup", ColumnType.PrimaryKey), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.PrimaryKey), 
			new DbField("examDate", 3, DefinedDataTypes.date, null, null, null, "exam_date", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT offered_subject_id, is_makeup, institute_id, exam_date FROM terminal_exams";
	private static final int[] SELECT_IDX = {0, 1, 2, 3};
	private static final  String INSERT = "INSERT INTO terminal_exams(offered_subject_id, is_makeup, institute_id, exam_date) values (?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3};
	private static final String WHERE = " WHERE offered_subject_id=? AND is_makeup=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1, 2};
	private static final  String UPDATE = "UPDATE terminal_exams SET exam_date= ?  WHERE offered_subject_id=? AND is_makeup=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {3, 0, 1, 2};
	private static final String DELETE = "DELETE FROM terminal_exams";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public TerminalExamSchema() {
		this.name = "terminalExam";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "terminal_exams";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(4, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public TerminalExamData newSchemaData() {
		return new TerminalExamData(this, null);
	}

	@Override
	protected TerminalExamData newSchemaData(final Object[] data) {
		return new TerminalExamData(this, data);
	}

	@Override
	public TerminalExamData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (TerminalExamData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public TerminalExamData parseKeys(JsonObject json, IServiceContext ctx) {
		return (TerminalExamData) super.parseKeys(json, ctx);
	}

	@Override
	public TerminalExamDataTable newSchemaDataTable() {
		return new TerminalExamDataTable(this, null);
	}

	@Override
	protected TerminalExamDataTable newSchemaDataTable(final Object[][] data) {
		return new TerminalExamDataTable(this, data);
	}

	@Override
	public TerminalExamDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (TerminalExamDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
