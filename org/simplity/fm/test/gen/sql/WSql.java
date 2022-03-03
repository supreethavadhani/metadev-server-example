package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for WSql */
public class WSql extends WriteSql {
	private static final String SQL = "update students set name=? where student_id=?";
	private static final Field[] IN = {
			new Field("name", 0, DefinedDataTypes.name, null, null, null, false),
			new Field("studentId", 1, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public WSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.inputData.setValue(1, value);
	}
}
