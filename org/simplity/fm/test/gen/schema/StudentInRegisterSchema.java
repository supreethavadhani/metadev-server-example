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
 * class that represents structure of studentInRegister
 */ 
public class StudentInRegisterSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.PrimaryKey), 
			new DbField("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.OptionalData), 
			new DbField("subjectSectionId", 2, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.OptionalData), 
			new DbField("instituteId", 3, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("studentId", 4, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.OptionalData), 
			new DbField("name", 5, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("usn", 6, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("cieMarks", 7, DefinedDataTypes.integer, null, null, null, "cie_marks", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, false, false, true, false};
	private static final String SELECT = "SELECT subject_register_id, offered_subject_id, subject_section_id, institute_id, student_id, name, usn, cie_marks FROM student_in_registers";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final  String INSERT = "INSERT INTO student_in_registers(subject_register_id, offered_subject_id, subject_section_id, institute_id, student_id, name, usn, cie_marks) values (?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final String WHERE = " WHERE subject_register_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 3};
	private static final  String UPDATE = "UPDATE student_in_registers SET offered_subject_id= ? , subject_section_id= ? , student_id= ? , name= ? , usn= ? , cie_marks= ?  WHERE subject_register_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {1, 2, 4, 5, 6, 7, 0, 3};
	private static final String DELETE = "DELETE FROM student_in_registers";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public StudentInRegisterSchema() {
		this.name = "studentInRegister";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "student_in_registers";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(8, this.fields[3], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public StudentInRegisterData newSchemaData() {
		return new StudentInRegisterData(this, null);
	}

	@Override
	protected StudentInRegisterData newSchemaData(final Object[] data) {
		return new StudentInRegisterData(this, data);
	}

	@Override
	public StudentInRegisterData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (StudentInRegisterData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public StudentInRegisterData parseKeys(JsonObject json, IServiceContext ctx) {
		return (StudentInRegisterData) super.parseKeys(json, ctx);
	}

	@Override
	public StudentInRegisterDataTable newSchemaDataTable() {
		return new StudentInRegisterDataTable(this, null);
	}

	@Override
	protected StudentInRegisterDataTable newSchemaDataTable(final Object[][] data) {
		return new StudentInRegisterDataTable(this, data);
	}

	@Override
	public StudentInRegisterDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (StudentInRegisterDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
