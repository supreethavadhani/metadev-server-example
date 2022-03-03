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
 * class that represents structure of studentDetail
 */ 
public class StudentDetailSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("studentId", 0, DefinedDataTypes.flexibleId, "-1", null, null, "student_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("departmentId", 2, DefinedDataTypes.id, null, null, "departmentList", "department_id", ColumnType.RequiredData), 
			new DbField("departmentName", 3, DefinedDataTypes.text, null, null, null, "department_name", ColumnType.RequiredData), 
			new DbField("usn", 4, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("name", 5, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("phoneNumber", 6, DefinedDataTypes.phone, null, null, null, "phone_number", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT student_id, institute_id, department_id, department_name, usn, name, phone_number FROM student_details";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final  String INSERT = "INSERT INTO student_details(student_id, institute_id, department_id, department_name, usn, name, phone_number) values (?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final String WHERE = " WHERE student_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE student_details SET department_id= ? , department_name= ? , usn= ? , name= ? , phone_number= ?  WHERE student_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 0, 1};
	private static final String DELETE = "DELETE FROM student_details";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public StudentDetailSchema() {
		this.name = "studentDetail";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "student_details";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(7, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public StudentDetailData newSchemaData() {
		return new StudentDetailData(this, null);
	}

	@Override
	protected StudentDetailData newSchemaData(final Object[] data) {
		return new StudentDetailData(this, data);
	}

	@Override
	public StudentDetailData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (StudentDetailData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public StudentDetailData parseKeys(JsonObject json, IServiceContext ctx) {
		return (StudentDetailData) super.parseKeys(json, ctx);
	}

	@Override
	public StudentDetailDataTable newSchemaDataTable() {
		return new StudentDetailDataTable(this, null);
	}

	@Override
	protected StudentDetailDataTable newSchemaDataTable(final Object[][] data) {
		return new StudentDetailDataTable(this, data);
	}

	@Override
	public StudentDetailDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (StudentDetailDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
