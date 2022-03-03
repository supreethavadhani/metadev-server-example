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
 * class that represents structure of assessmentItemName
 */ 
public class AssessmentItemNameSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("instituteId", 0, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("assessmentSchemeId", 1, DefinedDataTypes.id, null, null, null, "assessment_scheme_id", ColumnType.PrimaryKey), 
			new DbField("seqNo", 2, DefinedDataTypes.id, null, null, null, "seq_no", ColumnType.PrimaryKey), 
			new DbField("maxMarks", 3, DefinedDataTypes.integer, null, null, null, "max_marks", ColumnType.RequiredData), 
			new DbField("name", 4, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT institute_id, assessment_scheme_id, seq_no, max_marks, name FROM assessment_items";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4};
	private static final  String INSERT = "INSERT INTO assessment_items(institute_id, assessment_scheme_id, seq_no, max_marks, name) values (?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4};
	private static final String WHERE = " WHERE assessment_scheme_id=? AND seq_no=? AND institute_id=?";
	private static final int[] WHERE_IDX = {1, 2, 0};
	private static final  String UPDATE = "UPDATE assessment_items SET max_marks= ? , name= ?  WHERE assessment_scheme_id=? AND seq_no=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {3, 4, 1, 2, 0};
	private static final String DELETE = "DELETE FROM assessment_items";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AssessmentItemNameSchema() {
		this.name = "assessmentItemName";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "assessment_items";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(5, this.fields[0], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public AssessmentItemNameData newSchemaData() {
		return new AssessmentItemNameData(this, null);
	}

	@Override
	protected AssessmentItemNameData newSchemaData(final Object[] data) {
		return new AssessmentItemNameData(this, data);
	}

	@Override
	public AssessmentItemNameData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AssessmentItemNameData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AssessmentItemNameData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AssessmentItemNameData) super.parseKeys(json, ctx);
	}

	@Override
	public AssessmentItemNameDataTable newSchemaDataTable() {
		return new AssessmentItemNameDataTable(this, null);
	}

	@Override
	protected AssessmentItemNameDataTable newSchemaDataTable(final Object[][] data) {
		return new AssessmentItemNameDataTable(this, data);
	}

	@Override
	public AssessmentItemNameDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AssessmentItemNameDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
