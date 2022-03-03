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
 * class that represents structure of currentApproval
 */ 
public class CurrentApprovalSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("approvalId", 0, DefinedDataTypes.id, null, null, null, "approval_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("requestType", 2, DefinedDataTypes.text, null, null, null, "request_type", ColumnType.RequiredData), 
			new DbField("internalRefId", 3, DefinedDataTypes.id, null, null, null, "internal_ref_id", ColumnType.RequiredData), 
			new DbField("refText", 4, DefinedDataTypes.text, null, null, null, "ref_text", ColumnType.OptionalData), 
			new DbField("usn", 5, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("name", 6, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("requestedDate", 7, DefinedDataTypes.date, null, null, null, "requested_date", ColumnType.OptionalData), 
			new DbField("contactPerson", 8, DefinedDataTypes.text, null, null, null, "contact_person", ColumnType.OptionalData), 
			new DbField("approvalStatus", 9, DefinedDataTypes.text, null, null, null, "approval_status", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT approval_id, institute_id, request_type, internal_ref_id, ref_text, usn, name, requested_date, contact_person, approval_status FROM current_approvals";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final  String INSERT = "INSERT INTO current_approvals(institute_id, request_type, internal_ref_id, ref_text, usn, name, requested_date, contact_person, approval_status) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final String WHERE = " WHERE approval_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE current_approvals SET request_type= ? , internal_ref_id= ? , ref_text= ? , usn= ? , name= ? , requested_date= ? , contact_person= ? , approval_status= ?  WHERE approval_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
	private static final String DELETE = "DELETE FROM current_approvals";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public CurrentApprovalSchema() {
		this.name = "currentApproval";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "current_approvals";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(10, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "approval_id", 0, null);
		this.initialize();
	}

	@Override
	public CurrentApprovalData newSchemaData() {
		return new CurrentApprovalData(this, null);
	}

	@Override
	protected CurrentApprovalData newSchemaData(final Object[] data) {
		return new CurrentApprovalData(this, data);
	}

	@Override
	public CurrentApprovalData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (CurrentApprovalData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public CurrentApprovalData parseKeys(JsonObject json, IServiceContext ctx) {
		return (CurrentApprovalData) super.parseKeys(json, ctx);
	}

	@Override
	public CurrentApprovalDataTable newSchemaDataTable() {
		return new CurrentApprovalDataTable(this, null);
	}

	@Override
	protected CurrentApprovalDataTable newSchemaDataTable(final Object[][] data) {
		return new CurrentApprovalDataTable(this, data);
	}

	@Override
	public CurrentApprovalDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (CurrentApprovalDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
