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
 * class that represents structure of staff
 */ 
public class StaffSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("staffId", 0, DefinedDataTypes.flexibleId, "-1", null, null, "staff_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("departmentId", 2, DefinedDataTypes.id, null, null, "departmentList", "department_id", ColumnType.RequiredData), 
			new DbField("empId", 3, DefinedDataTypes.text, null, null, null, "emp_id", ColumnType.RequiredData), 
			new DbField("firstName", 4, DefinedDataTypes.name, null, null, null, "first_name", ColumnType.RequiredData), 
			new DbField("middleName", 5, DefinedDataTypes.name, null, null, null, "middle_name", ColumnType.OptionalData), 
			new DbField("lastName", 6, DefinedDataTypes.name, null, null, null, "last_name", ColumnType.RequiredData), 
			new DbField("displayName", 7, DefinedDataTypes.name, null, null, null, "display_name", ColumnType.RequiredData), 
			new DbField("spouseName", 8, DefinedDataTypes.name, null, null, null, "spouse_name", ColumnType.OptionalData), 
			new DbField("fatherName", 9, DefinedDataTypes.name, null, null, null, "father_name", ColumnType.RequiredData), 
			new DbField("addressLine1", 10, DefinedDataTypes.text, null, null, null, "address_line1", ColumnType.RequiredData), 
			new DbField("addressLine2", 11, DefinedDataTypes.text, null, null, null, "address_line2", ColumnType.OptionalData), 
			new DbField("city", 12, DefinedDataTypes.name, null, null, null, "city", ColumnType.RequiredData), 
			new DbField("state", 13, DefinedDataTypes.state, null, null, null, "state", ColumnType.RequiredData), 
			new DbField("pincode", 14, DefinedDataTypes.pin, null, null, null, "pincode", ColumnType.RequiredData), 
			new DbField("country", 15, DefinedDataTypes.country, "130", null, null, "country", ColumnType.RequiredData), 
			new DbField("phoneNumber", 16, DefinedDataTypes.phone, null, null, null, "phone_number", ColumnType.RequiredData), 
			new DbField("email", 17, DefinedDataTypes.email, null, null, null, "email", ColumnType.RequiredData), 
			new DbField("gender", 18, DefinedDataTypes.gender, null, null, "gender", "gender", ColumnType.RequiredData), 
			new DbField("dateOfBirth", 19, DefinedDataTypes.date, null, null, null, "date_of_birth", ColumnType.RequiredData), 
			new DbField("dateOfJoining", 20, DefinedDataTypes.date, null, null, null, "date_of_joining", ColumnType.RequiredData), 
			new DbField("dateOfLeaving", 21, DefinedDataTypes.date, null, null, null, "date_of_leaving", ColumnType.OptionalData), 
			new DbField("reasonForLeaving", 22, DefinedDataTypes.text, null, null, null, "reason_for_leaving", ColumnType.OptionalData), 
			new DbField("createdAt", 23, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 24, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT staff_id, institute_id, department_id, emp_id, first_name, middle_name, last_name, display_name, spouse_name, father_name, address_line1, address_line2, city, state, pincode, country, phone_number, email, gender, date_of_birth, date_of_joining, date_of_leaving, reason_for_leaving, created_at, updated_at FROM staffs";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
	private static final  String INSERT = "INSERT INTO staffs(staff_id, institute_id, department_id, emp_id, first_name, middle_name, last_name, display_name, spouse_name, father_name, address_line1, address_line2, city, state, pincode, country, phone_number, email, gender, date_of_birth, date_of_joining, date_of_leaving, reason_for_leaving, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
	private static final String WHERE = " WHERE staff_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE staffs SET department_id= ? , emp_id= ? , first_name= ? , middle_name= ? , last_name= ? , display_name= ? , spouse_name= ? , father_name= ? , address_line1= ? , address_line2= ? , city= ? , state= ? , pincode= ? , country= ? , phone_number= ? , email= ? , gender= ? , date_of_birth= ? , date_of_joining= ? , date_of_leaving= ? , reason_for_leaving= ? , updated_at= CURRENT_TIMESTAMP  WHERE staff_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 0, 1};
	private static final String DELETE = "DELETE FROM staffs";
	private static final IValidation[] VALIDS = {new DependentListValidation(13, 15, "state", "state", null)
	};

	/**
	 *
	 */
	public StaffSchema() {
		this.name = "staff";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "staffs";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(25, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public StaffData newSchemaData() {
		return new StaffData(this, null);
	}

	@Override
	protected StaffData newSchemaData(final Object[] data) {
		return new StaffData(this, data);
	}

	@Override
	public StaffData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (StaffData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public StaffData parseKeys(JsonObject json, IServiceContext ctx) {
		return (StaffData) super.parseKeys(json, ctx);
	}

	@Override
	public StaffDataTable newSchemaDataTable() {
		return new StaffDataTable(this, null);
	}

	@Override
	protected StaffDataTable newSchemaDataTable(final Object[][] data) {
		return new StaffDataTable(this, data);
	}

	@Override
	public StaffDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (StaffDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
