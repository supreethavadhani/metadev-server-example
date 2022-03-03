package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.ReadSql;

/** generated class for GetCieSql */
public class GetCieSql extends ReadSql<GetCieSql.OutputVo> {
	private static final String SQL = "select cie_marks from subject_registers where institute_id=? and offered_subject_id=? and student_id=?";
	private static final Field[] IN = {
			new Field("instituteId", 0, DefinedDataTypes.id, null, null, null, false),
			new Field("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, false),
			new Field("studentId", 2, DefinedDataTypes.id, null, null, null, false)};
	protected static final Field[] OUT = {
			new Field("cieMarks", 0, DefinedDataTypes.integer, null, null, null, false)};

	/** default constructor */
	public GetCieSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.inputData.setValue(1, value);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
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
	 * @return value of cieMarks
	 */
		public long getCieMarks(){
			return super.getLongValue(0);
		}

	@Override
	public OutputVo newInstance(Object[] arr) {
		return new OutputVo(OUT);
	}
	}
}
