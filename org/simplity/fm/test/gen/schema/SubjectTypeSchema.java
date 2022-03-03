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
 * class that represents structure of subjectType
 */ 
public class SubjectTypeSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectTypeId", 0, DefinedDataTypes.id, null, null, null, "subject_type_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("isIntegrated", 3, DefinedDataTypes.bool, null, null, null, "is_integrated", ColumnType.RequiredData), 
			new DbField("createdAt", 4, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 5, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT subject_type_id, institute_id, name, is_integrated, created_at, updated_at FROM subject_types";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5};
	private static final  String INSERT = "INSERT INTO subject_types(institute_id, name, is_integrated, created_at, updated_at) values (?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3};
	private static final String WHERE = " WHERE subject_type_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE subject_types SET name= ? , is_integrated= ? , updated_at= CURRENT_TIMESTAMP  WHERE subject_type_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 0, 1};
	private static final String DELETE = "DELETE FROM subject_types";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public SubjectTypeSchema() {
		this.name = "subjectType";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "subject_types";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(6, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "subject_type_id", 0, null);
		this.initialize();
	}

	@Override
	public SubjectTypeData newSchemaData() {
		return new SubjectTypeData(this, null);
	}

	@Override
	protected SubjectTypeData newSchemaData(final Object[] data) {
		return new SubjectTypeData(this, data);
	}

	@Override
	public SubjectTypeData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (SubjectTypeData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public SubjectTypeData parseKeys(JsonObject json, IServiceContext ctx) {
		return (SubjectTypeData) super.parseKeys(json, ctx);
	}

	@Override
	public SubjectTypeDataTable newSchemaDataTable() {
		return new SubjectTypeDataTable(this, null);
	}

	@Override
	protected SubjectTypeDataTable newSchemaDataTable(final Object[][] data) {
		return new SubjectTypeDataTable(this, data);
	}

	@Override
	public SubjectTypeDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (SubjectTypeDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
