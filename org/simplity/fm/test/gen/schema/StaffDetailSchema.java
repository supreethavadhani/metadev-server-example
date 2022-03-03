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
 * class that represents structure of staffDetail
 */ 
public class StaffDetailSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("staffId", 0, DefinedDataTypes.flexibleId, null, null, null, "staff_id", ColumnType.PrimaryKey), 
			new DbField("empId", 1, DefinedDataTypes.text, null, null, null, "emp_id", ColumnType.RequiredData), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("departmentName", 3, DefinedDataTypes.text, null, null, null, "department_name", ColumnType.RequiredData), 
			new DbField("departmentId", 4, DefinedDataTypes.id, null, null, null, "department_id", ColumnType.RequiredData), 
			new DbField("firstName", 5, DefinedDataTypes.name, null, null, null, "first_name", ColumnType.RequiredData), 
			new DbField("middleName", 6, DefinedDataTypes.name, null, null, null, "middle_name", ColumnType.RequiredData), 
			new DbField("lastName", 7, DefinedDataTypes.name, null, null, null, "last_name", ColumnType.OptionalData), 
			new DbField("displayName", 8, DefinedDataTypes.name, null, null, null, "display_name", ColumnType.RequiredData), 
			new DbField("email", 9, DefinedDataTypes.email, null, null, null, "email", ColumnType.RequiredData), 
			new DbField("phoneNumber", 10, DefinedDataTypes.phone, null, null, null, "phone_number", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, false, false, true, false};
	private static final String SELECT = "SELECT staff_id, emp_id, institute_id, department_name, department_id, first_name, middle_name, last_name, display_name, email, phone_number FROM staff_details";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static final  String INSERT = "INSERT INTO staff_details(staff_id, emp_id, institute_id, department_name, department_id, first_name, middle_name, last_name, display_name, email, phone_number) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static final String WHERE = " WHERE staff_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 2};
	private static final  String UPDATE = "UPDATE staff_details SET emp_id= ? , department_name= ? , department_id= ? , first_name= ? , middle_name= ? , last_name= ? , display_name= ? , email= ? , phone_number= ?  WHERE staff_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {1, 3, 4, 5, 6, 7, 8, 9, 10, 0, 2};
	private static final String DELETE = "DELETE FROM staff_details";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public StaffDetailSchema() {
		this.name = "staffDetail";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "staff_details";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(11, this.fields[2], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public StaffDetailData newSchemaData() {
		return new StaffDetailData(this, null);
	}

	@Override
	protected StaffDetailData newSchemaData(final Object[] data) {
		return new StaffDetailData(this, data);
	}

	@Override
	public StaffDetailData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (StaffDetailData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public StaffDetailData parseKeys(JsonObject json, IServiceContext ctx) {
		return (StaffDetailData) super.parseKeys(json, ctx);
	}

	@Override
	public StaffDetailDataTable newSchemaDataTable() {
		return new StaffDetailDataTable(this, null);
	}

	@Override
	protected StaffDetailDataTable newSchemaDataTable(final Object[][] data) {
		return new StaffDetailDataTable(this, data);
	}

	@Override
	public StaffDetailDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (StaffDetailDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
