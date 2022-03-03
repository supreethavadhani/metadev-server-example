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
 * class that represents structure of answerPacket
 */ 
public class AnswerPacketSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("packetId", 0, DefinedDataTypes.text, null, null, null, "packet_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("offeredSubjectId", 2, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("subjectName", 3, DefinedDataTypes.text, null, null, null, "subject_name", ColumnType.RequiredData), 
			new DbField("seasonId", 4, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.RequiredData), 
			new DbField("evaluatorId", 5, DefinedDataTypes.id, null, null, null, "evaluator_id", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT packet_id, institute_id, offered_subject_id, subject_name, season_id, evaluator_id FROM answer_packets";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5};
	private static final  String INSERT = "INSERT INTO answer_packets(packet_id, institute_id, offered_subject_id, subject_name, season_id, evaluator_id) values (?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5};
	private static final String WHERE = " WHERE packet_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE answer_packets SET offered_subject_id= ? , subject_name= ? , season_id= ? , evaluator_id= ?  WHERE packet_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 0, 1};
	private static final String DELETE = "DELETE FROM answer_packets";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AnswerPacketSchema() {
		this.name = "answerPacket";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "answer_packets";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(6, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public AnswerPacketData newSchemaData() {
		return new AnswerPacketData(this, null);
	}

	@Override
	protected AnswerPacketData newSchemaData(final Object[] data) {
		return new AnswerPacketData(this, data);
	}

	@Override
	public AnswerPacketData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AnswerPacketData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AnswerPacketData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AnswerPacketData) super.parseKeys(json, ctx);
	}

	@Override
	public AnswerPacketDataTable newSchemaDataTable() {
		return new AnswerPacketDataTable(this, null);
	}

	@Override
	protected AnswerPacketDataTable newSchemaDataTable(final Object[][] data) {
		return new AnswerPacketDataTable(this, data);
	}

	@Override
	public AnswerPacketDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AnswerPacketDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
