package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.ReadSql;

/** generated class for GetOfferIdSql */
public class GetOfferIdSql extends ReadSql<GetOfferIdSql.OutputVo> {
	private static final String SQL = "select offered_subject_id from offered_subjects where subject_id=? and season_id=?";
	private static final Field[] IN = {
			new Field("subjectId", 0, DefinedDataTypes.id, null, null, null, false),
			new Field("seasonId", 1, DefinedDataTypes.id, null, null, null, false)};
	protected static final Field[] OUT = {
			new Field("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public GetOfferIdSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for subjectId
	 * @param value to be assigned to subjectId
	 */
	public void setSubjectId(long value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for seasonId
	 * @param value to be assigned to seasonId
	 */
	public void setSeasonId(long value){
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
