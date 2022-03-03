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
 * class that represents structure of packetAssignment
 */ 
public class PacketAssignmentSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("packetId", 0, DefinedDataTypes.text, null, null, null, "packet_id", ColumnType.PrimaryKey), 
			new DbField("seqNo", 1, DefinedDataTypes.integer, null, null, null, "seq_no", ColumnType.PrimaryKey), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("evaluatorId", 3, DefinedDataTypes.id, null, null, null, "evaluator_id", ColumnType.RequiredData), 
			new DbField("subjectName", 4, DefinedDataTypes.text, null, null, null, "subject_name", ColumnType.RequiredData), 
			new DbField("assignedAt", 5, DefinedDataTypes.timestamp, null, null, null, "assigned_at", ColumnType.RequiredData), 
			new DbField("returnedAt", 6, DefinedDataTypes.timestamp, null, null, null, "returned_at", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT packet_id, seq_no, institute_id, evaluator_id, subject_name, assigned_at, returned_at FROM packet_assignments";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final  String INSERT = "INSERT INTO packet_assignments(packet_id, seq_no, institute_id, evaluator_id, subject_name, assigned_at, returned_at) values (?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final String WHERE = " WHERE packet_id=? AND seq_no=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1, 2};
	private static final  String UPDATE = "UPDATE packet_assignments SET evaluator_id= ? , subject_name= ? , assigned_at= ? , returned_at= ?  WHERE packet_id=? AND seq_no=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {3, 4, 5, 6, 0, 1, 2};
	private static final String DELETE = "DELETE FROM packet_assignments";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public PacketAssignmentSchema() {
		this.name = "packetAssignment";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "packet_assignments";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(7, this.fields[2], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public PacketAssignmentData newSchemaData() {
		return new PacketAssignmentData(this, null);
	}

	@Override
	protected PacketAssignmentData newSchemaData(final Object[] data) {
		return new PacketAssignmentData(this, data);
	}

	@Override
	public PacketAssignmentData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (PacketAssignmentData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public PacketAssignmentData parseKeys(JsonObject json, IServiceContext ctx) {
		return (PacketAssignmentData) super.parseKeys(json, ctx);
	}

	@Override
	public PacketAssignmentDataTable newSchemaDataTable() {
		return new PacketAssignmentDataTable(this, null);
	}

	@Override
	protected PacketAssignmentDataTable newSchemaDataTable(final Object[][] data) {
		return new PacketAssignmentDataTable(this, data);
	}

	@Override
	public PacketAssignmentDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (PacketAssignmentDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
