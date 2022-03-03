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
 * class that represents structure of packetAssignmentDetail
 */ 
public class PacketAssignmentDetailSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("packetId", 0, DefinedDataTypes.text, null, null, null, "packet_id", ColumnType.PrimaryKey), 
			new DbField("seqNo", 1, DefinedDataTypes.integer, null, null, null, "seq_no", ColumnType.PrimaryKey), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("offeredSubjectId", 3, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("evaluatorId", 4, DefinedDataTypes.id, null, null, null, "evaluator_id", ColumnType.OptionalData), 
			new DbField("subjectName", 5, DefinedDataTypes.text, null, null, null, "subject_name", ColumnType.OptionalData), 
			new DbField("name", 6, DefinedDataTypes.text, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("phoneNumber", 7, DefinedDataTypes.text, null, null, null, "phone_number", ColumnType.OptionalData), 
			new DbField("email", 8, DefinedDataTypes.text, null, null, null, "email", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, true, false, true, true};
	private static final String SELECT = "SELECT packet_id, seq_no, institute_id, offered_subject_id, evaluator_id, subject_name, name, phone_number, email FROM packet_assignment_details";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8};
	private static final  String INSERT = "INSERT INTO packet_assignment_details(packet_id, seq_no, institute_id, offered_subject_id, evaluator_id, subject_name, name, phone_number, email) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8};
	private static final String WHERE = " WHERE packet_id=? AND seq_no=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1, 2};
	private static final  String UPDATE = "UPDATE packet_assignment_details SET offered_subject_id= ? , evaluator_id= ? , subject_name= ? , name= ? , phone_number= ? , email= ?  WHERE packet_id=? AND seq_no=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {3, 4, 5, 6, 7, 8, 0, 1, 2};
	private static final String DELETE = "DELETE FROM packet_assignment_details";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public PacketAssignmentDetailSchema() {
		this.name = "packetAssignmentDetail";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "packet_assignment_details";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(9, this.fields[2], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public PacketAssignmentDetailData newSchemaData() {
		return new PacketAssignmentDetailData(this, null);
	}

	@Override
	protected PacketAssignmentDetailData newSchemaData(final Object[] data) {
		return new PacketAssignmentDetailData(this, data);
	}

	@Override
	public PacketAssignmentDetailData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (PacketAssignmentDetailData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public PacketAssignmentDetailData parseKeys(JsonObject json, IServiceContext ctx) {
		return (PacketAssignmentDetailData) super.parseKeys(json, ctx);
	}

	@Override
	public PacketAssignmentDetailDataTable newSchemaDataTable() {
		return new PacketAssignmentDetailDataTable(this, null);
	}

	@Override
	protected PacketAssignmentDetailDataTable newSchemaDataTable(final Object[][] data) {
		return new PacketAssignmentDetailDataTable(this, data);
	}

	@Override
	public PacketAssignmentDetailDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (PacketAssignmentDetailDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
