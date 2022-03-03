package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for UnfreezeAttendanceSectionSql */
public class UnfreezeAttendanceSectionSql extends WriteSql {
	private static final String SQL = "update subject_sections set attendance_frozen=false where subject_section_id=?";
	private static final Field[] IN = {
			new Field("subjectSectionId", 0, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public UnfreezeAttendanceSectionSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for subjectSectionId
	 * @param value to be assigned to subjectSectionId
	 */
	public void setSubjectSectionId(long value){
		this.inputData.setValue(0, value);
	}
}
