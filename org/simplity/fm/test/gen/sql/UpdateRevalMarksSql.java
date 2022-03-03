package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for UpdateRevalMarksSql */
public class UpdateRevalMarksSql extends WriteSql {
	private static final String SQL = "update coded_papers set marks2=?, evaluator2_id=?, requires3=?, effective_marks=? where paper_code=? and institute_id=?";
	private static final Field[] IN = {
			new Field("marks2", 0, DefinedDataTypes.integer, null, null, null, false),
			new Field("evaluator2Id", 1, DefinedDataTypes.id, null, null, null, false),
			new Field("requires3", 2, DefinedDataTypes.bool, null, null, null, false),
			new Field("effectiveMarks", 3, DefinedDataTypes.integer, null, null, null, false),
			new Field("paperCode", 4, DefinedDataTypes.text, null, null, null, false),
			new Field("instituteId", 5, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public UpdateRevalMarksSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for marks2
	 * @param value to be assigned to marks2
	 */
	public void setMarks2(long value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for evaluator2Id
	 * @param value to be assigned to evaluator2Id
	 */
	public void setEvaluator2Id(long value){
		this.inputData.setValue(1, value);
	}

	/**
	 * set value for requires3
	 * @param value to be assigned to requires3
	 */
	public void setRequires3(boolean value){
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
