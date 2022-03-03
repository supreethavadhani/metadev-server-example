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
 * class that represents structure of pendingApproval
 */ 
public class PendingApprovalSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("approvalId", 0, DefinedDataTypes.id, null, null, null, "approval_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("requestType", 2, DefinedDataTypes.text, null, null, null, "request_type", ColumnType.RequiredData), 
			new DbField("internalRefId", 3, DefinedDataTypes.id, null, null, null, "internal_ref_id", ColumnType.RequiredData), 
			new DbField("refText", 4, DefinedDataTypes.text, null, null, null, "ref_text", ColumnType.OptionalData), 
			new DbField("usn", 5, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("name", 6, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("requestedDate", 7, DefinedDataTypes.date, null, null, null, "requested_date", ColumnType.OptionalData), 
			new DbField("contactPerson", 8, DefinedDataTypes.text, null, null, null, "contact_person", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT approval_id, institute_id, request_type, internal_ref_id, ref_text, usn, name, requested_date, contact_person FROM pending_approvals";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8};
	private static final  String INSERT = "INSERT INTO pending_approvals(institute_id, request_type, internal_ref_id, ref_text, usn, name, requested_date, contact_person) values (?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6, 7, 8};
	private static final String WHERE = " WHERE approval_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE pending_approvals SET request_type= ? , internal_ref_id= ? , ref_text= ? , usn= ? , name= ? , requested_date= ? , contact_person= ?  WHERE approval_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 0, 1};
	private static final String DELETE = "DELETE FROM pending_approvals";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public PendingApprovalSchema() {
		this.name = "pendingApproval";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "pending_approvals";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(9, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "approval_id", 0, null);
		this.initialize();
	}

	@Override
	public PendingApprovalData newSchemaData() {
		return new PendingApprovalData(this, null);
	}

	@Override
	protected PendingApprovalData newSchemaData(final Object[] data) {
		return new PendingApprovalData(this, data);
	}

	@Override
	public PendingApprovalData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (PendingApprovalData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public PendingApprovalData parseKeys(JsonObject json, IServiceContext ctx) {
		return (PendingApprovalData) super.parseKeys(json, ctx);
	}

	@Override
	public PendingApprovalDataTable newSchemaDataTable() {
		return new PendingApprovalDataTable(this, null);
	}

	@Override
	protected PendingApprovalDataTable newSchemaDataTable(final Object[][] data) {
		return new PendingApprovalDataTable(this, data);
	}

	@Override
	public PendingApprovalDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (PendingApprovalDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
