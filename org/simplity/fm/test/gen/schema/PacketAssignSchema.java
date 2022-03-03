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
 * class that represents structure of packetAssign
 */ 
public class PacketAssignSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("instituteId", 0, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("departmentId", 1, DefinedDataTypes.id, null, null, null, "degree_id", ColumnType.RequiredData), 
			new DbField("offeredSubjectId", 2, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.RequiredData), 
			new DbField("evaluationId", 3, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("evaluatorName", 4, DefinedDataTypes.name, null, null, null, "evaluator_name", ColumnType.RequiredData), 
			new DbField("phoneNumber", 5, DefinedDataTypes.text, null, null, null, "phone_number", ColumnType.RequiredData), 
			new DbField("packetId", 6, DefinedDataTypes.id, null, null, null, "packet_id", ColumnType.RequiredData), 
			new DbField("packetName", 7, DefinedDataTypes.text, null, null, null, "packet_name", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {false, true, true, true, true, true};
	private static final String SELECT = "SELECT institute_id, degree_id, subject_id, name, evaluator_name, phone_number, packet_id, packet_name FROM packet_assign";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public PacketAssignSchema() {
		this.name = "packetAssign";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "packet_assign";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(8, this.fields[0], SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public PacketAssignData newSchemaData() {
		return new PacketAssignData(this, null);
	}

	@Override
	protected PacketAssignData newSchemaData(final Object[] data) {
		return new PacketAssignData(this, data);
	}

	@Override
	public PacketAssignData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (PacketAssignData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public PacketAssignData parseKeys(JsonObject json, IServiceContext ctx) {
		return (PacketAssignData) super.parseKeys(json, ctx);
	}

	@Override
	public PacketAssignDataTable newSchemaDataTable() {
		return new PacketAssignDataTable(this, null);
	}

	@Override
	protected PacketAssignDataTable newSchemaDataTable(final Object[][] data) {
		return new PacketAssignDataTable(this, data);
	}

	@Override
	public PacketAssignDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (PacketAssignDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
