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
 * class that represents structure of subjectList
 */ 
public class SubjectListSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectId", 0, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "subject_name", ColumnType.RequiredData), 
			new DbField("code", 3, DefinedDataTypes.code, null, null, null, "code", ColumnType.RequiredData), 
			new DbField("department", 4, DefinedDataTypes.text, null, null, null, "department_name", ColumnType.RequiredData), 
			new DbField("lectureCredits", 5, DefinedDataTypes.integer, null, null, null, "lecture_credits", ColumnType.RequiredData), 
			new DbField("practicalCredits", 6, DefinedDataTypes.integer, null, null, null, "practical_credits", ColumnType.RequiredData), 
			new DbField("tutorialCredits", 7, DefinedDataTypes.integer, null, null, null, "tutorial_credits", ColumnType.RequiredData), 
			new DbField("totalCredits", 8, DefinedDataTypes.integer, null, null, null, "total_credits", ColumnType.RequiredData), 
			new DbField("isActive", 9, DefinedDataTypes.bool, null, null, null, "is_active", ColumnType.RequiredData), 
			new DbField("parentId", 10, DefinedDataTypes.id, null, null, null, "parent_id", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT subject_id, institute_id, subject_name, code, department_name, lecture_credits, practical_credits, tutorial_credits, total_credits, is_active, parent_id FROM subject_list";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static final  String INSERT = "INSERT INTO subject_list(subject_id, institute_id, subject_name, code, department_name, lecture_credits, practical_credits, tutorial_credits, total_credits, is_active, parent_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static final String WHERE = " WHERE subject_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE subject_list SET subject_name= ? , code= ? , department_name= ? , lecture_credits= ? , practical_credits= ? , tutorial_credits= ? , total_credits= ? , is_active= ? , parent_id= ?  WHERE subject_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1};
	private static final String DELETE = "DELETE FROM subject_list";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public SubjectListSchema() {
		this.name = "subjectList";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "subject_list";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(11, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public SubjectListData newSchemaData() {
		return new SubjectListData(this, null);
	}

	@Override
	protected SubjectListData newSchemaData(final Object[] data) {
		return new SubjectListData(this, data);
	}

	@Override
	public SubjectListData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (SubjectListData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public SubjectListData parseKeys(JsonObject json, IServiceContext ctx) {
		return (SubjectListData) super.parseKeys(json, ctx);
	}

	@Override
	public SubjectListDataTable newSchemaDataTable() {
		return new SubjectListDataTable(this, null);
	}

	@Override
	protected SubjectListDataTable newSchemaDataTable(final Object[][] data) {
		return new SubjectListDataTable(this, data);
	}

	@Override
	public SubjectListDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (SubjectListDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
