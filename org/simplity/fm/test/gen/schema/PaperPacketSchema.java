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
 * class that represents structure of paperPacket
 */ 
public class PaperPacketSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("packetCode", 0, DefinedDataTypes.text, null, null, null, "packet_Code", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.PrimaryKey), 
			new DbField("offeredSubjectId", 2, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("subjectName", 3, DefinedDataTypes.text, null, null, null, "subject_name", ColumnType.RequiredData), 
			new DbField("isMakeup", 4, DefinedDataTypes.bool, "false", null, null, "is_makeup", ColumnType.OptionalData), 
			new DbField("valuationRound", 5, DefinedDataTypes.integer, null, null, null, "valuation_round", ColumnType.RequiredData), 
			new DbField("initialValuatorId", 6, DefinedDataTypes.id, "0", null, null, "initial_valuator_id", ColumnType.OptionalData), 
			new DbField("initialValuationDate", 7, DefinedDataTypes.date, null, null, null, "initial_valuation_date", ColumnType.OptionalData), 
			new DbField("valuator2Id", 8, DefinedDataTypes.id, "0", null, null, "valuator2_id", ColumnType.OptionalData), 
			new DbField("valuation2Date", 9, DefinedDataTypes.date, null, null, null, "valuation2_date", ColumnType.OptionalData), 
			new DbField("valuator3Id", 10, DefinedDataTypes.id, "0", null, null, "valuator3_id", ColumnType.OptionalData), 
			new DbField("valuation3Date", 11, DefinedDataTypes.date, null, null, null, "valuation3_date", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT packet_Code, institute_id, offered_subject_id, subject_name, is_makeup, valuation_round, initial_valuator_id, initial_valuation_date, valuator2_id, valuation2_date, valuator3_id, valuation3_date FROM paper_packets";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	private static final  String INSERT = "INSERT INTO paper_packets(packet_Code, institute_id, offered_subject_id, subject_name, is_makeup, valuation_round, initial_valuator_id, initial_valuation_date, valuator2_id, valuation2_date, valuator3_id, valuation3_date) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	private static final String WHERE = " WHERE packet_Code=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE paper_packets SET offered_subject_id= ? , subject_name= ? , is_makeup= ? , valuation_round= ? , initial_valuator_id= ? , initial_valuation_date= ? , valuator2_id= ? , valuation2_date= ? , valuator3_id= ? , valuation3_date= ?  WHERE packet_Code=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 1};
	private static final String DELETE = "DELETE FROM paper_packets";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public PaperPacketSchema() {
		this.name = "paperPacket";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "paper_packets";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(12, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public PaperPacketData newSchemaData() {
		return new PaperPacketData(this, null);
	}

	@Override
	protected PaperPacketData newSchemaData(final Object[] data) {
		return new PaperPacketData(this, data);
	}

	@Override
	public PaperPacketData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (PaperPacketData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public PaperPacketData parseKeys(JsonObject json, IServiceContext ctx) {
		return (PaperPacketData) super.parseKeys(json, ctx);
	}

	@Override
	public PaperPacketDataTable newSchemaDataTable() {
		return new PaperPacketDataTable(this, null);
	}

	@Override
	protected PaperPacketDataTable newSchemaDataTable(final Object[][] data) {
		return new PaperPacketDataTable(this, data);
	}

	@Override
	public PaperPacketDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (PaperPacketDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
