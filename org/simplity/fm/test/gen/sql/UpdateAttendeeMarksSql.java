package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for UpdateAttendeeMarksSql */
public class UpdateAttendeeMarksSql extends WriteSql {
	private static final String SQL = "update exam_attendees set final_marks=?, listed_marks=?, grade=?, eligible_for_reval=? where subject_register_id=? and is_maleup=?";
	private static final Field[] IN = {
			new Field("finalMarks", 0, DefinedDataTypes.integer, null, null, null, false),
			new Field("listedMarks", 1, DefinedDataTypes.integer, null, null, null, false),
			new Field("grade", 2, DefinedDataTypes.text, null, null, null, false),
			new Field("eligibleForReval", 3, DefinedDataTypes.bool, null, null, null, false),
			new Field("subjectRegisterId", 4, DefinedDataTypes.id, null, null, null, false),
			new Field("isMakeup", 5, DefinedDataTypes.bool, null, null, null, false)};

	/** default constructor */
	public UpdateAttendeeMarksSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for finalMarks
	 * @param value to be assigned to finalMarks
	 */
	public void setFinalMarks(long value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for listedMarks
	 * @param value to be assigned to listedMarks
	 */
	public void setListedMarks(long value){
		this.inputData.setValue(1, value);
	}

	/**
	 * set value for grade
	 * @param value to be assigned to grade
	 */
	public void setGrade(String value){
		this.inputData.setValue(2, value);
	}

	/**
	 * set value for eligibleForReval
	 * @param value to be assigned to eligibleForReval
	 */
	public void setEligibleForReval(boolean value){
		this.inputData.setValue(3, value);
	}

	/**
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.inputData.setValue(4, value);
	}

	/**
	 * set value for isMakeup
	 * @param value to be assigned to isMakeup
	 */
	public void setIsMakeup(boolean value){
		this.inputData.setValue(5, value);
	}
}
