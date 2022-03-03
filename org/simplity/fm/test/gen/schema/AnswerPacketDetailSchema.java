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
 * class that represents structure of answerPacketDetail
 */ 
public class AnswerPacketDetailSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("packetId", 0, DefinedDataTypes.text, null, null, null, "packet_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("offeredSubjectId", 2, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("evaluatorId", 3, DefinedDataTypes.id, null, null, null, "evaluator_id", ColumnType.OptionalData), 
			new DbField("subjectName", 4, DefinedDataTypes.text, null, null, null, "subject_name", ColumnType.OptionalData), 
			new DbField("name", 5, DefinedDataTypes.text, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("phoneNumber", 6, DefinedDataTypes.text, null, null, null, "phone_number", ColumnType.OptionalData), 
			new DbField("email", 7, DefinedDataTypes.text, null, null, null, "email", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT packet_id, institute_id, offered_subject_id, evaluator_id, subject_name, name, phone_number, email FROM answer_packet_details";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final  String INSERT = "INSERT INTO answer_packet_details(packet_id, institute_id, offered_subject_id, evaluator_id, subject_name, name, phone_number, email) values (?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final String WHERE = " WHERE packet_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE answer_packet_details SET offered_subject_id= ? , evaluator_id= ? , subject_name= ? , name= ? , phone_number= ? , email= ?  WHERE packet_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 0, 1};
	private static final String DELETE = "DELETE FROM answer_packet_details";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AnswerPacketDetailSchema() {
		this.name = "answerPacketDetail";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "answer_packet_details";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(8, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public AnswerPacketDetailData newSchemaData() {
		return new AnswerPacketDetailData(this, null);
	}

	@Override
	protected AnswerPacketDetailData newSchemaData(final Object[] data) {
		return new AnswerPacketDetailData(this, data);
	}

	@Override
	public AnswerPacketDetailData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AnswerPacketDetailData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AnswerPacketDetailData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AnswerPacketDetailData) super.parseKeys(json, ctx);
	}

	@Override
	public AnswerPacketDetailDataTable newSchemaDataTable() {
		return new AnswerPacketDetailDataTable(this, null);
	}

	@Override
	protected AnswerPacketDetailDataTable newSchemaDataTable(final Object[][] data) {
		return new AnswerPacketDetailDataTable(this, data);
	}

	@Override
	public AnswerPacketDetailDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AnswerPacketDetailDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
