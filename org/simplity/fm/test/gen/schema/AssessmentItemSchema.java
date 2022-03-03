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
 * class that represents structure of assessmentItem
 */ 
public class AssessmentItemSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("assessmentSchemeId", 0, DefinedDataTypes.id, null, null, null, "assessment_scheme_id", ColumnType.PrimaryKey), 
			new DbField("seqNo", 1, DefinedDataTypes.integer, null, null, null, "seq_no", ColumnType.PrimaryKey), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("name", 3, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("maxMarks", 4, DefinedDataTypes.integer, null, null, null, "max_marks", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT assessment_scheme_id, seq_no, institute_id, name, max_marks FROM assessment_items";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4};
	private static final  String INSERT = "INSERT INTO assessment_items(assessment_scheme_id, seq_no, institute_id, name, max_marks) values (?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4};
	private static final String WHERE = " WHERE assessment_scheme_id=? AND seq_no=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1, 2};
	private static final  String UPDATE = "UPDATE assessment_items SET name= ? , max_marks= ?  WHERE assessment_scheme_id=? AND seq_no=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {3, 4, 0, 1, 2};
	private static final String DELETE = "DELETE FROM assessment_items";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AssessmentItemSchema() {
		this.name = "assessmentItem";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "assessment_items";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(5, this.fields[2], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public AssessmentItemData newSchemaData() {
		return new AssessmentItemData(this, null);
	}

	@Override
	protected AssessmentItemData newSchemaData(final Object[] data) {
		return new AssessmentItemData(this, data);
	}

	@Override
	public AssessmentItemData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AssessmentItemData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AssessmentItemData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AssessmentItemData) super.parseKeys(json, ctx);
	}

	@Override
	public AssessmentItemDataTable newSchemaDataTable() {
		return new AssessmentItemDataTable(this, null);
	}

	@Override
	protected AssessmentItemDataTable newSchemaDataTable(final Object[][] data) {
		return new AssessmentItemDataTable(this, data);
	}

	@Override
	public AssessmentItemDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AssessmentItemDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
