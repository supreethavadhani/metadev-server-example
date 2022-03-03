package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for DeleteAssessmentBySubjectSql */
public class DeleteAssessmentBySubjectSql extends WriteSql {
	private static final String SQL = "delete from student_assessments where institute_id=? and offered_subject_id=?";
	private static final Field[] IN = {
			new Field("instituteId", 0, DefinedDataTypes.id, null, null, null, false),
			new Field("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public DeleteAssessmentBySubjectSql() {
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
}
