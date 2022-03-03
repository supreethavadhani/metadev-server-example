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
 * class that represents structure of student
 */ 
public class StudentSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("studentId", 0, DefinedDataTypes.flexibleId, "-1", null, null, "student_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("departmentId", 2, DefinedDataTypes.id, null, null, "departmentList", "department_id", ColumnType.RequiredData), 
			new DbField("programId", 3, DefinedDataTypes.id, null, null, null, "program_id", ColumnType.RequiredData), 
			new DbField("levelId", 4, DefinedDataTypes.id, null, null, null, "level_id", ColumnType.RequiredData), 
			new DbField("levelSectionId", 5, DefinedDataTypes.id, null, null, null, "level_section_id", ColumnType.RequiredData), 
			new DbField("tempUsn", 6, DefinedDataTypes.text, null, null, null, "temp_usn", ColumnType.RequiredData), 
			new DbField("usn", 7, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("name", 8, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("presentAddressLine1", 9, DefinedDataTypes.desc, null, null, null, "present_address_line1", ColumnType.RequiredData), 
			new DbField("presentAddressLine2", 10, DefinedDataTypes.desc, null, null, null, "present_address_line2", ColumnType.OptionalData), 
			new DbField("presentCity", 11, DefinedDataTypes.name, null, null, null, "present_city", ColumnType.RequiredData), 
			new DbField("presentState", 12, DefinedDataTypes.state, null, null, null, "present_state", ColumnType.RequiredData), 
			new DbField("presentPincode", 13, DefinedDataTypes.pin, null, null, null, "present_pincode", ColumnType.RequiredData), 
			new DbField("presentCountry", 14, DefinedDataTypes.country, "130", null, null, "present_country", ColumnType.RequiredData), 
			new DbField("addressLine1", 15, DefinedDataTypes.desc, null, null, null, "address_line1", ColumnType.RequiredData), 
			new DbField("addressLine2", 16, DefinedDataTypes.desc, null, null, null, "address_line2", ColumnType.OptionalData), 
			new DbField("city", 17, DefinedDataTypes.name, null, null, null, "city", ColumnType.RequiredData), 
			new DbField("state", 18, DefinedDataTypes.state, null, null, null, "state", ColumnType.RequiredData), 
			new DbField("pincode", 19, DefinedDataTypes.pin, null, null, null, "pincode", ColumnType.RequiredData), 
			new DbField("country", 20, DefinedDataTypes.country, "130", null, null, "country", ColumnType.RequiredData), 
			new DbField("phoneNumber", 21, DefinedDataTypes.phone, null, null, null, "phone_number", ColumnType.RequiredData), 
			new DbField("email", 22, DefinedDataTypes.email, null, null, null, "email", ColumnType.RequiredData), 
			new DbField("gender", 23, DefinedDataTypes.gender, null, null, "gender", "gender", ColumnType.RequiredData), 
			new DbField("admissionQuota", 24, DefinedDataTypes.text, null, null, "admissionQuota", "admission_quota", ColumnType.RequiredData), 
			new DbField("admissionDate", 25, DefinedDataTypes.date, null, null, null, "admission_date", ColumnType.RequiredData), 
			new DbField("bloodGroup", 26, DefinedDataTypes.text, null, null, "bloodGroup", "blood_group", ColumnType.OptionalData), 
			new DbField("religion", 27, DefinedDataTypes.text, null, null, "religion", "religion", ColumnType.RequiredData), 
			new DbField("caste", 28, DefinedDataTypes.text, null, null, null, "caste", ColumnType.RequiredData), 
			new DbField("nationality", 29, DefinedDataTypes.text, null, null, null, "nationality", ColumnType.RequiredData), 
			new DbField("category", 30, DefinedDataTypes.text, null, null, null, "category", ColumnType.RequiredData), 
			new DbField("personalId", 31, DefinedDataTypes.uniqueId, null, null, null, "personal_id", ColumnType.RequiredData), 
			new DbField("dateOfBirth", 32, DefinedDataTypes.date, null, null, null, "date_of_birth", ColumnType.RequiredData), 
			new DbField("placeOfBirth", 33, DefinedDataTypes.text, null, null, null, "place_of_birth", ColumnType.RequiredData), 
			new DbField("domicileState", 34, DefinedDataTypes.state, null, null, "domicileState", "domicile_state", ColumnType.RequiredData), 
			new DbField("previousBoard", 35, DefinedDataTypes.text, null, null, null, "previous_board", ColumnType.RequiredData), 
			new DbField("previousClass", 36, DefinedDataTypes.text, null, null, null, "previous_class", ColumnType.RequiredData), 
			new DbField("previousInstitute", 37, DefinedDataTypes.text, null, null, null, "previous_institute", ColumnType.OptionalData), 
			new DbField("qualifyingExamRank", 38, DefinedDataTypes.text, null, null, null, "qualifying_exam_rank", ColumnType.RequiredData), 
			new DbField("isActive", 39, DefinedDataTypes.bool, "true", null, null, "is_active", ColumnType.OptionalData), 
			new DbField("createdAt", 40, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 41, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT student_id, institute_id, department_id, program_id, level_id, level_section_id, temp_usn, usn, name, present_address_line1, present_address_line2, present_city, present_state, present_pincode, present_country, address_line1, address_line2, city, state, pincode, country, phone_number, email, gender, admission_quota, admission_date, blood_group, religion, caste, nationality, category, personal_id, date_of_birth, place_of_birth, domicile_state, previous_board, previous_class, previous_institute, qualifying_exam_rank, is_active, created_at, updated_at FROM students";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41};
	private static final  String INSERT = "INSERT INTO students(student_id, institute_id, department_id, program_id, level_id, level_section_id, temp_usn, usn, name, present_address_line1, present_address_line2, present_city, present_state, present_pincode, present_country, address_line1, address_line2, city, state, pincode, country, phone_number, email, gender, admission_quota, admission_date, blood_group, religion, caste, nationality, category, personal_id, date_of_birth, place_of_birth, domicile_state, previous_board, previous_class, previous_institute, qualifying_exam_rank, is_active, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39};
	private static final String WHERE = " WHERE student_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE students SET department_id= ? , program_id= ? , level_id= ? , level_section_id= ? , temp_usn= ? , usn= ? , name= ? , present_address_line1= ? , present_address_line2= ? , present_city= ? , present_state= ? , present_pincode= ? , present_country= ? , address_line1= ? , address_line2= ? , city= ? , state= ? , pincode= ? , country= ? , phone_number= ? , email= ? , gender= ? , admission_quota= ? , admission_date= ? , blood_group= ? , religion= ? , caste= ? , nationality= ? , category= ? , personal_id= ? , date_of_birth= ? , place_of_birth= ? , domicile_state= ? , previous_board= ? , previous_class= ? , previous_institute= ? , qualifying_exam_rank= ? , is_active= ? , updated_at= CURRENT_TIMESTAMP  WHERE student_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 0, 1};
	private static final String DELETE = "DELETE FROM students";
	private static final IValidation[] VALIDS = {new DependentListValidation(3, 2, "programList", "programId", null),
		new DependentListValidation(4, 3, "programLevelList", "levelId", null),
		new DependentListValidation(5, 4, "levelSectionList", "levelSectionId", null),
		new DependentListValidation(12, 14, "state", "presentState", null),
		new DependentListValidation(18, 20, "state", "state", null)
	};

	/**
	 *
	 */
	public StudentSchema() {
		this.name = "student";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "students";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(42, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public StudentData newSchemaData() {
		return new StudentData(this, null);
	}

	@Override
	protected StudentData newSchemaData(final Object[] data) {
		return new StudentData(this, data);
	}

	@Override
	public StudentData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (StudentData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public StudentData parseKeys(JsonObject json, IServiceContext ctx) {
		return (StudentData) super.parseKeys(json, ctx);
	}

	@Override
	public StudentDataTable newSchemaDataTable() {
		return new StudentDataTable(this, null);
	}

	@Override
	protected StudentDataTable newSchemaDataTable(final Object[][] data) {
		return new StudentDataTable(this, data);
	}

	@Override
	public StudentDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (StudentDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
