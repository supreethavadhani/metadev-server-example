package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.ReadSql;

/** generated class for NbrSectionEnrollmentsSql */
public class NbrSectionEnrollmentsSql extends ReadSql<NbrSectionEnrollmentsSql.OutputVo> {
	private static final String SQL = "select count(student_id) from subject_registers where subject_section_id=?";
	private static final Field[] IN = {
			new Field("subjectSectionId", 0, DefinedDataTypes.id, null, null, null, false)};
	protected static final Field[] OUT = {
			new Field("nbrStudents", 0, DefinedDataTypes.integer, null, null, null, false)};

	/** default constructor */
	public NbrSectionEnrollmentsSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for subjectSectionId
	 * @param value to be assigned to subjectSectionId
	 */
	public void setSubjectSectionId(long value){
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
	 * @return value of nbrStudents
	 */
		public long getNbrStudents(){
			return super.getLongValue(0);
		}

	@Override
	public OutputVo newInstance(Object[] arr) {
		return new OutputVo(OUT);
	}
	}
}
