package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for UpdateApprovalSql */
public class UpdateApprovalSql extends WriteSql {
	private static final String SQL = "update approvals set approval_status=?, disposal_remarks=?, disposed_by_user=?, disposed_by_name=?, disposed_date=CURRENT_DATE where approval_id=?";
	private static final Field[] IN = {
			new Field("approvalStatus", 0, DefinedDataTypes.text, null, null, null, false),
			new Field("disposalRemarks", 1, DefinedDataTypes.text, null, null, null, false),
			new Field("disposedByUser", 2, DefinedDataTypes.id, null, null, null, false),
			new Field("disposedByName", 3, DefinedDataTypes.text, null, null, null, false),
			new Field("approvalId", 4, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public UpdateApprovalSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for approvalStatus
	 * @param value to be assigned to approvalStatus
	 */
	public void setApprovalStatus(String value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for disposalRemarks
	 * @param value to be assigned to disposalRemarks
	 */
	public void setDisposalRemarks(String value){
		this.inputData.setValue(1, value);
	}

	/**
	 * set value for disposedByUser
	 * @param value to be assigned to disposedByUser
	 */
	public void setDisposedByUser(long value){
		this.inputData.setValue(2, value);
	}

	/**
	 * set value for disposedByName
	 * @param value to be assigned to disposedByName
	 */
	public void setDisposedByName(String value){
		this.inputData.setValue(3, value);
	}

	/**
	 * set value for approvalId
	 * @param value to be assigned to approvalId
	 */
	public void setApprovalId(long value){
		this.inputData.setValue(4, value);
	}
}
