package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.FilterSql;

/** generated class for FilterAttendeeIdsSql */
public class FilterAttendeeIdsSql extends FilterSql<FilterAttendeeIdsSql.OutputVo> {
	private static final String SQL = "select subject_register_id from exam_attendees where offered_subject_id=? and is_makeup=? and institute_id=?";
	private static final Field[] IN = {
			new Field("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, false),
			new Field("isMakeup", 1, DefinedDataTypes.bool, null, null, null, false),
			new Field("instituteId", 2, DefinedDataTypes.id, null, null, null, false)};
	protected static final Field[] OUT = {
			new Field("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public FilterAttendeeIdsSql() {
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

	/**
	 * set value for isMakeup
	 * @param value to be assigned to isMakeup
	 */
	public void setIsMakeup(boolean value){
		this.inputData.setValue(1, value);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.inputData.setValue(2, value);
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
	 * @return value of subjectRegisterId
	 */
		public long getSubjectRegisterId(){
			return super.getLongValue(0);
		}

	@Override
	public OutputVo newInstance(Object[] arr) {
		return new OutputVo(OUT);
	}
	}
}
