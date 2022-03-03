package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for UpdateChallengeMarksSql */
public class UpdateChallengeMarksSql extends WriteSql {
	private static final String SQL = "update coded_papers set marks3=?, evaluator3_id=?, effective_marks=? where paper_code=? and institute_id=?";
	private static final Field[] IN = {
			new Field("marks3", 0, DefinedDataTypes.integer, null, null, null, false),
			new Field("evaluator3Id", 1, DefinedDataTypes.id, null, null, null, false),
			new Field("effectiveMarks", 2, DefinedDataTypes.integer, null, null, null, false),
			new Field("paperCode", 3, DefinedDataTypes.text, null, null, null, false),
			new Field("instituteId", 4, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public UpdateChallengeMarksSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for marks3
	 * @param value to be assigned to marks3
	 */
	public void setMarks3(long value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for evaluator3Id
	 * @param value to be assigned to evaluator3Id
	 */
	public void setEvaluator3Id(long value){
		this.inputData.setValue(1, value);
	}

	/**
	 * set value for effectiveMarks
	 * @param value to be assigned to effectiveMarks
	 */
	public void setEffectiveMarks(long value){
		this.inputData.setValue(2, value);
	}

	/**
	 * set value for paperCode
	 * @param value to be assigned to paperCode
	 */
	public void setPaperCode(String value){
		this.inputData.setValue(3, value);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.inputData.setValue(4, value);
	}
}
