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
 * class that represents structure of approval
 */ 
public class ApprovalSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("approvalId", 0, DefinedDataTypes.id, null, null, null, "approval_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("seasonId", 2, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.OptionalData), 
			new DbField("requestType", 3, DefinedDataTypes.text, null, null, null, "request_type", ColumnType.OptionalData), 
			new DbField("internalRefId", 4, DefinedDataTypes.id, null, null, null, "internal_ref_id", ColumnType.RequiredData), 
			new DbField("refText", 5, DefinedDataTypes.text, null, null, null, "ref_text", ColumnType.OptionalData), 
			new DbField("usn", 6, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("name", 7, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("narration", 8, DefinedDataTypes.text, null, null, null, "narration", ColumnType.OptionalData), 
			new DbField("oldValue", 9, DefinedDataTypes.text, null, null, null, "old_value", ColumnType.OptionalData), 
			new DbField("newValue", 10, DefinedDataTypes.text, null, null, null, "new_value", ColumnType.OptionalData), 
			new DbField("requestedByStaff", 11, DefinedDataTypes.id, null, null, null, "requested_by_staff", ColumnType.OptionalData), 
			new DbField("requestedDate", 12, DefinedDataTypes.date, null, null, null, "requested_date", ColumnType.OptionalData), 
			new DbField("contactPerson", 13, DefinedDataTypes.text, null, null, null, "contact_person", ColumnType.OptionalData), 
			new DbField("contactPhone", 14, DefinedDataTypes.text, null, null, null, "contact_phone", ColumnType.OptionalData), 
			new DbField("approvalStatus", 15, DefinedDataTypes.text, null, null, null, "approval_status", ColumnType.RequiredData), 
			new DbField("disposalRemarks", 16, DefinedDataTypes.text, null, null, null, "disposal_remarks", ColumnType.OptionalData), 
			new DbField("disposedDate", 17, DefinedDataTypes.date, null, null, null, "disposed_date", ColumnType.OptionalData), 
			new DbField("disposedByUser", 18, DefinedDataTypes.id, null, null, null, "disposed_by_user", ColumnType.OptionalData), 
			new DbField("disposedByName", 19, DefinedDataTypes.text, null, null, null, "disposed_by_name", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, true, false, true, false};
	private static final String SELECT = "SELECT approval_id, institute_id, season_id, request_type, internal_ref_id, ref_text, usn, name, narration, old_value, new_value, requested_by_staff, requested_date, contact_person, contact_phone, approval_status, disposal_remarks, disposed_date, disposed_by_user, disposed_by_name FROM approvals";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
	private static final  String INSERT = "INSERT INTO approvals(institute_id, season_id, request_type, internal_ref_id, ref_text, usn, name, narration, old_value, new_value, requested_by_staff, requested_date, contact_person, contact_phone, approval_status, disposal_remarks, disposed_date, disposed_by_user, disposed_by_name) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
	private static final String WHERE = " WHERE approval_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE approvals SET season_id= ? , request_type= ? , internal_ref_id= ? , ref_text= ? , usn= ? , name= ? , narration= ? , old_value= ? , new_value= ? , requested_by_staff= ? , requested_date= ? , contact_person= ? , contact_phone= ? , approval_status= ? , disposal_remarks= ? , disposed_date= ? , disposed_by_user= ? , disposed_by_name= ?  WHERE approval_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1};
	private static final String DELETE = "DELETE FROM approvals";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public ApprovalSchema() {
		this.name = "approval";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "approvals";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(20, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "approval_id", 0, null);
		this.initialize();
	}

	@Override
	public ApprovalData newSchemaData() {
		return new ApprovalData(this, null);
	}

	@Override
	protected ApprovalData newSchemaData(final Object[] data) {
		return new ApprovalData(this, data);
	}

	@Override
	public ApprovalData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ApprovalData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ApprovalData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ApprovalData) super.parseKeys(json, ctx);
	}

	@Override
	public ApprovalDataTable newSchemaDataTable() {
		return new ApprovalDataTable(this, null);
	}

	@Override
	protected ApprovalDataTable newSchemaDataTable(final Object[][] data) {
		return new ApprovalDataTable(this, data);
	}

	@Override
	public ApprovalDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ApprovalDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
