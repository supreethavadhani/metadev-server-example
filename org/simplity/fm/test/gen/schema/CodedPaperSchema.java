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
 * class that represents structure of codedPaper
 */ 
public class CodedPaperSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("paperCode", 0, DefinedDataTypes.text, null, null, null, "paper_code", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.PrimaryKey), 
			new DbField("subjectRegisterId", 2, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.RequiredData), 
			new DbField("isMakeup", 3, DefinedDataTypes.bool, "false", null, null, "is_makeup", ColumnType.OptionalData), 
			new DbField("valuationRound", 4, DefinedDataTypes.integer, "0", null, null, "valuation_round", ColumnType.OptionalData), 
			new DbField("packetCode", 5, DefinedDataTypes.text, null, null, null, "packet_code", ColumnType.RequiredData), 
			new DbField("initialMarks", 6, DefinedDataTypes.integer, "0", null, null, "initial_marks", ColumnType.OptionalData), 
			new DbField("initialEvaluatorId", 7, DefinedDataTypes.id, "0", null, null, "initial_evaluator_id", ColumnType.OptionalData), 
			new DbField("requires2", 8, DefinedDataTypes.bool, "false", null, null, "requires2", ColumnType.OptionalData), 
			new DbField("marks2", 9, DefinedDataTypes.integer, "0", null, null, "marks2", ColumnType.OptionalData), 
			new DbField("evaluator2Id", 10, DefinedDataTypes.id, "0", null, null, "evaluator2_id", ColumnType.OptionalData), 
			new DbField("requires3", 11, DefinedDataTypes.bool, "false", null, null, "requires3", ColumnType.OptionalData), 
			new DbField("marks3", 12, DefinedDataTypes.integer, "0", null, null, "marks3", ColumnType.OptionalData), 
			new DbField("evaluator3Id", 13, DefinedDataTypes.id, "0", null, null, "evaluator3_id", ColumnType.OptionalData), 
			new DbField("effectiveMarks", 14, DefinedDataTypes.integer, "0", null, null, "effective_marks", ColumnType.OptionalData), 
			new DbField("studentId", 15, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData), 
			new DbField("offeredSubjectId", 16, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, false, false, false, true, false};
	private static final String SELECT = "SELECT paper_code, institute_id, subject_register_id, is_makeup, valuation_round, packet_code, initial_marks, initial_evaluator_id, requires2, marks2, evaluator2_id, requires3, marks3, evaluator3_id, effective_marks, student_id, offered_subject_id FROM coded_papers";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
	private static final  String INSERT = "INSERT INTO coded_papers(paper_code, institute_id, subject_register_id, is_makeup, valuation_round, packet_code, initial_marks, initial_evaluator_id, requires2, marks2, evaluator2_id, requires3, marks3, evaluator3_id, effective_marks, student_id, offered_subject_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
	private static final String WHERE = " WHERE paper_code=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE coded_papers SET subject_register_id= ? , is_makeup= ? , valuation_round= ? , packet_code= ? , initial_marks= ? , initial_evaluator_id= ? , requires2= ? , marks2= ? , evaluator2_id= ? , requires3= ? , marks3= ? , evaluator3_id= ? , effective_marks= ? , student_id= ? , offered_subject_id= ?  WHERE paper_code=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 0, 1};
	private static final String DELETE = "DELETE FROM coded_papers";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public CodedPaperSchema() {
		this.name = "codedPaper";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "coded_papers";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(17, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public CodedPaperData newSchemaData() {
		return new CodedPaperData(this, null);
	}

	@Override
	protected CodedPaperData newSchemaData(final Object[] data) {
		return new CodedPaperData(this, data);
	}

	@Override
	public CodedPaperData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (CodedPaperData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public CodedPaperData parseKeys(JsonObject json, IServiceContext ctx) {
		return (CodedPaperData) super.parseKeys(json, ctx);
	}

	@Override
	public CodedPaperDataTable newSchemaDataTable() {
		return new CodedPaperDataTable(this, null);
	}

	@Override
	protected CodedPaperDataTable newSchemaDataTable(final Object[][] data) {
		return new CodedPaperDataTable(this, data);
	}

	@Override
	public CodedPaperDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (CodedPaperDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
