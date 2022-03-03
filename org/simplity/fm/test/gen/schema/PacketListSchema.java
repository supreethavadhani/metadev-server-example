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
 * class that represents structure of packetList
 */ 
public class PacketListSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("instituteId", 0, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("departmentId", 1, DefinedDataTypes.id, null, null, "departmentList", "department_id", ColumnType.RequiredData), 
			new DbField("offeredSubjectId", 2, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.PrimaryKey), 
			new DbField("evaluationId", 3, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("evaluatorName", 4, DefinedDataTypes.name, null, null, null, "evaluator_name", ColumnType.RequiredData), 
			new DbField("phoneNumber", 5, DefinedDataTypes.text, null, null, null, "phone_number", ColumnType.RequiredData), 
			new DbField("packetId", 6, DefinedDataTypes.id, null, null, null, "packet_id", ColumnType.RequiredData), 
			new DbField("packetName", 7, DefinedDataTypes.text, null, null, null, "packet_name", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {false, true, true, true, true, true};
	private static final String SELECT = "SELECT institute_id, department_id, offered_subject_id, name, evaluator_name, phone_number, packet_id, packet_name FROM packet_list";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final  String INSERT = "INSERT INTO packet_list(institute_id, department_id, offered_subject_id, name, evaluator_name, phone_number, packet_id, packet_name) values (?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final String WHERE = " WHERE offered_subject_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {2, 0};
	private static final  String UPDATE = "UPDATE packet_list SET department_id= ? , name= ? , evaluator_name= ? , phone_number= ? , packet_id= ? , packet_name= ?  WHERE offered_subject_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {1, 3, 4, 5, 6, 7, 2, 0};
	private static final String DELETE = "DELETE FROM packet_list";
	private static final IValidation[] VALIDS = {new DependentListValidation(2, 1, "taughtSubjectList", "offeredSubjectId", null)
	};

	/**
	 *
	 */
	public PacketListSchema() {
		this.name = "packetList";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "packet_list";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(8, this.fields[0], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public PacketListData newSchemaData() {
		return new PacketListData(this, null);
	}

	@Override
	protected PacketListData newSchemaData(final Object[] data) {
		return new PacketListData(this, data);
	}

	@Override
	public PacketListData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (PacketListData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public PacketListData parseKeys(JsonObject json, IServiceContext ctx) {
		return (PacketListData) super.parseKeys(json, ctx);
	}

	@Override
	public PacketListDataTable newSchemaDataTable() {
		return new PacketListDataTable(this, null);
	}

	@Override
	protected PacketListDataTable newSchemaDataTable(final Object[][] data) {
		return new PacketListDataTable(this, data);
	}

	@Override
	public PacketListDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (PacketListDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
