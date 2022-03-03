package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.FilterWithSchemaSql;
import org.simplity.fm.test.gen.schema.StudentSchema;
import org.simplity.fm.test.gen.schema.StudentDataTable;

/** generated class for FSql */
public class FSql extends FilterWithSchemaSql<StudentDataTable> {
	private static final String SQL = "where department_id=? order by department_id, ?";
	private static final Field[] IN = {
			new Field("departmentId", 0, DefinedDataTypes.id, null, null, null, false),
			new Field("sortBy", 1, DefinedDataTypes.text, null, null, null, false)};

	/** default constructor */
	public FSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
		this.schema = new StudentSchema();
	}

	/**
	 * set value for departmentId
	 * @param value to be assigned to departmentId
	 */
	public void setDepartmentId(long value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for sortBy
	 * @param value to be assigned to sortBy
	 */
	public void setSortBy(String value){
		this.inputData.setValue(1, value);
	}
}
