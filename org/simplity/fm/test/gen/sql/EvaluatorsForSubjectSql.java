package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.FilterWithSchemaSql;
import org.simplity.fm.test.gen.schema.EvaluatorSchema;
import org.simplity.fm.test.gen.schema.EvaluatorDataTable;

/** generated class for EvaluatorsForSubjectSql */
public class EvaluatorsForSubjectSql extends FilterWithSchemaSql<EvaluatorDataTable> {
	private static final String SQL = "where offered_subject_id=? order by name";
	private static final Field[] IN = {
			new Field("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public EvaluatorsForSubjectSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
		this.schema = new EvaluatorSchema();
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.inputData.setValue(0, value);
	}
}
