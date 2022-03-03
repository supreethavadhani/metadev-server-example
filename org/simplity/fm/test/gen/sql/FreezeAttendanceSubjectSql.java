package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for FreezeAttendanceSubjectSql */
public class FreezeAttendanceSubjectSql extends WriteSql {
	private static final String SQL = "update offered_subjects set attendance_frozen=true where offered_subject_id=?";
	private static final Field[] IN = {
			new Field("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public FreezeAttendanceSubjectSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.inputData.setValue(0, value);
	}
}
