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
 * class that represents structure of packetRecieve
 */ 
public class PacketRecieveSchema extends Schema {	private static final DbField[] FIELDS = {
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
	private static final String SELECT = "SELECT institute_id, degree_id, subject_id, name, evaluator_name, phone_number, packet_id, packet_name FROM packet_recieve";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public PacketRecieveSchema() {
		this.name = "packetRecieve";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "packet_recieve";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(8, this.fields[0], SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public PacketRecieveData newSchemaData() {
		return new PacketRecieveData(this, null);
	}

	@Override
	protected PacketRecieveData newSchemaData(final Object[] data) {
		return new PacketRecieveData(this, data);
	}

	@Override
	public PacketRecieveData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (PacketRecieveData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public PacketRecieveData parseKeys(JsonObject json, IServiceContext ctx) {
		return (PacketRecieveData) super.parseKeys(json, ctx);
	}

	@Override
	public PacketRecieveDataTable newSchemaDataTable() {
		return new PacketRecieveDataTable(this, null);
	}

	@Override
	protected PacketRecieveDataTable newSchemaDataTable(final Object[][] data) {
		return new PacketRecieveDataTable(this, data);
	}

	@Override
	public PacketRecieveDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (PacketRecieveDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
