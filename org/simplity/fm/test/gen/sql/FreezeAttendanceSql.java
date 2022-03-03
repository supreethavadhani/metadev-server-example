package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for FreezeAttendanceSql */
public class FreezeAttendanceSql extends WriteSql {
	private static final String SQL = "update seasons set attendance_entry_frozen=true where season_id=?";
	private static final Field[] IN = {
			new Field("seasonId", 0, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public FreezeAttendanceSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for seasonId
	 * @param value to be assigned to seasonId
	 */
	public void setSeasonId(long value){
		this.inputData.setValue(0, value);
	}
}
