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
 * class that represents structure of assessmentSchemeSelection
 */ 
public class AssessmentSchemeSelectionSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("departmentId", 2, DefinedDataTypes.id, null, null, "departmentList", "department_id", ColumnType.RequiredData), 
			new DbField("assessmentSchemeId", 3, DefinedDataTypes.id, null, null, "assessmentSchemeList", "assessment_scheme_id", ColumnType.RequiredData), 
			new DbField("createdAt", 4, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 5, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, false, true, false, false, false};
	private static final String SELECT = "SELECT offered_subject_id, institute_id, department_id, assessment_scheme_id, created_at, updated_at FROM offered_subjects";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5};
	private static final  String INSERT = "INSERT INTO offered_subjects(offered_subject_id, institute_id, department_id, assessment_scheme_id, created_at, updated_at) values (?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {0, 1, 2, 3};
	private static final String WHERE = " WHERE offered_subject_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE offered_subjects SET department_id= ? , assessment_scheme_id= ? , updated_at= CURRENT_TIMESTAMP  WHERE offered_subject_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 0, 1};
	private static final String DELETE = "DELETE FROM offered_subjects";
	private static final IValidation[] VALIDS = {new DependentListValidation(0, 2, "taughtSubjectList", "offeredSubjectId", null)
	};

	/**
	 *
	 */
	public AssessmentSchemeSelectionSchema() {
		this.name = "assessmentSchemeSelection";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "offered_subjects";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(6, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public AssessmentSchemeSelectionData newSchemaData() {
		return new AssessmentSchemeSelectionData(this, null);
	}

	@Override
	protected AssessmentSchemeSelectionData newSchemaData(final Object[] data) {
		return new AssessmentSchemeSelectionData(this, data);
	}

	@Override
	public AssessmentSchemeSelectionData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AssessmentSchemeSelectionData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AssessmentSchemeSelectionData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AssessmentSchemeSelectionData) super.parseKeys(json, ctx);
	}

	@Override
	public AssessmentSchemeSelectionDataTable newSchemaDataTable() {
		return new AssessmentSchemeSelectionDataTable(this, null);
	}

	@Override
	protected AssessmentSchemeSelectionDataTable newSchemaDataTable(final Object[][] data) {
		return new AssessmentSchemeSelectionDataTable(this, data);
	}

	@Override
	public AssessmentSchemeSelectionDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AssessmentSchemeSelectionDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
