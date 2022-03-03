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
 * class that represents structure of external
 */ 
public class ExternalSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("instituteId", 0, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("externalId", 1, DefinedDataTypes.flexibleId, "-1", null, null, "external_id", ColumnType.PrimaryKey), 
			new DbField("departmentId", 2, DefinedDataTypes.id, null, null, "departmentList", "department_id", ColumnType.RequiredData), 
			new DbField("collegeName", 3, DefinedDataTypes.name, null, null, null, "college_name", ColumnType.RequiredData), 
			new DbField("name", 4, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("phoneNumber", 5, DefinedDataTypes.phone, null, null, null, "phone_number", ColumnType.RequiredData), 
			new DbField("email", 6, DefinedDataTypes.email, null, null, null, "email", ColumnType.RequiredData), 
			new DbField("isActive", 7, DefinedDataTypes.bool, "true", null, null, "is_active", ColumnType.OptionalData), 
			new DbField("createdAt", 8, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 9, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT institute_id, external_id, department_id, college_name, name, phone_number, email, is_active, created_at, updated_at FROM externals";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final  String INSERT = "INSERT INTO externals(institute_id, external_id, department_id, college_name, name, phone_number, email, is_active, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final String WHERE = " WHERE external_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {1, 0};
	private static final  String UPDATE = "UPDATE externals SET department_id= ? , college_name= ? , name= ? , phone_number= ? , email= ? , is_active= ? , updated_at= CURRENT_TIMESTAMP  WHERE external_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 1, 0};
	private static final String DELETE = "DELETE FROM externals";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public ExternalSchema() {
		this.name = "external";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "externals";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(10, this.fields[0], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public ExternalData newSchemaData() {
		return new ExternalData(this, null);
	}

	@Override
	protected ExternalData newSchemaData(final Object[] data) {
		return new ExternalData(this, data);
	}

	@Override
	public ExternalData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ExternalData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ExternalData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ExternalData) super.parseKeys(json, ctx);
	}

	@Override
	public ExternalDataTable newSchemaDataTable() {
		return new ExternalDataTable(this, null);
	}

	@Override
	protected ExternalDataTable newSchemaDataTable(final Object[][] data) {
		return new ExternalDataTable(this, data);
	}

	@Override
	public ExternalDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ExternalDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
