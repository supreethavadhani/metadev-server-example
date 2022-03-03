package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.FilterWithSchemaSql;
import org.simplity.fm.test.gen.schema.PaperToCodeSchema;
import org.simplity.fm.test.gen.schema.PaperToCodeDataTable;

/** generated class for GetRevalPapersSql */
public class GetRevalPapersSql extends FilterWithSchemaSql<PaperToCodeDataTable> {
	private static final String SQL = "where offered_subject_id=? and is_makeup=? and institute_id=? and opted_for_raval=true";
	private static final Field[] IN = {
			new Field("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, false),
			new Field("isMakeup", 1, DefinedDataTypes.bool, null, null, null, false),
			new Field("instituteId", 2, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public GetRevalPapersSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
		this.schema = new PaperToCodeSchema();
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
}
