package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for UpdateInitialMarksSql */
public class UpdateInitialMarksSql extends WriteSql {
	private static final String SQL = "update coded_papers set initial_marks=?, intial_evaluator_id=?, requires2=?, effective_marks=? where paper_code=? and institute_id=?";
	private static final Field[] IN = {
			new Field("initialMarks", 0, DefinedDataTypes.integer, null, null, null, false),
			new Field("initialEvaluatorId", 1, DefinedDataTypes.id, null, null, null, false),
			new Field("requires2", 2, DefinedDataTypes.bool, null, null, null, false),
			new Field("effectiveMarks", 3, DefinedDataTypes.integer, null, null, null, false),
			new Field("paperCode", 4, DefinedDataTypes.text, null, null, null, false),
			new Field("instituteId", 5, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public UpdateInitialMarksSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for initialMarks
	 * @param value to be assigned to initialMarks
	 */
	public void setInitialMarks(long value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for initialEvaluatorId
	 * @param value to be assigned to initialEvaluatorId
	 */
	public void setInitialEvaluatorId(long value){
		this.inputData.setValue(1, value);
	}

	/**
	 * set value for requires2
	 * @param value to be assigned to requires2
	 */
	public void setRequires2(boolean value){
		this.inputData.setValue(2, value);
	}

	/**
	 * set value for effectiveMarks
	 * @param value to be assigned to effectiveMarks
	 */
	public void setEffectiveMarks(long value){
		this.inputData.setValue(3, value);
	}

	/**
	 * set value for paperCode
	 * @param value to be assigned to paperCode
	 */
	public void setPaperCode(String value){
		this.inputData.setValue(4, value);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.inputData.setValue(5, value);
	}
}
