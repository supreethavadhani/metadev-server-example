package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.FilterSql;

/** generated class for F1Sql */
public class F1Sql extends FilterSql<F1Sql.OutputVo> {
	private static final String SQL = "select offeredSubjectId from offered_subjects where department_id=? order by department_id, ?";
	private static final Field[] IN = {
			new Field("departmentId", 0, DefinedDataTypes.id, null, null, null, false),
			new Field("sortBy", 1, DefinedDataTypes.text, null, null, null, false)};
	protected static final Field[] OUT = {
			new Field("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public F1Sql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
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

	@Override
	protected OutputVo newOutputData() {
		return new OutputVo(OUT);
	}

	/** VO with output fields from this Sql */
	public static class OutputVo extends ValueObject {

		/**
		 * @param fields
		 */
		public OutputVo(final Field[] fields) {
			super(fields, null);
		}

		/**
	 * @return value of offeredSubjectId
	 */
		public long getOfferedSubjectId(){
			return super.getLongValue(0);
		}

	@Override
	public OutputVo newInstance(Object[] arr) {
		return new OutputVo(OUT);
	}
	}
}
