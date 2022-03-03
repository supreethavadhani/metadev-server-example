package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for UpdateCieSql */
public class UpdateCieSql extends WriteSql {
	private static final String SQL = "update subject_registers set cie_marks=?, has_cie_shortage=?, is_eligible_for_exam=? where subject_register_id=?";
	private static final Field[] IN = {
			new Field("cieMarks", 0, DefinedDataTypes.integer, null, null, null, false),
			new Field("hasCieShortage", 1, DefinedDataTypes.bool, null, null, null, false),
			new Field("isEligibleForExam", 2, DefinedDataTypes.bool, null, null, null, false),
			new Field("subjectRegisterId", 3, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public UpdateCieSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for cieMarks
	 * @param value to be assigned to cieMarks
	 */
	public void setCieMarks(long value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for hasCieShortage
	 * @param value to be assigned to hasCieShortage
	 */
	public void setHasCieShortage(boolean value){
		this.inputData.setValue(1, value);
	}

	/**
	 * set value for isEligibleForExam
	 * @param value to be assigned to isEligibleForExam
	 */
	public void setIsEligibleForExam(boolean value){
		this.inputData.setValue(2, value);
	}

	/**
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.inputData.setValue(3, value);
	}
}
