package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for CondoneAttendanceSql */
public class CondoneAttendanceSql extends WriteSql {
	private static final String SQL = "update subject_registers set is_condoned=true, is_eligible_for_exam=? where subject_register_id=?";
	private static final Field[] IN = {
			new Field("iEligibleForExam", 0, DefinedDataTypes.bool, null, null, null, false),
			new Field("subjectRegisterId", 1, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public CondoneAttendanceSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for iEligibleForExam
	 * @param value to be assigned to iEligibleForExam
	 */
	public void setIEligibleForExam(boolean value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.inputData.setValue(1, value);
	}
}
