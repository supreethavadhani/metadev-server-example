package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.FilterWithSchemaSql;
import org.simplity.fm.test.gen.schema.ExamRegisterSchema;
import org.simplity.fm.test.gen.schema.ExamRegisterDataTable;

/** generated class for FilterExamRegisterSql */
public class FilterExamRegisterSql extends FilterWithSchemaSql<ExamRegisterDataTable> {
	private static final String SQL = "where offered_subject_id=? and institute_id=? and is_eligible_for_exam=true order by usn";
	private static final Field[] IN = {
			new Field("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, false),
			new Field("instituteId", 1, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public FilterExamRegisterSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
		this.schema = new ExamRegisterSchema();
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.inputData.setValue(1, value);
	}
}
