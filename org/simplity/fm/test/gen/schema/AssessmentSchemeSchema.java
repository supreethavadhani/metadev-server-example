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
 * class that represents structure of assessmentScheme
 */ 
public class AssessmentSchemeSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("assessmentSchemeId", 0, DefinedDataTypes.id, null, null, null, "assessment_scheme_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("code", 3, DefinedDataTypes.code, null, null, null, "code", ColumnType.OptionalData), 
			new DbField("cieCalculation", 4, DefinedDataTypes.text, null, null, null, "cie_calculation", ColumnType.OptionalData), 
			new DbField("minCieMarks", 5, DefinedDataTypes.integer, "0", null, null, "min_cie_marks", ColumnType.OptionalData), 
			new DbField("isActive", 6, DefinedDataTypes.bool, "true", null, null, "is_active", ColumnType.OptionalData), 
			new DbField("createdAt", 7, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 8, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT assessment_scheme_id, institute_id, name, code, cie_calculation, min_cie_marks, is_active, created_at, updated_at FROM assessment_schemes";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8};
	private static final  String INSERT = "INSERT INTO assessment_schemes(institute_id, name, code, cie_calculation, min_cie_marks, is_active, created_at, updated_at) values (?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6};
	private static final String WHERE = " WHERE assessment_scheme_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE assessment_schemes SET name= ? , code= ? , cie_calculation= ? , min_cie_marks= ? , is_active= ? , updated_at= CURRENT_TIMESTAMP  WHERE assessment_scheme_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 0, 1};
	private static final String DELETE = "DELETE FROM assessment_schemes";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AssessmentSchemeSchema() {
		this.name = "assessmentScheme";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "assessment_schemes";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(9, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "assessment_scheme_id", 0, null);
		this.initialize();
	}

	@Override
	public AssessmentSchemeData newSchemaData() {
		return new AssessmentSchemeData(this, null);
	}

	@Override
	protected AssessmentSchemeData newSchemaData(final Object[] data) {
		return new AssessmentSchemeData(this, data);
	}

	@Override
	public AssessmentSchemeData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AssessmentSchemeData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AssessmentSchemeData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AssessmentSchemeData) super.parseKeys(json, ctx);
	}

	@Override
	public AssessmentSchemeDataTable newSchemaDataTable() {
		return new AssessmentSchemeDataTable(this, null);
	}

	@Override
	protected AssessmentSchemeDataTable newSchemaDataTable(final Object[][] data) {
		return new AssessmentSchemeDataTable(this, data);
	}

	@Override
	public AssessmentSchemeDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AssessmentSchemeDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
