package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.ReadSql;

/** generated class for NbrItemsInSchemeSql */
public class NbrItemsInSchemeSql extends ReadSql<NbrItemsInSchemeSql.OutputVo> {
	private static final String SQL = "select count(*) from assessment_items where assessment_scheme_id=?";
	private static final Field[] IN = {
			new Field("assessmentSchemeId", 0, DefinedDataTypes.id, null, null, null, false)};
	protected static final Field[] OUT = {
			new Field("nbrItems", 0, DefinedDataTypes.integer, null, null, null, false)};

	/** default constructor */
	public NbrItemsInSchemeSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for assessmentSchemeId
	 * @param value to be assigned to assessmentSchemeId
	 */
	public void setAssessmentSchemeId(long value){
		this.inputData.setValue(0, value);
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
	 * @return value of nbrItems
	 */
		public long getNbrItems(){
			return super.getLongValue(0);
		}

	@Override
	public OutputVo newInstance(Object[] arr) {
		return new OutputVo(OUT);
	}
	}
}
