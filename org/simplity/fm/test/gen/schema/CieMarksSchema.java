package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.DbField;
import org.simplity.fm.core.data.Schema;
import org.simplity.fm.core.validn.IValidation;
import org.simplity.fm.core.data.DbAssistant;
import org.simplity.fm.core.service.IServiceContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.data.ColumnType;
import org.simplity.fm.core.validn.DependentListValidation;
import org.simplity.fm.test.gen.DefinedDataTypes;

/**
 * class that represents structure of cieMarks
 */ 
public class CieMarksSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("studentAssessmentId", 0, DefinedDataTypes.id, null, null, null, "student_assessment_id", ColumnType.RequiredData), 
			new DbField("assessmentSchemeId", 1, DefinedDataTypes.id, null, null, null, "assessment_seq_no", ColumnType.RequiredData), 
			new DbField("assessmentSeqNo", 2, DefinedDataTypes.integer, null, null, null, "assessment_seq_no", ColumnType.RequiredData), 
			new DbField("marksScored", 3, DefinedDataTypes.integer, null, null, null, "marks_scored", ColumnType.OptionalData), 
			new DbField("hasAttended", 4, DefinedDataTypes.bool, null, null, null, "has_attended", ColumnType.OptionalData), 
			new DbField("marks", 5, DefinedDataTypes.text, null, null, null, null, ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT student_assessment_id, assessment_seq_no, assessment_seq_no, marks_scored, has_attended, null FROM student_assessments";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public CieMarksSchema() {
		this.name = "cieMarks";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "student_assessments";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(6, null, SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public CieMarksData newSchemaData() {
		return new CieMarksData(this, null);
	}

	@Override
	protected CieMarksData newSchemaData(final Object[] data) {
		return new CieMarksData(this, data);
	}

	@Override
	public CieMarksData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (CieMarksData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public CieMarksData parseKeys(JsonObject json, IServiceContext ctx) {
		return (CieMarksData) super.parseKeys(json, ctx);
	}

	@Override
	public CieMarksDataTable newSchemaDataTable() {
		return new CieMarksDataTable(this, null);
	}

	@Override
	protected CieMarksDataTable newSchemaDataTable(final Object[][] data) {
		return new CieMarksDataTable(this, data);
	}

	@Override
	public CieMarksDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (CieMarksDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
