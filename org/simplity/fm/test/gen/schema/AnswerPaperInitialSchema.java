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
 * class that represents structure of answerPaperInitial
 */ 
public class AnswerPaperInitialSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("answerPaperId", 0, DefinedDataTypes.text, null, null, null, "answer_paper_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("packetId", 2, DefinedDataTypes.text, null, null, null, "packet_id", ColumnType.RequiredData), 
			new DbField("subjectRegisterId", 3, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.RequiredData), 
			new DbField("seasonId", 4, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, false, true, true, true, true};
	private static final String SELECT = "SELECT answer_paper_id, institute_id, packet_id, subject_register_id, season_id FROM answer_papers";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4};
	private static final  String INSERT = "INSERT INTO answer_papers(answer_paper_id, institute_id, packet_id, subject_register_id, season_id) values (?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4};
	private static final String WHERE = " WHERE answer_paper_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE answer_papers SET packet_id= ? , subject_register_id= ? , season_id= ?  WHERE answer_paper_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 0, 1};
	private static final String DELETE = "DELETE FROM answer_papers";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AnswerPaperInitialSchema() {
		this.name = "answerPaperInitial";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "answer_papers";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(5, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public AnswerPaperInitialData newSchemaData() {
		return new AnswerPaperInitialData(this, null);
	}

	@Override
	protected AnswerPaperInitialData newSchemaData(final Object[] data) {
		return new AnswerPaperInitialData(this, data);
	}

	@Override
	public AnswerPaperInitialData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AnswerPaperInitialData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AnswerPaperInitialData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AnswerPaperInitialData) super.parseKeys(json, ctx);
	}

	@Override
	public AnswerPaperInitialDataTable newSchemaDataTable() {
		return new AnswerPaperInitialDataTable(this, null);
	}

	@Override
	protected AnswerPaperInitialDataTable newSchemaDataTable(final Object[][] data) {
		return new AnswerPaperInitialDataTable(this, data);
	}

	@Override
	public AnswerPaperInitialDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AnswerPaperInitialDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
