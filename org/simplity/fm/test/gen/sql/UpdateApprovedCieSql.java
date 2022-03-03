package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for UpdateApprovedCieSql */
public class UpdateApprovedCieSql extends WriteSql {
	private static final String SQL = "update student_assessments set has_attended=?, marks_scored=?, entered_by_user_id=?, updated_at=CURRENT_TIMESTAMP where student_assessment_id=?";
	private static final Field[] IN = {
			new Field("hasAttended", 0, DefinedDataTypes.bool, null, null, null, false),
			new Field("marksScored", 1, DefinedDataTypes.integer, null, null, null, false),
			new Field("enteredByUserId", 2, DefinedDataTypes.id, null, null, null, false),
			new Field("studentAssessmentId", 3, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public UpdateApprovedCieSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for hasAttended
	 * @param value to be assigned to hasAttended
	 */
	public void setHasAttended(boolean value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for marksScored
	 * @param value to be assigned to marksScored
	 */
	public void setMarksScored(long value){
		this.inputData.setValue(1, value);
	}

	/**
	 * set value for enteredByUserId
	 * @param value to be assigned to enteredByUserId
	 */
	public void setEnteredByUserId(long value){
		this.inputData.setValue(2, value);
	}

	/**
	 * set value for studentAssessmentId
	 * @param value to be assigned to studentAssessmentId
	 */
	public void setStudentAssessmentId(long value){
		this.inputData.setValue(3, value);
	}
}
