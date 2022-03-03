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
 * class that represents structure of answerPaper
 */ 
public class AnswerPaperSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("answerPaperId", 0, DefinedDataTypes.text, null, null, null, "answer_paper_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("packetId", 2, DefinedDataTypes.text, null, null, null, "packet_id", ColumnType.RequiredData), 
			new DbField("subjectRegisterId", 3, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.RequiredData), 
			new DbField("seasonId", 4, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.RequiredData), 
			new DbField("finalMarks", 5, DefinedDataTypes.integer, "0", null, null, "final_marks", ColumnType.OptionalData), 
			new DbField("finalResult", 6, DefinedDataTypes.text, null, null, null, "final_result", ColumnType.OptionalData), 
			new DbField("listedMarks", 7, DefinedDataTypes.integer, "0", null, null, "listed_marks", ColumnType.OptionalData), 
			new DbField("evaluator1Id", 8, DefinedDataTypes.id, "0", null, null, "evaluator1_id", ColumnType.OptionalData), 
			new DbField("marks1", 9, DefinedDataTypes.integer, "0", null, null, "marks1", ColumnType.OptionalData), 
			new DbField("requires2", 10, DefinedDataTypes.bool, "false", null, null, "requires2", ColumnType.OptionalData), 
			new DbField("isModerated", 11, DefinedDataTypes.bool, "false", null, null, "is_moderated", ColumnType.OptionalData), 
			new DbField("evaluator2Id", 12, DefinedDataTypes.id, "0", null, null, "evaluator2_id", ColumnType.OptionalData), 
			new DbField("marks2", 13, DefinedDataTypes.integer, "0", null, null, "marks2", ColumnType.OptionalData), 
			new DbField("requires3", 14, DefinedDataTypes.bool, "false", null, null, "requires3", ColumnType.OptionalData), 
			new DbField("evaluator3Id", 15, DefinedDataTypes.id, "0", null, null, "evaluator3_id", ColumnType.OptionalData), 
			new DbField("marks3", 16, DefinedDataTypes.integer, "0", null, null, "marks3", ColumnType.OptionalData), 
			new DbField("eligibleForReval", 17, DefinedDataTypes.bool, "false", null, null, "eligible_for_reval", ColumnType.OptionalData), 
			new DbField("requires4", 18, DefinedDataTypes.bool, "false", null, null, "requires4", ColumnType.OptionalData), 
			new DbField("evaluator4Id", 19, DefinedDataTypes.id, "0", null, null, "evaluator4_id", ColumnType.OptionalData), 
			new DbField("marks4", 20, DefinedDataTypes.integer, "0", null, null, "marks4", ColumnType.OptionalData), 
			new DbField("requires5", 21, DefinedDataTypes.bool, "false", null, null, "requires5", ColumnType.OptionalData), 
			new DbField("evaluator5Id", 22, DefinedDataTypes.id, "0", null, null, "evaluator5_id", ColumnType.OptionalData), 
			new DbField("marks5", 23, DefinedDataTypes.integer, "0", null, null, "marks5", ColumnType.OptionalData), 
			new DbField("eligibleForChallenge", 24, DefinedDataTypes.bool, "false", null, null, "eligible_for_challenge", ColumnType.OptionalData), 
			new DbField("requires6", 25, DefinedDataTypes.bool, "false", null, null, "requires6", ColumnType.OptionalData), 
			new DbField("evaluator6Id", 26, DefinedDataTypes.id, "0", null, null, "evaluator6_id", ColumnType.OptionalData), 
			new DbField("marks6", 27, DefinedDataTypes.integer, "0", null, null, "marks6", ColumnType.OptionalData), 
			new DbField("requires7", 28, DefinedDataTypes.bool, "false", null, null, "requires7", ColumnType.OptionalData), 
			new DbField("evaluator7Id", 29, DefinedDataTypes.id, "0", null, null, "evaluator7_id", ColumnType.OptionalData), 
			new DbField("marks7", 30, DefinedDataTypes.integer, "0", null, null, "marks7", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, true, true, true, true};
	private static final String SELECT = "SELECT answer_paper_id, institute_id, packet_id, subject_register_id, season_id, final_marks, final_result, listed_marks, evaluator1_id, marks1, requires2, is_moderated, evaluator2_id, marks2, requires3, evaluator3_id, marks3, eligible_for_reval, requires4, evaluator4_id, marks4, requires5, evaluator5_id, marks5, eligible_for_challenge, requires6, evaluator6_id, marks6, requires7, evaluator7_id, marks7 FROM answer_papers";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
	private static final  String INSERT = "INSERT INTO answer_papers(answer_paper_id, institute_id, packet_id, subject_register_id, season_id, final_marks, final_result, listed_marks, evaluator1_id, marks1, requires2, is_moderated, evaluator2_id, marks2, requires3, evaluator3_id, marks3, eligible_for_reval, requires4, evaluator4_id, marks4, requires5, evaluator5_id, marks5, eligible_for_challenge, requires6, evaluator6_id, marks6, requires7, evaluator7_id, marks7) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
	private static final String WHERE = " WHERE answer_paper_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE answer_papers SET packet_id= ? , subject_register_id= ? , season_id= ? , final_marks= ? , final_result= ? , listed_marks= ? , evaluator1_id= ? , marks1= ? , requires2= ? , is_moderated= ? , evaluator2_id= ? , marks2= ? , requires3= ? , evaluator3_id= ? , marks3= ? , eligible_for_reval= ? , requires4= ? , evaluator4_id= ? , marks4= ? , requires5= ? , evaluator5_id= ? , marks5= ? , eligible_for_challenge= ? , requires6= ? , evaluator6_id= ? , marks6= ? , requires7= ? , evaluator7_id= ? , marks7= ?  WHERE answer_paper_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 0, 1};
	private static final String DELETE = "DELETE FROM answer_papers";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AnswerPaperSchema() {
		this.name = "answerPaper";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "answer_papers";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(31, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public AnswerPaperData newSchemaData() {
		return new AnswerPaperData(this, null);
	}

	@Override
	protected AnswerPaperData newSchemaData(final Object[] data) {
		return new AnswerPaperData(this, data);
	}

	@Override
	public AnswerPaperData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AnswerPaperData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AnswerPaperData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AnswerPaperData) super.parseKeys(json, ctx);
	}

	@Override
	public AnswerPaperDataTable newSchemaDataTable() {
		return new AnswerPaperDataTable(this, null);
	}

	@Override
	protected AnswerPaperDataTable newSchemaDataTable(final Object[][] data) {
		return new AnswerPaperDataTable(this, data);
	}

	@Override
	public AnswerPaperDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AnswerPaperDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
