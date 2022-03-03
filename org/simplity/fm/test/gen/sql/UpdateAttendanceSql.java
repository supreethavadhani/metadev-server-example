package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for UpdateAttendanceSql */
public class UpdateAttendanceSql extends WriteSql {
	private static final String SQL = "update subject_registers set total_classes=?, total_attendance=?, overall_attendance=?, has_attendance_shortage=?, is_condonable=?, attendance_entered_by=?, is_eligible_for_exam=? where subject_register_id=?";
	private static final Field[] IN = {
			new Field("totalClasses", 0, DefinedDataTypes.integer, null, null, null, false),
			new Field("totalAttendance", 1, DefinedDataTypes.integer, null, null, null, false),
			new Field("overallAttendance", 2, DefinedDataTypes.text, null, null, null, false),
			new Field("hasAttendanceShortage", 3, DefinedDataTypes.bool, null, null, null, false),
			new Field("isCondonable", 4, DefinedDataTypes.bool, null, null, null, false),
			new Field("attendanceEnteredBy", 5, DefinedDataTypes.id, null, null, null, false),
			new Field("isEligibleForExam", 6, DefinedDataTypes.bool, null, null, null, false),
			new Field("subjectRegisterId", 7, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public UpdateAttendanceSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for totalClasses
	 * @param value to be assigned to totalClasses
	 */
	public void setTotalClasses(long value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for totalAttendance
	 * @param value to be assigned to totalAttendance
	 */
	public void setTotalAttendance(long value){
		this.inputData.setValue(1, value);
	}

	/**
	 * set value for overallAttendance
	 * @param value to be assigned to overallAttendance
	 */
	public void setOverallAttendance(String value){
		this.inputData.setValue(2, value);
	}

	/**
	 * set value for hasAttendanceShortage
	 * @param value to be assigned to hasAttendanceShortage
	 */
	public void setHasAttendanceShortage(boolean value){
		this.inputData.setValue(3, value);
	}

	/**
	 * set value for isCondonable
	 * @param value to be assigned to isCondonable
	 */
	public void setIsCondonable(boolean value){
		this.inputData.setValue(4, value);
	}

	/**
	 * set value for attendanceEnteredBy
	 * @param value to be assigned to attendanceEnteredBy
	 */
	public void setAttendanceEnteredBy(long value){
		this.inputData.setValue(5, value);
	}

	/**
	 * set value for isEligibleForExam
	 * @param value to be assigned to isEligibleForExam
	 */
	public void setIsEligibleForExam(boolean value){
		this.inputData.setValue(6, value);
	}

	/**
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.inputData.setValue(7, value);
	}
}
