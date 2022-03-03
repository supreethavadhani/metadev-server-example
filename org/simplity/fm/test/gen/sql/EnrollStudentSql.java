package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for EnrollStudentSql */
public class EnrollStudentSql extends WriteSql {
	private static final String SQL = "update students set level_id=?, level_section_id=? where institute_id=? and student_id=?";
	private static final Field[] IN = {
			new Field("levelId", 0, DefinedDataTypes.id, null, null, null, false),
			new Field("levelSectionId", 1, DefinedDataTypes.id, null, null, null, false),
			new Field("instituteId", 2, DefinedDataTypes.id, null, null, null, false),
			new Field("studentId", 3, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public EnrollStudentSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for levelId
	 * @param value to be assigned to levelId
	 */
	public void setLevelId(long value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for levelSectionId
	 * @param value to be assigned to levelSectionId
	 */
	public void setLevelSectionId(long value){
		this.inputData.setValue(1, value);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.inputData.setValue(2, value);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.inputData.setValue(3, value);
	}
}
