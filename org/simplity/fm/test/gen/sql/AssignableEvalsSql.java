package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.FilterWithSchemaSql;
import org.simplity.fm.test.gen.schema.AssignableEvaluatorSchema;
import org.simplity.fm.test.gen.schema.AssignableEvaluatorDataTable;

/** generated class for AssignableEvalsSql */
public class AssignableEvalsSql extends FilterWithSchemaSql<AssignableEvaluatorDataTable> {
	private static final String SQL = "where institute_id=? order by name";
	private static final Field[] IN = {
			new Field("instituteId", 0, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public AssignableEvalsSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
		this.schema = new AssignableEvaluatorSchema();
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.inputData.setValue(0, value);
	}
}
